package rare.earth.metals.client2service.service;

import lombok.AllArgsConstructor;
import rare.earth.metals.client2service.connector.MetalServiceConnector;
import rare.earth.metals.client2service.connector.MetalServiceUpdaterConnector;
import rare.earth.metals.client2service.model.Metal;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.logging.Logger;

@Service
@AllArgsConstructor
public class Client2Service {

    private static final Logger LOG = Logger
            .getLogger(Client2Service.class.getName());

    private MetalServiceConnector connector;
    private MetalServiceUpdaterConnector updaterConnector;


    @HystrixCommand(fallbackMethod = "getAllMetalListFromFallback")
    public List<Metal> getAllMetalsList() {
        return connector.getAllMetalsList();
    }

    public List<Metal> getAllMetalListFromFallback() {
        return updaterConnector.getAllMetalsList();
    }
}
