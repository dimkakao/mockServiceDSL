package org.dmytro.demodsl.entity.request_property;

import org.dmytro.demodsl.entity.Condition;
import org.dmytro.demodsl.util.StringUtils;


public class RequestQueryParam extends RequestProperty {

    public RequestQueryParam(String name, Condition condition) {
        super(name, condition);
    }

    @Override
    public String toString() {
        return "RequestQueryParam{" +
                "name='" + name + '\'' +
                ", condition=\n" + StringUtils.indent(condition.toString()) +
                '}';
    }
}




