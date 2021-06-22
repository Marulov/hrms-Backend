package com.jobForEveryone.hrms.business.abstracts;

import java.util.List;

import com.jobForEveryone.hrms.entities.concretes.JobTitle;

public interface JobTitleService {
	List<JobTitle> getAll();

}
