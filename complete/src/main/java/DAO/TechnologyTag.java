package DAO;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.Id;

@Entity
public class TechnologyTag {

	@Id
	private String technologyTagId;

	@ManyToOne(fetch = FetchType.EAGER)
	private Partner partner;

	private String tagName;

	public TechnologyTag() {

	}

	public TechnologyTag(String technologyTagId, String tagName) {
		super();
		this.technologyTagId = technologyTagId;
		this.tagName = tagName;
	}

	public String getTechnologyTagId() {
		return technologyTagId;
	}

	public void setTechnologyTagId(String technologyTagId) {
		this.technologyTagId = technologyTagId;
	}

	public Partner getPartner() {
		return partner;
	}

	public void setPartner(Partner partner) {
		this.partner = partner;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

}
