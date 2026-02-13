package br.com.treinamento.jakarta.resource.providers;

import br.com.treinamento.jakarta.resource.json.LocalDateTimeDesserializer;
import br.com.treinamento.jakarta.resource.json.LocalDateTimeSerializer;
import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;
import jakarta.json.bind.JsonbConfig;
import jakarta.ws.rs.ext.ContextResolver;
import jakarta.ws.rs.ext.Provider;

@Provider
public class JsonbContextResolverProvider implements ContextResolver<Jsonb> {

    @Override
    public Jsonb getContext(Class<?> type) {
        JsonbConfig config = new JsonbConfig()
                .withSerializers(new LocalDateTimeSerializer())
                .withDeserializers(new LocalDateTimeDesserializer());
        return JsonbBuilder.create(config);
    }

}
