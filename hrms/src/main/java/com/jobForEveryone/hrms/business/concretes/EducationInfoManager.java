package com.jobForEveryone.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.jobForEveryone.hrms.business.abstracts.EducationInfoService;
import com.jobForEveryone.hrms.core.utilities.results.DataResult;
import com.jobForEveryone.hrms.core.utilities.results.Result;
import com.jobForEveryone.hrms.core.utilities.results.SuccessDataResult;
import com.jobForEveryone.hrms.core.utilities.results.SuccessResult;
import com.jobForEveryone.hrms.dataAccess.abstracts.EducationInfoDao;
import com.jobForEveryone.hrms.entities.concretes.EducationInfo;

@Service
public class EducationInfoManager implements EducationInfoService {

	private EducationInfoDao educationInfoDao;
	
	@Autowired
	public EducationInfoManager(EducationInfoDao educationInfoDao) {
		super();
		this.educationInfoDao = educationInfoDao;
	}

	@Override
	public DataResult<List<EducationInfo>> getAll() {
		
		return new SuccessDataResult<List<EducationInfo>>(this.educationInfoDao.findAll(), "Eğitimler listelendi.");
	}

	@Override
	public DataResult<List<EducationInfo>> getAllSortedByCompletionDate() {
		
		Sort sort = Sort.by(Direction.ASC, "completionDate");
		return new SuccessDataResult<List<EducationInfo>>(this.educationInfoDao.findAll(sort), "Bitiş yılına göre listelendi.");
	}

	@Override
	public Result add(EducationInfo educationInfo) {
		
		this.educationInfoDao.save(educationInfo);
		return new SuccessResult("Eğitim eklendi.");
	}

}
