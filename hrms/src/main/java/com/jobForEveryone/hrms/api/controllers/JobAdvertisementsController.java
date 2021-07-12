package com.jobForEveryone.hrms.api.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<?> getAll(){
		DataResult<?> result = this.jobAdvertisementService.getAll();
		
        if(result.isSuccess()){
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
		
	}
	
	@GetMapping("/getAllStatusTrue")
	public ResponseEntity<?> getAllStatusTrue(){
		
		DataResult<?> result = this.jobAdvertisementService.getAllStatusTrue();
		
        if(result.isSuccess()){
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@RequestBody JobAdvertisement jobAdvertisement) {
		
		Result result = this.jobAdvertisementService.add(jobAdvertisement);
		
        if(result.isSuccess()){
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
	}
	
	@GetMapping("/getAllSortedByLastDate")
	public ResponseEntity<?> getAllSortedByLastDate(){
		
		DataResult<?> result = this.jobAdvertisementService.getAllSortedByLastDate();
		
        if(result.isSuccess()){
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
	}
	
	@GetMapping("/getAllEmployerAndStatusTrue")
	public ResponseEntity<?> getAllEmployerAndStatusTrue(@RequestParam("companyName") String companyName){
		
		DataResult<?> result = this.jobAdvertisementService.getAllEmployerAndStatusTrue(companyName);
		
        if(result.isSuccess()){
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
		
	}
	
	@PostMapping("/setStatus")
	public ResponseEntity<?> update(int id , boolean status) {
		
		Result result = this.jobAdvertisementService.update(id, status);
		
        if(result.isSuccess()){
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
	}
	

	
	

}
