package rare.earth.metals.creationmetalservice.util;

import rare.earth.metals.creationmetalservice.model.Metal;
import org.springframework.stereotype.Component;
import java.util.Random;

@Component
public class MetalGenerator {

    private final Random rnd = new Random();

    public Metal createNewMetal() {
        var randomId = rnd.nextInt();
        return Metal
                .builder()
                .id(randomId)
                .name("Metal name: " + randomId)
                .properties("Metal properties: " + randomId)
                .status("unchecked")
                .price(randomId++)
                .build();
    }
}
