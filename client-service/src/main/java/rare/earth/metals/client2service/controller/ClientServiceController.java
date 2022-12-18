package rare.earth.metals.client2service.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import rare.earth.metals.client2service.model.Metal;
import rare.earth.metals.client2service.service.ClientService;
import java.util.List;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class ClientServiceController {

    private final ClientService service;
    private final RestTemplate template;

    @GetMapping("/getAllMetalsByFeignClient")
    public List<Metal> getAllMetals() {
        return service.getAllMetalsByFeign();
    }

    @GetMapping("/getAllMetalsByRestTemplate")
    public String data() {
        return service.getAllMetalsByRestTemplate();
    }

    @RequestMapping("/getInfoByRemote")
    public String getInfoFromMetalService() {
        return this
                .template
                .getForObject("http://metal-service/",
                        String.class);
    }
}
