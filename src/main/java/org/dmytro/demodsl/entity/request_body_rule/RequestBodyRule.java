package org.dmytro.demodsl.entity.request_body_rule;

import jakarta.validation.constraints.NotNull;

public abstract class RequestBodyRule {

    @NotNull
    protected Boolean isNegated = false;

    public void setNegated(Boolean negated) {
        isNegated = negated;
    }
}
