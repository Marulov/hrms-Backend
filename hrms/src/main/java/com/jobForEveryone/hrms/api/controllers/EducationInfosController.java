package com.jobForEveryone.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	public DataResult<List<EducationInfo>> getAll(){
		
		return this.educationInfoService.getAll();
	}
	
	@GetMapping("/getAllSortedByCompletionDate")
	public DataResult<List<EducationInfo>> getAllSortedByCompletionDate(){
		
		return this.educationInfoService.getAllSortedByCompletionDate();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody EducationInfo educationInfo) {
		
		return this.educationInfoService.add(educationInfo);
		
	}
	

}
