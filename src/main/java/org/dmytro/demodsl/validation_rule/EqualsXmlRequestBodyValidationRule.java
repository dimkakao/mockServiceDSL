package org.dmytro.demodsl.validation_rule;

import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.dmytro.demodsl.validation_condition.ValidationCondition;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EqualsXmlRequestBodyValidationRule extends RequestBodyValidationRule {
    @NotBlank
    private String requestData;
    private Boolean enablePlaceholders = false;

//    @Override
//    public boolean validate(String actualXml) {
//        if (isNegated()) {
//            return !equalsXml(actualXml, requestData);
//        } else {
//            return equalsXml(actualXml, requestData);
//        }
//    }

//    private boolean equalsXml(String actualXml, String expectedXml) {
//        try {
//            // Логіка для порівняння XML. Використовуємо бібліотеку org.w3c.dom.
//            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//            DocumentBuilder builder = factory.newDocumentBuilder();
//
//            Document actualDoc = builder.parse(new InputSource(new StringReader(actualXml)));
//            Document expectedDoc = builder.parse(new InputSource(new StringReader(expectedXml)));
//
//            return actualDoc.isEqualNode(expectedDoc);
//        } catch (Exception e) {
//            return false;
//        }
//    }
}
