package DAO;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.Id;

@Entity
public class Partner {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String partnerId;

	private String name;

	@Temporal(TemporalType.DATE)
	private LocalDate foundingDate;

	private String foundBy;
	private String url;

	@OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	private List<TechnologyTag> technologyTags;

	@OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	private List<Industry> industies;

	public Partner()
	{
		
	}
	
	public Partner(String partnerId, String name) {
		this.partnerId = partnerId;
		this.name = name;
	}

	public Partner(String partnerId, String name, LocalDate foundingDate, String foundBy, String url,
			List<TechnologyTag> technologyTags, List<Industry> industies) {
		super();
		this.partnerId = partnerId;
		this.name = name;
		this.foundingDate = foundingDate;
		this.foundBy = foundBy;
		this.url = url;
		this.technologyTags = technologyTags;
		this.industies = industies;
	}

	public String getPartnerId() {
		return partnerId;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getFoundingDate() {
		return foundingDate;
	}

	public void setFoundingDate(LocalDate foundingDate) {
		this.foundingDate = foundingDate;
	}

	public String getFoundBy() {
		return foundBy;
	}

	public void setFoundBy(String foundBy) {
		this.foundBy = foundBy;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<TechnologyTag> getTechnologyTags() {
		return technologyTags;
	}

	public void setTechnologyTags(List<TechnologyTag> technologyTags) {
		this.technologyTags = technologyTags;
	}

	public List<Industry> getIndusties() {
		return industies;
	}

	public void setIndusties(List<Industry> industies) {
		this.industies = industies;
	}

}
