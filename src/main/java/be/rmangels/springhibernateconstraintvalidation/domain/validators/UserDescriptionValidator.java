package be.rmangels.springhibernateconstraintvalidation.domain.validators;

import be.rmangels.springhibernateconstraintvalidation.services.DescriptionService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UserDescriptionValidator implements ConstraintValidator<UserDescription, String> {

    @Autowired
    private DescriptionService descriptionService;

    @Override
    public void initialize(UserDescription userDescription) {
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return descriptionService.isDescriptionValid();
    }
}
