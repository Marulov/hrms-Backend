package com.jobForEveryone.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.jobForEveryone.hrms.business.abstracts.JobAdvertisementService;
import com.jobForEveryone.hrms.core.utilities.results.DataResult;
import com.jobForEveryone.hrms.core.utilities.results.Result;
import com.jobForEveryone.hrms.core.utilities.results.SuccessDataResult;
import com.jobForEveryone.hrms.core.utilities.results.SuccessResult;
import com.jobForEveryone.hrms.dataAccess.abstracts.JobAdvertisementDao;
import com.jobForEveryone.hrms.entities.concretes.JobAdvertisement;


@Service
public class JobAdvertisementManager implements JobAdvertisementService{

	private JobAdvertisementDao jobAdvertisementDao;
	
	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}

	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("İş ilanı eklendi");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll(), "İş ilanları listelendi.");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllStatusTrue() {
		
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getAllStatusTrue(), "Açık iş ilanları listelendi.");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllSortedByLastDate() {
		
		Sort sort = Sort.by(Sort.Direction.ASC,"releaseDate");
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll(sort), "Tarihe göre sıralı bir şekilde listelendi.");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllEmployerAndStatusTrue(String companyName) {
		
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getAllEmployerAndStatusTrue(companyName), "iş verenlere göre iş ilanları listelendi.");
	}

	@Override
	public Result update(int id, boolean status) {
		
		JobAdvertisement jobAdvertisementUpdate = this.jobAdvertisementDao.findById(id).get();
		jobAdvertisementUpdate.setStatus(status);
		this.jobAdvertisementDao.save(jobAdvertisementUpdate);
		return new SuccessResult("İş ilanının statüsü değiştirildi.");
	}


}
