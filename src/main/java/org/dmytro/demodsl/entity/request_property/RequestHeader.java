package org.dmytro.demodsl.entity.request_property;

import org.dmytro.demodsl.entity.Condition;

public class RequestHeader extends RequestProperty {

    public RequestHeader(String name, Condition condition) {
        super(name, condition);
    }

    @Override
    public String toString() {
        return "RequestHeaders{" +
                "name='" + name + '\'' +
                ", condition=\n" + condition +
                '}';
    }
}