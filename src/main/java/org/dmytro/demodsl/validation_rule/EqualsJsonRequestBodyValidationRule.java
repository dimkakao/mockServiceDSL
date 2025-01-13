package org.dmytro.demodsl.validation_rule;

import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.dmytro.demodsl.validation_condition.ValidationCondition;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EqualsJsonRequestBodyValidationRule extends RequestBodyValidationRule {

    @NotBlank
    private String requestData;
    private Boolean ignoreArrayOrder = false;
    private Boolean ignoreExtraFields = false;

//    public EqualsJsonRequestBodyValidationRule(String requestData, boolean isNegated, boolean ignoreArrayOrder, boolean ignoreExtraFields) {
//        super(ValidationCondition.EQUALS_JSON, isNegated);
//        this.requestData = requestData;
//        this.ignoreArrayOrder = ignoreArrayOrder;
//        this.ignoreExtraFields = ignoreExtraFields;
//    }

//    private boolean equalsJson(String actualJson, String expectedJson) {
//        // Логіка для порівняння JSON. Можна використати бібліотеки, такі як Jackson або org.json.
//        try {
//            ObjectMapper objectMapper = new ObjectMapper();
//            JsonNode actualNode = objectMapper.readTree(actualJson);
//            JsonNode expectedNode = objectMapper.readTree(expectedJson);
//            return actualNode.equals(expectedNode);
//        } catch (Exception e) {
//            // У разі помилки парсингу вважати, що JSON не збігається
//            return false;
//        }
//    }
}
