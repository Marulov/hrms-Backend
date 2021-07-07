package com.jobForEveryone.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jobForEveryone.hrms.business.abstracts.JobAdvertisementService;
import com.jobForEveryone.hrms.core.utilities.results.DataResult;
import com.jobForEveryone.hrms.core.utilities.results.Result;
import com.jobForEveryone.hrms.entities.concretes.JobAdvertisement;

@RestController
@RequestMapping("/api/jobAdvertisement")
public class JobAdvertisementsController {
	
	private JobAdvertisementService jobAdvertisementService;

	@Autowired
	public JobAdvertisementsController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<JobAdvertisement>> getAll(){
		return this.jobAdvertisementService.getAll();
	}
	
	@GetMapping("/getAllStatusTrue")
	public DataResult<List<JobAdvertisement>> getAllStatusTrue(){
		return this.jobAdvertisementService.getAllStatusTrue();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobAdvertisement jobAdvertisement) {
		return this.jobAdvertisementService.add(jobAdvertisement);
	}
	
	@GetMapping("/getAllSortedByLastDate")
	public DataResult<List<JobAdvertisement>> getAllSortedByLastDate(){
		return this.jobAdvertisementService.getAllSortedByLastDate();
	}
	
	@GetMapping("/getAllEmployerAndStatusTrue")
	public DataResult<List<JobAdvertisement>> getAllEmployerAndStatusTrue(@RequestParam("companyName") String companyName){
		
		return this.jobAdvertisementService.getAllEmployerAndStatusTrue(companyName);
		
	}
	
	@PostMapping("/setStatus")
	public Result update(int id , boolean status) {
		return this.jobAdvertisementService.update(id, status);
	}
	
	

}
