package de.fesere.hypermedia.cj.annotations;

import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface Data  {
   String name();
   String prompt() default "none";
}
