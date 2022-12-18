package rare.earth.metals.creationmetalservice.service;

import rare.earth.metals.creationmetalservice.model.Metal;
import rare.earth.metals.creationmetalservice.util.MetalGenerator;
import lombok.AllArgsConstructor;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@EnableBinding(Source.class)
@EnableScheduling
@Component
@AllArgsConstructor
public class CreationMetalService {

    private final Source source;
    private final MetalGenerator generator;

    @Scheduled(fixedRate = 10000)
    private void sendMessage() {
        Metal metal = generator.createNewMetal();
        source
                .output()
                .send(MessageBuilder
                        .withPayload(metal)
                        .build());
    }
}
