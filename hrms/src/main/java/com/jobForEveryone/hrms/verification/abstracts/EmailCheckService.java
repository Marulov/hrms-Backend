package com.jobForEveryone.hrms.verification.abstracts;

import com.jobForEveryone.hrms.entities.concretes.User;

public interface EmailCheckService {
	boolean CheckIfRealEmail(User user);

}
