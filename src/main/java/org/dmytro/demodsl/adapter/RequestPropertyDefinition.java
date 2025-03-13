package org.dmytro.demodsl.adapter;

import lombok.Getter;
import org.dmytro.demodsl.entity.request_property.RequestProperty;

import java.util.List;

@Getter
public abstract class RequestPropertyDefinition <T extends RequestProperty> {

    protected List<RequestPropertyRule<T>> rules;

//    protected void addRule(RequestPropertyRule rule) {
//        rules.add(rule);
//    }
//
//    protected void addAllRules(List<RequestPropertyRule> rules) {
//        this.rules.addAll(rules);
//    }
}
