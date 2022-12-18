package rare.earth.metals.client2service.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@Document(collection = "rare-earth-metals")
public class Metal {

   @Id
   private String id;

   @NotBlank
   @Size(max = 10)
   private String title;

   @NotBlank
   @Size(max = 250)
   private String properties;

   private Long price;

   private String imageLink;
}
