package com.jobForEveryone.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jobForEveryone.hrms.entities.concretes.JobTitle;

public interface JobTitleDao extends JpaRepository<JobTitle, Integer> {

}
