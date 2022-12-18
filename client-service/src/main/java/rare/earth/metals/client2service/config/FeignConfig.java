package rare.earth.metals.client2service.config;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {
   private ObjectMapper customObjectMapper() {
       var mapper = new ObjectMapper();
       mapper.configure(DeserializationFeature
                        .USE_BIG_DECIMAL_FOR_FLOATS, true);
       mapper.configure(DeserializationFeature
                        .FAIL_ON_INVALID_SUBTYPE, false);
       mapper.configure(DeserializationFeature
                        .FAIL_ON_UNKNOWN_PROPERTIES, false);
       mapper.registerModule(new JavaTimeModule());
       mapper.configure(SerializationFeature
                       .WRITE_DATES_AS_TIMESTAMPS, false);
       return mapper;
   }
}
