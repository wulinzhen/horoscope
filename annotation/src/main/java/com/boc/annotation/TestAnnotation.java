package com.boc.annotation;

import java.lang.annotation.*;

@Documented
@Inherited
@Target({ ElementType.FIELD, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface TestAnnotation {
    String value() default "value";
}
