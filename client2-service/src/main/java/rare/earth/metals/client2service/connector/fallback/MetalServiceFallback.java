package rare.earth.metals.client2service.connector.fallback;


import rare.earth.metals.client2service.connector.MetalServiceConnector;
import rare.earth.metals.client2service.model.Metal;
import rare.earth.metals.client2service.service.Client2Service;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.logging.Logger;

@Component
public class MetalServiceFallback implements MetalServiceConnector {

    Logger logger = Logger
            .getLogger(MetalServiceFallback.class.getName());

    private Client2Service service;

    public MetalServiceFallback(Client2Service service) {
        this.service = service;
    }

    @Override
    public List<Metal> getAllMetalsList() {
        logger.info("ERROR: Service is not available now");
        logger.info("Calling metal-service-updater by Feign Client");
        return service.getAllMetalListFromFallback();
    }
}
