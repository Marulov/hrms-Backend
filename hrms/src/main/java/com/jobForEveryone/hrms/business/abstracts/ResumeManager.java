package com.jobForEveryone.hrms.business.abstracts;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobForEveryone.hrms.core.utilities.results.DataResult;
import com.jobForEveryone.hrms.core.utilities.results.Result;
import com.jobForEveryone.hrms.core.utilities.results.SuccessDataResult;
import com.jobForEveryone.hrms.core.utilities.results.SuccessResult;
import com.jobForEveryone.hrms.dataAccess.abstracts.ResumeDao;
import com.jobForEveryone.hrms.entities.concretes.Resume;

@Service
public class ResumeManager implements ResumeService{

	private ResumeDao resumeDao;
	
	@Autowired
	public ResumeManager(ResumeDao resumeDao) {
		super();
		this.resumeDao = resumeDao;
	}

	@Override
	public DataResult<List<Resume>> getAll() {
		
		return new SuccessDataResult<List<Resume>>(this.resumeDao.findAll(), "Cv ler listelendi.");
	}

	@Override
	public Result add(Resume resume) {
		
		this.resumeDao.save(resume);
		return new SuccessResult("Cv eklendi.");
	}

}
