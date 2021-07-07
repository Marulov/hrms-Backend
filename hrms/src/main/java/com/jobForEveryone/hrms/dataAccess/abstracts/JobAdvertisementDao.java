package com.jobForEveryone.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jobForEveryone.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer>{

	@Query("From JobAdvertisement where status = true")
	List<JobAdvertisement> getAllStatusTrue();
	
	@Query("From JobAdvertisement where employer.companyName=:companyName and status = true")
	List<JobAdvertisement> getAllEmployerAndStatusTrue(String companyName);
}
