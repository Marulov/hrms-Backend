package com.jobForEveryone.hrms.verification.concrete;

import org.springframework.stereotype.Service;

import com.jobForEveryone.hrms.entities.concretes.User;
import com.jobForEveryone.hrms.verification.abstracts.EmailCheckService;

@Service
public class EmailCheckManager implements EmailCheckService{

	@Override
	public boolean CheckIfRealEmail(User user) {
		
		return true;
	}

}
