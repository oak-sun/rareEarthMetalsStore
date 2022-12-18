package rare.earth.metals.metalserviceupdater.dao;

import rare.earth.metals.metalserviceupdater.model.Metal;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetalsDao extends MongoRepository<Metal, String> {
}
