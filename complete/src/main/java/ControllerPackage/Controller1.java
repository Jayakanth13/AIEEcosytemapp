package ControllerPackage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import DAO.Industry;
import DAO.Partner;
import DAO.TechnologyTag;
import Service.Service1;

@RestController
public class Controller1 {

	@Autowired
	Service1 service;
	
	@RequestMapping(value="/callCreatePartner")
	public Partner callCreatePartner()
	{
		Partner partner = new Partner();
		
		partner.setPartnerId("2");
		partner.setName("JavaCan2");
		partner.setFoundingDate(LocalDate.now());
		partner.setFoundBy("JavaCan2");
		partner.setUrl("website.com");
		
		List<TechnologyTag> technologyTags = new ArrayList<TechnologyTag>();
		technologyTags.add(new TechnologyTag("1", "tag1"));
		technologyTags.add(new TechnologyTag("2", "tag2"));
		technologyTags.add(new TechnologyTag("3", "tag3"));
//		for (TechnologyTag tag : technologyTags)
//			tag.setPartner(partner);
		
		partner.setTechnologyTags(technologyTags);
		
		List<Industry> industies = new ArrayList<Industry>();
		industies.add(new Industry("1", "Industry1"));
		industies.add(new Industry("2", "Industry2"));
		industies.add(new Industry("3", "Industry3"));
		
		partner.setIndusties(industies);
		
//		List<Industry> industies2 = new ArrayList<Industry>();
//		industies2.add(new Industry("1", "Industry1"));
//		industies2.add(new Industry("2", "Industry2"));
//		industies2.add(new Industry("3", "Industry3"));
//		
		//return service.createPartner("2", "JavaCan2", LocalDate.now(), "JavaCan2", "website.com", technologyTags, industies);
		return service.createPartner(partner);
	}
	
	
	
	@RequestMapping(method = RequestMethod.POST,value="/search/getPartnersFromTag")
	public List<Partner> retrievePartnersFromTagSearch(String technologyTag) {
		
		System.out.println(":::::::::::::::::::::::"+technologyTag);
		return service.searchPartnersByTag(technologyTag);
	}
	

}
