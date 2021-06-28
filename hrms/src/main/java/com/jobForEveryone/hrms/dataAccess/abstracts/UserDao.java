package com.jobForEveryone.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobForEveryone.hrms.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer>{

}
