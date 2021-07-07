package com.jobForEveryone.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "education_info")
public class EducationInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "university_name")
	private String universityName;
	
	@Column(name = "departman_name")
	private String departmanName;
	
	@Column(name = "starting_date")
	private Date startingDate;
	
	@Column(name = "completion_date")
	private Date completionDate;
	
	@Column(name = "is_active_student")
	private boolean is_active_student;
	
	public EducationInfo() {
		
	}

	public EducationInfo(int id, String universityName, String departmanName, Date startingDate, Date completionDate,
			boolean is_active_student) {
		super();
		this.id = id;
		this.universityName = universityName;
		this.departmanName = departmanName;
		this.startingDate = startingDate;
		this.completionDate = completionDate;
		this.is_active_student = is_active_student;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public String getDepartmanName() {
		return departmanName;
	}

	public void setDepartmanName(String departmanName) {
		this.departmanName = departmanName;
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

	public boolean isIs_active_student() {
		return is_active_student;
	}

	public void setIs_active_student(boolean is_active_student) {
		this.is_active_student = is_active_student;
	}

}
