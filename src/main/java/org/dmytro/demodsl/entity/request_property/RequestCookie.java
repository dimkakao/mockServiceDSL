package org.dmytro.demodsl.entity.request_property;

import org.dmytro.demodsl.entity.Condition;

public class RequestCookie extends RequestProperty {

    public RequestCookie(String name, Condition condition) {
        super(name, condition);
    }

    @Override
    public String toString() {
        return "RequestCookies{" +
                "name='" + name + '\'' +
                ", condition=\n" + condition +
                '}';
    }
}