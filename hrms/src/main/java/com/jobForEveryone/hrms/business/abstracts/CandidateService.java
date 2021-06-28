package com.jobForEveryone.hrms.business.abstracts;

import java.util.List;

import com.jobForEveryone.hrms.core.utilities.results.DataResult;
import com.jobForEveryone.hrms.core.utilities.results.Result;
import com.jobForEveryone.hrms.entities.concretes.Candidate;

public interface CandidateService {
	
	DataResult<List<Candidate>> getAll();
	Result add(Candidate candidate);

}
