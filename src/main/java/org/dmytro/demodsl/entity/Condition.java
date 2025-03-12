package org.dmytro.demodsl.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
public abstract class Condition {
    @ToString.Include
    protected boolean isNegated = false;
//    @ToString.Include
//    protected RequestConditionType requestConditionType;
}
