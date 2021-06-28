package com.jobForEveryone.hrms.verification.abstracts;

import com.jobForEveryone.hrms.entities.concretes.User;

public interface HrmsCheckService {
	boolean checkIfConfirmHrms(User user);

}
