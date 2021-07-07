package com.jobForEveryone.hrms.business.abstracts;

import java.util.List;

import com.jobForEveryone.hrms.core.utilities.results.DataResult;
import com.jobForEveryone.hrms.core.utilities.results.Result;
import com.jobForEveryone.hrms.entities.concretes.JobExperience;

public interface JobExperienceService {
	
	DataResult<List<JobExperience>> getAll();
	DataResult<List<JobExperience>> getAllSortedByCompletionDate();
	Result add(JobExperience jobExperience);

}
