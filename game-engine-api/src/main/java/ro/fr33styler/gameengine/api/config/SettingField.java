package ro.fr33styler.gameengine.api.config;

import org.apache.commons.lang.ArrayUtils;
import ro.fr33styler.gameengine.api.config.annotation.Comment;
import ro.fr33styler.gameengine.api.config.annotation.Setting;
import ro.fr33styler.gameengine.api.config.serialize.Configuration;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;

public final class SettingField {

    private final String id;
    private final Field field;
    private final String[] comments;
    private final Configuration configuration;

    private final Type genericType;

    private SettingField(Configuration configuration, Field field, String id) {
        this(configuration, field, id, field.getGenericType());
    }

    private SettingField(Configuration configuration, Field field, String id, Type genericType) {
        this.id = id;
        this.field = field;
        this.genericType = genericType;
        this.configuration = configuration;
        comments = processComments();
    }

    public String getId() {
        return id;
    }

    public Class<?> getType() {
        return field.getType();
    }

    public Type getGenericType() {
        return genericType;
    }

    public String[] getComments() {
        return comments;
    }

    private String[] processComments() {
        Comment comment = getAnnotation(Comment.class);
        return comment == null ? ArrayUtils.EMPTY_STRING_ARRAY : comment.value();
    }

    public Object get() throws InvalidConfigException {
        try {
            return field.get(configuration);
        } catch (IllegalAccessException exception) {
            throw new InvalidConfigException(exception.getMessage(), exception);
        }
    }

    public void set(Object object) throws InvalidConfigException {
        try {
            field.set(configuration, object);
        } catch (IllegalAccessException exception) {
            throw new InvalidConfigException(exception.getMessage(), exception);
        }
    }

    public Object newInstance() throws InvalidConfigException {
        try {
            return ((Class<?>) getGenericType()).getConstructor().newInstance();
        } catch (ReflectiveOperationException exception) {
            throw new InvalidConfigException(exception.getMessage(), exception);
        }
    }

    public SettingField modifiedClone(Type genericType) {
        return new SettingField(configuration, field, id, genericType);
    }

    public <T extends Annotation> T getAnnotation(Class<T> annotation) {
        return field.getAnnotation(annotation);
    }

    public Type[] getGenericParameters() {
        if (genericType instanceof ParameterizedType parameterizedType) {
            return parameterizedType.getActualTypeArguments();
        }
        return ArrayUtils.EMPTY_CLASS_ARRAY;
    }

    private static Deque<Class<?>> getAllClasses(Configuration configuration) {
        Deque<Class<?>> stack = new ArrayDeque<>();
        for (Class<?> clazz = configuration.getClass(); clazz != null; clazz = clazz.getSuperclass()) {
            stack.push(clazz);
        }
        return stack;
    }

    private static void collectAllSettings(Configuration configuration, Class<?> clazz, List<SettingField> fields) {
        for (Field field : clazz.getDeclaredFields()) {
            Setting setting = field.getAnnotation(Setting.class);
            if (setting != null && !Modifier.isFinal(field.getModifiers())) {
                field.setAccessible(true);
                fields.add(new SettingField(configuration, field, setting.value()));
            }
        }
    }

    public static List<SettingField> allOf(Configuration configuration) {
        List<SettingField> fields = new ArrayList<>();
        Deque<Class<?>> stack = getAllClasses(configuration);
        while (!stack.isEmpty()) {
            collectAllSettings(configuration, stack.pop(), fields);
        }
        return fields;
    }

}
