package com.jobForEveryone.hrms.entities.concretes;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "job_experience")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","resumes","jobExperiences"})
public class JobExperience {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "position_name")
	private String positionName;
	
	@Column(name = "starting_date")
	private Date startingDate;
	
	@Column(name = "completion_date")
	private Date completionDate;
	
	@Column(name = "is_still_work")
	private boolean isStillWork;
	
	@OneToMany(mappedBy = "jobExperience")
	private List<Resume> resumes;

	public JobExperience() {
		
	}
	


	public JobExperience(int id, String companyName, String positionName, Date startingDate, Date completionDate,
			boolean isStillWork, List<Resume> resumes) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.positionName = positionName;
		this.startingDate = startingDate;
		this.completionDate = completionDate;
		this.isStillWork = isStillWork;
		this.resumes = resumes;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public List<Resume> getJobExperiences() {
		return resumes;
	}



	public void setJobExperiences(List<Resume> resumes) {
		this.resumes = resumes;
	}



	public String getPositionName() {
		return positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	public Date getStartingDate() {
		return startingDate;
	}

	public void setStartingDate(Date startingDate) {
		this.startingDate = startingDate;
	}

	public Date getCompletionDate() {
		return completionDate;
	}

	public void setCompletionDate(Date completionDate) {
		this.completionDate = completionDate;
	}

	public boolean isStillWork() {
		return isStillWork;
	}

	public void setStillWork(boolean isStillWork) {
		this.isStillWork = isStillWork;
	}
	

}
