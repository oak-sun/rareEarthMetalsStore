package rare.earth.metals.storemetalservice.controller;

import lombok.AllArgsConstructor;
import rare.earth.metals.storemetalservice.model.RemotePropertyField;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class StoreMetalServiceController {
   private RemotePropertyField field;

   @GetMapping(value = "/getRemoteField")
   public String getRemotePropertyField() {
       return "Data: " + field.getField();
   }
}
