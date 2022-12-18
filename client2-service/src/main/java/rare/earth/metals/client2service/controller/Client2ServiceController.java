package rare.earth.metals.client2service.controller;

import lombok.AllArgsConstructor;
import rare.earth.metals.client2service.model.Metal;
import rare.earth.metals.client2service.service.Client2Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class Client2ServiceController {

    Logger logger = java.util
            .logging
            .Logger
            .getLogger(Client2ServiceController.class.getName());

    private final Client2Service service;

    @GetMapping("/getAllMetalsByFeignClient")
    public List<Metal> getAllMetals() {
        logger.info("Calling through Feign Client");
        return service.getAllMetalsList();
    }
}
