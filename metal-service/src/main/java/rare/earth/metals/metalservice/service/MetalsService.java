package rare.earth.metals.metalservice.service;

import rare.earth.metals.metalservice.dao.MetalDao;
import rare.earth.metals.metalservice.model.Metal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MetalsService {
   private final MetalDao dao;

    @Autowired
    public MetalsService(MetalDao dao) {
        this.dao = dao;
    }

    public List<Metal> findAllMetals() {
       return dao.findAll();
   }
}
