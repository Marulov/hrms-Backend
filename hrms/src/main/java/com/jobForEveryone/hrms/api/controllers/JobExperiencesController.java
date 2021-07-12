package com.jobForEveryone.hrms.api.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobForEveryone.hrms.business.abstracts.JobExperienceService;
import com.jobForEveryone.hrms.core.utilities.results.DataResult;
import com.jobForEveryone.hrms.core.utilities.results.Result;
import com.jobForEveryone.hrms.entities.concretes.JobExperience;

@RestController
@RequestMapping("/api/jobexperience")
public class JobExperiencesController {
	
	private JobExperienceService jobExperienceService;

	@Autowired
	public JobExperiencesController(JobExperienceService jobExperienceService) {
		super();
		this.jobExperienceService = jobExperienceService;
	}
	
	@GetMapping("/getall")
	public ResponseEntity<?> getAll(){
		
		DataResult<?> result = this.jobExperienceService.getAll();
		
        if(result.isSuccess()){
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
	}
	
	@GetMapping("/getAllSortedByCompletionDate")
	public ResponseEntity<?> getAllSortedByCompletionDate(){
		
		DataResult<?> result = this.jobExperienceService.getAllSortedByCompletionDate();
		
        if(result.isSuccess()){
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@RequestBody JobExperience jobExperience) {
		
		Result result = this.jobExperienceService.add(jobExperience);
		
        if(result.isSuccess()){
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
	}
	

}
