package com.nikitakozlov.pury.method;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.CONSTRUCTOR, ElementType.METHOD })
public @interface ProfileMethod {
    String methodId() default "";
    int runsCounter() default 1;
}