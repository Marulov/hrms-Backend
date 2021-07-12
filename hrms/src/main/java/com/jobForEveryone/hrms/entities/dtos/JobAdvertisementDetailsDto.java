package com.jobForEveryone.hrms.entities.dtos;

import java.util.Date;


public class JobAdvertisementDetailsDto {
	
	private int id; 
	private String cityName;
	private String companyName;
	private String title;
	private String jobDescription;
	private int salaryMin;
	private int salaryMax;
	private int positionNumber;
	private Date lastDate;	
	private Date releaseDate;	
	private boolean status;
	
	public JobAdvertisementDetailsDto() {
		
	}
	
	public JobAdvertisementDetailsDto(int id, String cityName, String companyName, String title, String jobDescription,
			int salaryMin, int salaryMax, int positionNumber, Date lastDate, Date releaseDate, boolean status) {
		super();
		this.id = id;
		this.cityName = cityName;
		this.companyName = companyName;
		this.title = title;
		this.jobDescription = jobDescription;
		this.salaryMin = salaryMin;
		this.salaryMax = salaryMax;
		this.positionNumber = positionNumber;
		this.lastDate = lastDate;
		this.releaseDate = releaseDate;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

}
