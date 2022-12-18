package rare.earth.metals.storemetalservice.service;

import rare.earth.metals.storemetalservice.model.Metal;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
@EnableBinding(Sink.class)
@MessageEndpoint
public class StoreMetalService {

    Logger logger = Logger
            .getLogger(StoreMetalService.class.getName());

    @StreamListener(Sink.INPUT)
    public void logInputMessage(Metal recievedMetal) {
        logger.info("Input message processing: "
                + recievedMetal);
    }
}
