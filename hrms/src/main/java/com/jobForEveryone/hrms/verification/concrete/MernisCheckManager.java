package com.jobForEveryone.hrms.verification.concrete;

import org.springframework.stereotype.Service;

import com.jobForEveryone.hrms.entities.concretes.User;
import com.jobForEveryone.hrms.verification.abstracts.MernisCheckService;


@Service
public class MernisCheckManager implements MernisCheckService {

	@Override
	public boolean checkIfRealPerson(User user) {
		
		return true;
	}

}
