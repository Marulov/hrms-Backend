package com.jobForEveryone.hrms.api.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobForEveryone.hrms.business.abstracts.ResumeService;
import com.jobForEveryone.hrms.core.utilities.results.DataResult;
import com.jobForEveryone.hrms.core.utilities.results.Result;
import com.jobForEveryone.hrms.entities.concretes.Resume;

@RestController
@RequestMapping("api/resumes")
public class ResumesController {
	
	private ResumeService resumeService;

	@Autowired
	public ResumesController(ResumeService resumeService) {
		super();
		this.resumeService = resumeService;
	}
	
	@GetMapping("/getall")
	public ResponseEntity<?> getAll(){
		
		DataResult<?> result = this.resumeService.getAll();
		
        if(result.isSuccess()){
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
		
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@RequestBody Resume resume) {
		
		Result result = this.resumeService.add(resume);
		
        if(result.isSuccess()){
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
	}
	

}
