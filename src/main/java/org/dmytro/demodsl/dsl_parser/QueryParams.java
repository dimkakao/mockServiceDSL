package org.dmytro.demodsl.dsl_parser;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class QueryParams {
    private List<QueryParam> params;

    public QueryParams() {
        this.params = new ArrayList<>();
    }

    public void addQueryParam(QueryParam queryParam) {
        params.add(queryParam);
    }
}