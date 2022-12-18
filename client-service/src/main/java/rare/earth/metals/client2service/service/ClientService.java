package rare.earth.metals.client2service.service;

import lombok.AllArgsConstructor;
import rare.earth.metals.client2service.connector.MetalServiceConnector;
import rare.earth.metals.client2service.model.Metal;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
@AllArgsConstructor
public class ClientService {

    private final Logger LOG = java.util
            .logging
            .Logger
            .getLogger(ClientService.class.getName());

    @Value("${book-service.url}")
    private String metalServiceUrl;

    private final RestTemplate template;
    private final MetalServiceConnector connector;

    @HystrixCommand(fallbackMethod = "failed")
    public List<Metal> getAllMetalsByFeign() {
        return connector.getAllMetalsList();
    }

    public String getAllMetalsByRestTemplate() {
        return template
                .getForObject(metalServiceUrl + "/data",
                                    String.class);
    }

    public List<Metal> failed() {
        var error = "Service is not available now. " +
                "Please try again later";
        LOG.log(Level.INFO, error);
        return new ArrayList<>();
    }
}
