package rare.earth.metals.metalservice.dao;

import rare.earth.metals.metalservice.model.Metal;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetalDao extends MongoRepository<Metal, String> {
}
