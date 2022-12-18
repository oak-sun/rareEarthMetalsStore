package rare.earth.metals.checkmetalservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Metal {
    private int id;
    private String name;
    private String properties;
    private String status;
    private int price;
}
