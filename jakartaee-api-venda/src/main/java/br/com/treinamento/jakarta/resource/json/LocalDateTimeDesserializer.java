package br.com.treinamento.jakarta.resource.json;

import jakarta.json.bind.serializer.DeserializationContext;
import jakarta.json.bind.serializer.JsonbDeserializer;
import jakarta.json.stream.JsonParser;

import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeDesserializer implements JsonbDeserializer<LocalDateTime> {

    private static final String DATE_FORMAT = "dd/MM/yyyy HH:mm:ss";

    @Override
    public LocalDateTime deserialize(JsonParser parser, DeserializationContext ctx, Type rtType) {
        String dateString = parser.getString();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
        return LocalDateTime.parse(dateString, formatter);
    }
}
