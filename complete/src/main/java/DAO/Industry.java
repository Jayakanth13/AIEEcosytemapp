package DAO;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.Id;

@Entity
public class Industry {

	@Id
	private String industryId;

	private String industryName;

	@ManyToOne(fetch = FetchType.EAGER)
	private Partner partner;

	public Industry() {

	}

	public Industry(String industryId, String industryName) {
		super();
		this.industryId = industryId;
		this.industryName = industryName;
	}

	public String getIndustryId() {
		return industryId;
	}

	public void setIndustryId(String industryId) {
		this.industryId = industryId;
	}

	public String getIndustryName() {
		return industryName;
	}

	public void setIndustryName(String industryName) {
		this.industryName = industryName;
	}

}
