package rare.earth.metals.client2service.connector;

import rare.earth.metals.client2service.config.FeignConfig;
import rare.earth.metals.client2service.model.Metal;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@FeignClient(
        name = "metal-service",
        url = "${metal-service.url}",
        configuration = FeignConfig.class
)
public interface MetalServiceConnector {

    @GetMapping("/show")
    List<Metal> getAllMetalsList();
}
