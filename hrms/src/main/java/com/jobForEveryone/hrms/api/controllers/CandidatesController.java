package com.jobForEveryone.hrms.api.controllers;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobForEveryone.hrms.business.abstracts.CandidateService;
import com.jobForEveryone.hrms.core.utilities.results.DataResult;
import com.jobForEveryone.hrms.core.utilities.results.Result;
import com.jobForEveryone.hrms.entities.concretes.Candidate;

@RestController
@RequestMapping("api/candidates")
public class CandidatesController {
	
	private CandidateService candidateService;

	@Autowired
	public CandidatesController(CandidateService candidateService) {
		super();
		this.candidateService = candidateService;
	}
	
	@GetMapping("/getall")
	public ResponseEntity<?> getAll(){
		
		DataResult<?> result = this.candidateService.getAll();
		
        if(result.isSuccess()){
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
		
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@Valid @RequestBody Candidate candidate) {
		
		Result result = this.candidateService.add(candidate);
		
        if(result.isSuccess()){
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
	}
	

}
 