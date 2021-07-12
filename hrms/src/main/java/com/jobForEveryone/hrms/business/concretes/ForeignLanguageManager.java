package com.jobForEveryone.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobForEveryone.hrms.business.abstracts.ForeignLanguageService;
import com.jobForEveryone.hrms.core.utilities.results.DataResult;
import com.jobForEveryone.hrms.core.utilities.results.Result;
import com.jobForEveryone.hrms.core.utilities.results.SuccessDataResult;
import com.jobForEveryone.hrms.core.utilities.results.SuccessResult;
import com.jobForEveryone.hrms.dataAccess.abstracts.ForeignLanguageDao;
import com.jobForEveryone.hrms.entities.concretes.ForeignLanguage;

@Service
public class ForeignLanguageManager implements ForeignLanguageService{

	private ForeignLanguageDao foreignLanguageDao;
	
	@Autowired
	public ForeignLanguageManager(ForeignLanguageDao foreignLanguageDao) {
		super();
		this.foreignLanguageDao = foreignLanguageDao;
	}

	@Override
	public DataResult<List<ForeignLanguage>> getAll() {
		
		return new SuccessDataResult<List<ForeignLanguage>>(this.foreignLanguageDao.findAll(), "Yabancı diller listelendi.");
	}

	@Override
	public Result add(ForeignLanguage foreignLanguage) {
		
		this.foreignLanguageDao.save(foreignLanguage);
		return new SuccessResult("Yabancı dil eklendi");
	}

}
