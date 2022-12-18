package rare.earth.metals.metalservice.controller;

import rare.earth.metals.metalservice.model.Metal;
import rare.earth.metals.metalservice.service.MetalsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/")
public class MetalsController {
    Logger logger = java.util
            .logging
            .Logger
            .getLogger(MetalsController.class.getName());

   private final Environment environment;
   private final MetalsService service;

   @Autowired
    public MetalsController(Environment environment,
                            MetalsService service) {
        this.environment = environment;
        this.service = service;
    }

    @RequestMapping("/")
   public String home() {
       var home = "Metal-Service running at port: "
               + environment
                .getProperty("local.server.port");
       logger.info(home);
       return home;
   }

   @GetMapping(path = "/show")
   public List<Metal> getAllMetalsList() {
       logger.info(
               "Get data from database " +
                       "(Feign Client on client-service side)");
       return service.findAllMetals();
   }

   @GetMapping("/data")
   public List<Metal> data() {
       logger.info(
               "Get data from database " +
                       "(RestTemplate on client-service side)");
       return service.findAllMetals();
   }
}
