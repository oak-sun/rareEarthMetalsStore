package rare.earth.metals.metalserviceupdater.service;

import rare.earth.metals.metalserviceupdater.dao.MetalsDao;
import rare.earth.metals.metalserviceupdater.model.Metal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MetalsService {
   @Autowired
   private MetalsDao dao;

   public List<Metal> findAllMetals() {
       return dao.findAll();
   }
}
