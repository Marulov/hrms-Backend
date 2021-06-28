package com.jobForEveryone.hrms.verification.concrete;

import org.springframework.stereotype.Service;

import com.jobForEveryone.hrms.entities.concretes.User;
import com.jobForEveryone.hrms.verification.abstracts.HrmsCheckService;

@Service
public class HrmsCheckManager implements HrmsCheckService {

	@Override
	public boolean checkIfConfirmHrms(User user) {
		
		return true;
	}

}
