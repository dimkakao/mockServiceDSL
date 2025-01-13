package org.dmytro.demodsl.validation_rule;

import lombok.*;
import org.dmytro.demodsl.validation_condition.ValidationCondition;

@Getter
@Setter
public class IsAbsentRequestBodyValidationRule extends RequestBodyValidationRule {

//    public IsAbsentRequestBodyValidationRule(boolean isNegated) {
//        super(ValidationCondition.IS_ABSENT, isNegated);
//    }

//    @Override
//    public boolean validate(String actualBody) {
//        boolean isAbsent = (actualBody == null || actualBody.isBlank());
//        return isNegated() ? !isAbsent : isAbsent;
//    }
}
