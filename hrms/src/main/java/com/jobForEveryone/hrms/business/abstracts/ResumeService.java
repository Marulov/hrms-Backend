package com.jobForEveryone.hrms.business.abstracts;

import java.util.List;

import com.jobForEveryone.hrms.core.utilities.results.DataResult;
import com.jobForEveryone.hrms.core.utilities.results.Result;
import com.jobForEveryone.hrms.entities.concretes.Resume;

public interface ResumeService {

	DataResult<List<Resume>> getAll();
	Result add(Resume resume);
}
