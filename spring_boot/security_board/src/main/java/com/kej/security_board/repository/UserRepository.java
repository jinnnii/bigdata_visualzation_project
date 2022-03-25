package com.kej.security_board.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kej.security_board.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	User findByUsername(String username);
}
