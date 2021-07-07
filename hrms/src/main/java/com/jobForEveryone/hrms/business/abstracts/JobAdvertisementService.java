package com.jobForEveryone.hrms.business.abstracts;

import java.util.List;

import com.jobForEveryone.hrms.core.utilities.results.DataResult;
import com.jobForEveryone.hrms.core.utilities.results.Result;
import com.jobForEveryone.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {
	
	Result add(JobAdvertisement jobAdvertisement);
	
	DataResult<List<JobAdvertisement>> getAll();
	
	DataResult<List<JobAdvertisement>> getAllStatusTrue();
	
	DataResult<List<JobAdvertisement>> getAllSortedByLastDate();
	
	DataResult<List<JobAdvertisement>> getAllEmployerAndStatusTrue(String companyName);	
	
	Result update(int id , boolean status);

}
