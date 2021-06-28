package com.jobForEveryone.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobForEveryone.hrms.entities.concretes.Candidate;

public interface CandidateDao extends JpaRepository<Candidate, Integer> {
	Candidate getByEmail(String email);
	Candidate getByIdentityNumber(String identityNumber);

}
