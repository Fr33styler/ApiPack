package ro.fr33styler.gameengine.api.config.annotation.bounded;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface BoundedDouble {

    double min() default Double.MIN_VALUE;

    double max() default Double.MAX_VALUE;

}
