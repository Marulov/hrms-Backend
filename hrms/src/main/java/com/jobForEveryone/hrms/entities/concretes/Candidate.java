package com.jobForEveryone.hrms.entities.concretes;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="candidates")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","resume","candidates"})
public class Candidate extends User {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	@NotBlank
	@NotNull
	private String firstName;		
	
	@Column(name="last_name")
	@NotBlank
	@NotNull
	private String lastName;
	
	@Column(name="identity_number")
	@NotBlank
	@NotNull
	private String identityNumber;
	
	@Column(name="birth_year")
	private int birthYear;
	
	
	@OneToOne(mappedBy = "candidate")
	private Resume resume;
	
	public Candidate(int id, String firstName, String lastName, String identityNumber, int birthYear,
			Resume resume) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
		this.birthYear = birthYear;
		this.resume = resume;
	}


	public Candidate() {
		
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}




	public Resume getCandidates() {
		return resume;
	}




	public void setCandidates(Resume  resume) {
		this.resume = resume;
	}

	

}
