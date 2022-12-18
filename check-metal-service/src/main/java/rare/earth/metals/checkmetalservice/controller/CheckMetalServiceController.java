package rare.earth.metals.checkmetalservice.controller;

import lombok.AllArgsConstructor;
import rare.earth.metals.checkmetalservice.model.RemotePropertyField;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CheckMetalServiceController {
   private RemotePropertyField field;

   @GetMapping(value = "/getRemoteField")
   public String getRemotePropertyField() {
       return "Data: " + field.getField();
   }
}
