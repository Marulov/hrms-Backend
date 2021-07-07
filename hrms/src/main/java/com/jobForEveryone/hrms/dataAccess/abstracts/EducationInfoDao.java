package com.jobForEveryone.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobForEveryone.hrms.entities.concretes.EducationInfo;

public interface EducationInfoDao extends JpaRepository<EducationInfo, Integer> {

}
