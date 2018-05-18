package Service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DAO.Industry;
import DAO.Partner;
import DAO.PartnerRepository;
import DAO.TechnologyTag;

@Service
public class Service1 {
	
	
	@Autowired
	private PartnerRepository repository;

	public Partner createPartner(Partner partner)
	{
		return repository.save(partner);
	}
	
	public Partner createPartner(String partnerId, String name, LocalDate foundingDate, String foundBy, String url,
			List<TechnologyTag> technologyTags, List<Industry> industies) {
		
		
		Partner partner = new Partner(partnerId,name,foundingDate,foundBy, url, technologyTags, industies);

		
		
		
		return repository.save(partner);

	}

	public List<Partner> searchPartnersByTag(String technologyTag_tagName) {
		
		System.out.println(repository.findPartnersByTechnologyTags(technologyTag_tagName));
		
		return repository.findPartnersByTechnologyTags(technologyTag_tagName);
	}

	

	

}
