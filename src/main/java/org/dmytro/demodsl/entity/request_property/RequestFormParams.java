package org.dmytro.demodsl.entity.request_property;

import org.dmytro.demodsl.entity.Condition;

public class RequestFormParams extends RequestProperty {

    public RequestFormParams(String name, Condition condition) {
        super(name, condition);
    }

    @Override
    public String toString() {
        return "RequestFormParams{" +
                "name='" + name + '\'' +
                ", condition=\n" + condition +
                '}';
    }
}