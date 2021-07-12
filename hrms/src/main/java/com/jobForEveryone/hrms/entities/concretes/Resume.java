package com.jobForEveryone.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="resumes")
public class Resume {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@OneToOne
	@JoinColumn(name = "candidate_id")
	private Candidate candidate;
	
	@ManyToOne()
	@JoinColumn(name = "education_info_id")
	private EducationInfo educationInfo;
	
	@ManyToOne()
	@JoinColumn(name = "foreign_language_id")
	private ForeignLanguage foreignLanguage;
	
	@ManyToOne()
	@JoinColumn(name = "job_experience_id")
	private JobExperience jobExperience;
	
	@Column(name = "creation_date")
	private Date creationDate;
	
	@Column(name = "github_link" )
	private String githubLink;
	
	@Column(name = "linkedin_link")
	private String linkedinLink;
	
	@Column(name = "cover_letter")
	private String coverLetter;
	
	@Column(name = "programming_language")
	private String programmingLanguage;
	
	public Resume() {
		
	}

	public Resume(int id, Candidate candidate, EducationInfo educationInfo, ForeignLanguage foreignLanguage,
			JobExperience jobExperience, Date creationDate, String githubLink, String linkedinLink, String coverLetter,
			String programmingLanguage) {
		super();
		this.id = id;
		this.candidate = candidate;
		this.educationInfo = educationInfo;
		this.foreignLanguage = foreignLanguage;
		this.jobExperience = jobExperience;
		this.creationDate = creationDate;
		this.githubLink = githubLink;
		this.linkedinLink = linkedinLink;
		this.coverLetter = coverLetter;
		this.programmingLanguage = programmingLanguage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	public EducationInfo getEducationInfo() {
		return educationInfo;
	}

	public void setEducationInfo(EducationInfo educationInfo) {
		this.educationInfo = educationInfo;
	}

	public ForeignLanguage getForeignLanguage() {
		return foreignLanguage;
	}

	public void setForeignLanguage(ForeignLanguage foreignLanguage) {
		this.foreignLanguage = foreignLanguage;
	}

	public JobExperience getJobExperience() {
		return jobExperience;
	}

	public void setJobExperience(JobExperience jobExperience) {
		this.jobExperience = jobExperience;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getGithubLink() {
		return githubLink;
	}

	public void setGithubLink(String githubLink) {
		this.githubLink = githubLink;
	}

	public String getLinkedinLink() {
		return linkedinLink;
	}

	public void setLinkedinLink(String linkedinLink) {
		this.linkedinLink = linkedinLink;
	}

	public String getCoverLetter() {
		return coverLetter;
	}

	public void setCoverLetter(String coverLetter) {
		this.coverLetter = coverLetter;
	}

	public String getProgrammingLanguage() {
		return programmingLanguage;
	}

	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}
	
	
	
	
	
	

}
