package com.rest.representations;

import org.joda.time.DateTime;
import java.io.IOException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class CustomDateSerializer extends JsonSerializer<DateTime> {

    @Override
    public void serialize(DateTime value, JsonGenerator gen, 
                          SerializerProvider arg2)
        throws IOException, JsonProcessingException {

        gen.writeString(value.toString("dd-MM-yyyy"));
    }
}
