package com.jobForEveryone.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "job_advertisements")
public class JobAdvertisement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "job_description")
	private String jobDescription;
	
	@Column(name="salary_min")
	private int salaryMin;
	
	@Column(name="salary_max")
	private int salaryMax;
	
	@Column(name = "position_number")
	private int positionNumber;
	
	@Column(name = "last_date")
	private Date lastDate;
	
	@Column(name="release_date")
	private Date releaseDate;
	
	@Column(name="status")
	private boolean status;
	
	
	@ManyToOne()
	@JoinColumn(name = "city_id")
	private City city;
	
	@ManyToOne()
	@JoinColumn(name = "employer_id")
	private Employer employer;
	
	@ManyToOne()
	@JoinColumn(name = "job_title_id")
	private JobTitle job_title;
	
	public JobAdvertisement() {
		
	}

	public JobAdvertisement(int id, String jobDescription, int salaryMin, int salaryMax, int positionNumber,
			Date lastDate, Date releaseDate, boolean status, City city, Employer employer, JobTitle job_title) {
		super();
		this.id = id;
		this.jobDescription = jobDescription;
		this.salaryMin = salaryMin;
		this.salaryMax = salaryMax;
		this.positionNumber = positionNumber;
		this.lastDate = lastDate;
		this.releaseDate = releaseDate;
		this.status = status;
		this.city = city;
		this.employer = employer;
		this.job_title = job_title;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public int getSalaryMin() {
		return salaryMin;
	}

	public void setSalaryMin(int salaryMin) {
		this.salaryMin = salaryMin;
	}

	public int getSalaryMax() {
		return salaryMax;
	}

	public void setSalaryMax(int salaryMax) {
		this.salaryMax = salaryMax;
	}

	public int getPositionNumber() {
		return positionNumber;
	}

	public void setPositionNumber(int positionNumber) {
		this.positionNumber = positionNumber;
	}

	public Date getLastDate() {
		return lastDate;
	}

	public void setLastDate(Date lastDate) {
		this.lastDate = lastDate;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Employer getEmployer() {
		return employer;
	}

	public void setEmployer(Employer employer) {
		this.employer = employer;
	}

	public JobTitle getJob_title() {
		return job_title;
	}

	public void setJob_title(JobTitle job_title) {
		this.job_title = job_title;
	}

	
	

}
