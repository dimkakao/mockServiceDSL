package org.dmytro.demodsl.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import org.springframework.http.HttpStatus;

import java.io.IOException;

public class HttpStatusDeserializer extends JsonDeserializer<HttpStatus> {

    @Override
    public HttpStatus deserialize(JsonParser parser, DeserializationContext context) throws IOException {
        int code = parser.getIntValue();
        return HttpStatus.valueOf(code);
    }
}
