package com.kej.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kej.board.model.User;
import com.kej.board.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void register(User user) {
		userRepository.save(user);
	
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String username) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User findByUsername(String username) {
		return userRepository.findByUsername(username);
	}

}
