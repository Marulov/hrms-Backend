package com.jobForEveryone.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobForEveryone.hrms.business.abstracts.JobTitleService;
import com.jobForEveryone.hrms.core.utilities.results.DataResult;
import com.jobForEveryone.hrms.core.utilities.results.ErrorResult;
import com.jobForEveryone.hrms.core.utilities.results.Result;
import com.jobForEveryone.hrms.core.utilities.results.SuccessDataResult;
import com.jobForEveryone.hrms.core.utilities.results.SuccessResult;
import com.jobForEveryone.hrms.dataAccess.abstracts.JobTitleDao;
import com.jobForEveryone.hrms.entities.concretes.JobTitle;

@Service
public class JobTitleManager implements JobTitleService{

	private JobTitleDao jobTitleDao;

	@Autowired
	public JobTitleManager(JobTitleDao jobTitleDao) {
		super();
		this.jobTitleDao = jobTitleDao;
	}

	@Override
	public DataResult<List<JobTitle>> getAll() {
		
		return new SuccessDataResult<List<JobTitle>>(this.jobTitleDao.findAll(), "İş pozisyonları listelendi.");
	}

	@Override
	public Result add(JobTitle jobTitle) {
		
		if(!CheckTitle(jobTitle.getTitle())) {
			return new ErrorResult("Title tekrar edemez!");
		}
		
		this.jobTitleDao.save(jobTitle);
		return new SuccessResult("Pozisyon eklendi.");
	}
	
	private boolean CheckTitle(String title) {
		if(this.jobTitleDao.getByTitle(title) == null) {
			return true;
		}
		return false;
	}


}
