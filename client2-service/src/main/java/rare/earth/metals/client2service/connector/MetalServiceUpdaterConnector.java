package rare.earth.metals.client2service.connector;

import rare.earth.metals.client2service.config.FeignConfig;
import rare.earth.metals.client2service.connector.fallback.MetalServiceFallback;
import rare.earth.metals.client2service.model.Metal;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(
        name = "metal-service-updater",
        url = "${book-service-update.url}",
        configuration = FeignConfig.class,
        fallback = MetalServiceFallback.class
)
public interface MetalServiceUpdaterConnector {

    @GetMapping("/show")
    List<Metal> getAllMetalsList();
}
