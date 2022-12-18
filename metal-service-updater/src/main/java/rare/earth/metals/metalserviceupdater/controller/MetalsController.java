package rare.earth.metals.metalserviceupdater.controller;

import rare.earth.metals.metalserviceupdater.model.Metal;
import rare.earth.metals.metalserviceupdater.service.MetalsService;
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

   @Autowired
   private Environment environment;
   @Autowired
   private MetalsService service;

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
