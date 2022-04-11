package com.kej.security_board.service;

import com.kej.security_board.model.User;

public interface UserService {
//	public List<User> getList();
//	public User getUser(String username);
	public void register(User user);
	public void update(User user);
	public void delete(String username);
	public User findByUsername(String username);
}
