package com.kej.security_board.config.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.kej.security_board.model.User;
import com.kej.security_board.repository.UserRepository;

@Service
public class PrincipalDetailsService implements UserDetailsService{
	@Autowired
	private UserRepository userRepository;
	
	
	//아이디 체크 => 없는 아이디 => null / 있는 아이디 => user 리턴 
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(username);
		System.out.println("user======"+user);
		if(user==null) {
			return null;
		}
		
		return new PrincipalDetails(user);
	}
	

}