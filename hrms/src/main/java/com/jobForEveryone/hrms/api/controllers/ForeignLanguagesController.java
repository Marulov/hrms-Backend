package com.jobForEveryone.hrms.api.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobForEveryone.hrms.business.abstracts.ForeignLanguageService;
import com.jobForEveryone.hrms.core.utilities.results.DataResult;
import com.jobForEveryone.hrms.core.utilities.results.Result;
import com.jobForEveryone.hrms.entities.concretes.ForeignLanguage;

@RestController
@RequestMapping("api/foreignlanguages")
public class ForeignLanguagesController {
	
	private ForeignLanguageService foreignLanguageService;
	
	@Autowired
	public ForeignLanguagesController(ForeignLanguageService foreignLanguageService) {
		super();
		this.foreignLanguageService = foreignLanguageService;
	}

	@GetMapping("/getall")
	public ResponseEntity<?> getAll(){
		
		DataResult<?> result = this.foreignLanguageService.getAll();
		
        if(result.isSuccess()){
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@RequestBody ForeignLanguage foreignLanguage) {
		
		Result result = this.foreignLanguageService.add(foreignLanguage);
		
        if(result.isSuccess()){
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
	}

}
