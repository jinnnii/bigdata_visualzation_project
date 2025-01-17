package com.kej.securityex.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kej.securityex.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	public User findByUsername(String username);
}
