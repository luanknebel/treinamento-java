package br.com.treinamento.jakarta.resource.json;

import jakarta.json.bind.serializer.JsonbSerializer;
import jakarta.json.bind.serializer.SerializationContext;
import jakarta.json.stream.JsonGenerator;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeSerializer implements JsonbSerializer<LocalDateTime> {

    private static final String DATE_FORMAT = "dd/MM/yyyy HH:mm:ss";

    @Override
    public void serialize(LocalDateTime field, JsonGenerator generator, SerializationContext ctx) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
        String formattedDateTime = field.format(formatter);
        generator.write(formattedDateTime);
    }
}
