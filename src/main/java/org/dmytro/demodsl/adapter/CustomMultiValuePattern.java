package org.dmytro.demodsl.adapter;

import com.github.tomakehurst.wiremock.http.MultiValue;
import com.github.tomakehurst.wiremock.matching.MatchResult;
import com.github.tomakehurst.wiremock.matching.MultiValuePattern;
import com.github.tomakehurst.wiremock.matching.MultipleMatchMultiValuePattern;
import com.github.tomakehurst.wiremock.matching.StringValuePattern;
import com.github.tomakehurst.wiremock.stubbing.SubEvent;

import java.util.List;

public class CustomMultiValuePattern extends MultipleMatchMultiValuePattern {

    private String name;

    private List<CustomMultiValuePattern> customMultiValuePatterns;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getExpected() {
        return null;
    }

    @Override
    public MatchResult match(MultiValue multiValue) {
        return !multiValue.isPresent() ?

                MatchResult.of(false) :

                MatchResult.aggregate(
                        MatchResult.of(
                                this.customMultiValuePatterns.size() == multiValue.values().size()),
                        super.match(multiValue));
    }

    @Override
    public List<StringValuePattern> getValues() {
        return null;
    }
}
