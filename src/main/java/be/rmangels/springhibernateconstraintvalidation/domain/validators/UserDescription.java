package be.rmangels.springhibernateconstraintvalidation.domain.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Target({FIELD, ANNOTATION_TYPE})
@Constraint(validatedBy = UserDescriptionValidator.class)
@Documented
public @interface UserDescription {
    String USER_DESCRIPTION_INCORRECT = "User description incorrect";

    String message() default USER_DESCRIPTION_INCORRECT;

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
