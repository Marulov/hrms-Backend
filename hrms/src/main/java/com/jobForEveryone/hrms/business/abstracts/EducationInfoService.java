package com.jobForEveryone.hrms.business.abstracts;

import java.util.List;

import com.jobForEveryone.hrms.core.utilities.results.DataResult;
import com.jobForEveryone.hrms.core.utilities.results.Result;
import com.jobForEveryone.hrms.entities.concretes.EducationInfo;

public interface EducationInfoService {
	
	DataResult<List<EducationInfo>> getAll();
	DataResult<List<EducationInfo>> getAllSortedByCompletionDate();
	Result add(EducationInfo educationInfo);

}
