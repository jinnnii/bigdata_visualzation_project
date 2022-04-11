package com.kej.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kej.board.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	User findByUsername(String username);
}
