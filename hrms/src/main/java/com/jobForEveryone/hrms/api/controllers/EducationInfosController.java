package com.jobForEveryone.hrms.api.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobForEveryone.hrms.business.abstracts.EducationInfoService;
import com.jobForEveryone.hrms.core.utilities.results.DataResult;
import com.jobForEveryone.hrms.core.utilities.results.Result;
import com.jobForEveryone.hrms.entities.concretes.EducationInfo;

@RestController
@RequestMapping("/api/educationinfo")
public class EducationInfosController {
	
	private EducationInfoService educationInfoService;

	@Autowired
	public EducationInfosController(EducationInfoService educationInfoService) {
		super();
		this.educationInfoService = educationInfoService;
	}
	
	@GetMapping("/getall")
	public ResponseEntity<?> getAll(){
		
		DataResult<?> result = this.educationInfoService.getAll();
		
        if(result.isSuccess()){
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
	}
	
	@GetMapping("/getAllSortedByCompletionDate")
	public ResponseEntity<?> getAllSortedByCompletionDate(){
		
		DataResult<?> result = this.educationInfoService.getAllSortedByCompletionDate();
		
        if(result.isSuccess()){
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
		
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@RequestBody EducationInfo educationInfo) {
		
		Result result = this.educationInfoService.add(educationInfo);
		
        if(result.isSuccess()){
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
		
	}
	

}
