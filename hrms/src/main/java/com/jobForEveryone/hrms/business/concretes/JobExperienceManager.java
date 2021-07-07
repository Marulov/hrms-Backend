package com.jobForEveryone.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.jobForEveryone.hrms.business.abstracts.JobExperienceService;
import com.jobForEveryone.hrms.core.utilities.results.DataResult;
import com.jobForEveryone.hrms.core.utilities.results.Result;
import com.jobForEveryone.hrms.core.utilities.results.SuccessDataResult;
import com.jobForEveryone.hrms.core.utilities.results.SuccessResult;
import com.jobForEveryone.hrms.dataAccess.abstracts.JobExperienceDao;
import com.jobForEveryone.hrms.entities.concretes.JobExperience;

@Service
public class JobExperienceManager implements JobExperienceService{

	private JobExperienceDao jobExperienceDao;
	
	@Autowired
	public JobExperienceManager(JobExperienceDao jobExperienceDao) {
		super();
		this.jobExperienceDao = jobExperienceDao;
	}

	@Override
	public DataResult<List<JobExperience>> getAll() {
		
		return new SuccessDataResult<List<JobExperience>>(this.jobExperienceDao.findAll(), "İş tecrübesi listeledi.");
	}

	@Override
	public DataResult<List<JobExperience>> getAllSortedByCompletionDate() {
		
		Sort sort = Sort.by(Direction.ASC, "completionDate");
		return new SuccessDataResult<List<JobExperience>>(this.jobExperienceDao.findAll(sort), "İş tecrübeleri sıralı olarak listelendi.");
	}

	@Override
	public Result add(JobExperience jobExperience) {
		
		this.jobExperienceDao.save(jobExperience);
		return new SuccessResult("İş tecrübesi eklendi.");
	}

}
