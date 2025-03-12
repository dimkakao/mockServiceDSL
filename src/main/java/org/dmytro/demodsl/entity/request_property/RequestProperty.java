package org.dmytro.demodsl.entity.request_property;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.dmytro.demodsl.entity.Condition;

@Getter
@Setter
public abstract class RequestProperty {

    @NotBlank
    protected String name;
    @NotNull
    protected Condition condition;

    protected RequestProperty(String name, Condition condition) {
        this.name = name;
        this.condition = condition;
    }
}