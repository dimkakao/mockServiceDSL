package org.dmytro.demodsl.dsl_parser;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.dmytro.demodsl.dsl_parser.condition_emun.RequestConditionType;

@Getter
@Setter
@NoArgsConstructor
public abstract class Condition {
    @ToString.Include
    protected boolean isNegated = false;
//    @ToString.Include
//    protected RequestConditionType requestConditionType;
}
