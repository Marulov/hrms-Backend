package com.jobForEveryone.hrms.entities.concretes;

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
@Table(name = "foreign_languages")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","resumes","foreignLanguages"})
public class ForeignLanguage  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "language_name")
	private String languageName;
	
	@Column(name = "language_level")
	private String languageLevel;
	
	@OneToMany(mappedBy = "foreignLanguage")
	private List<Resume> resumes;

	
	public ForeignLanguage(int id, String languageName, String languageLevel, List<Resume> resumes) {
		super();
		this.id = id;
		this.languageName = languageName;
		this.languageLevel = languageLevel;
		this.resumes = resumes;
	}



	public ForeignLanguage() {
		
	}
	

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLanguageName() {
		return languageName;
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}

	public String getLanguageLevel() {
		return languageLevel;
	}

	public void setLanguageLevel(String languageLevel) {
		this.languageLevel = languageLevel;
	}



	public List<Resume> getForeignLanguages() {
		return resumes;
	}



	public void setForeignLanguages(List<Resume> resumes) {
		this.resumes = resumes;
	}


}


