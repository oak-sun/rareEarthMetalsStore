package rare.earth.metals.checkmetalservice.service;

import rare.earth.metals.checkmetalservice.model.Metal;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Service;

@EnableBinding(Processor.class)
@MessageEndpoint
@Service
public class CheckMetalService {

    @StreamListener(Processor.INPUT)
    @SendTo(Processor.OUTPUT)
    public Metal updateMetal(Metal recievedMetal) {

        return Metal
                .builder()
                .id(recievedMetal.getId())
                .name(recievedMetal.getName())
                .properties(recievedMetal.getProperties())
                .status("checked")
                .price(recievedMetal.getPrice())
                .build();
    }
}
