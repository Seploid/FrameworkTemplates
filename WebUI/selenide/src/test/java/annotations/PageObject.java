package annotations;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Note#4
 * Specific component annotation for Page Objects.
 * You could implement BeanPostProcessor interface to add initialization of page object.
 */
@Target(TYPE)
@Retention(RUNTIME)
@Component
@Lazy
public @interface PageObject {
}
