package com.jobForEveryone.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobForEveryone.hrms.entities.concretes.ForeignLanguage;

public interface ForeignLanguageDao extends JpaRepository<ForeignLanguage, Integer>{

}
