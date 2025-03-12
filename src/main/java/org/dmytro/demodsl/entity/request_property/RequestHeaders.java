package org.dmytro.demodsl.entity.request_property;

import org.dmytro.demodsl.entity.Condition;

public class RequestHeaders extends RequestProperty {

    public RequestHeaders(String name, Condition condition) {
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