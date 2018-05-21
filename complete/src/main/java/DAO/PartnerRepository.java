package DAO;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface PartnerRepository extends MongoRepository<Partner, String> {

	
	@Query("{ 'technologyTags.tagName' : ?0 }")
	List<Partner> findPartnersByTechnologyTags(String technologyTag_tagName);

	

   /* public Partner findByName(String name);
    public List<Partner> findName(String name);
*/
}
