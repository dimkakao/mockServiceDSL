package org.dmytro.demodsl.validation_rule;

import lombok.*;

@Getter
@Setter
public class IsPresentRequestBodyValidationRule extends RequestBodyValidationRule {

//    public IsPresentRequestBodyValidationRule(boolean isNegated) {
//        super(ValidationCondition.IS_PRESENT, isNegated);
//    }

//    @Override
//    public boolean validate(String actualBody) {
//        boolean isPresent = (actualBody != null && !actualBody.isBlank());
//        return isNegated() ? !isPresent : isPresent;
//    }
}
