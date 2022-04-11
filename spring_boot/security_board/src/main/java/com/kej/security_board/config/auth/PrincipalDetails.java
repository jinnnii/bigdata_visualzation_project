package com.kej.security_board.config.auth;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.kej.security_board.model.User;

import lombok.Data;


//인증객체
//Authoentication 인증 객체를 저장할 수 있는 유일한 타입
@Data
public class PrincipalDetails implements UserDetails {

	private User user;
	
	public PrincipalDetails(User user) { //입력폼을 User객체로 받아옴
		super();
		this.user=user;
	}
	@Override
	//권한 인가를 컬렉션으로 받아옴
	//로그인 한 사용자의 role을 리턴해주는 것 
	public Collection<? extends GrantedAuthority> getAuthorities() {
		Collection<GrantedAuthority> collection = new ArrayList<GrantedAuthority>();
		collection.add(()->{return user.getRole();});
		return collection;
	}

	@Override
	public String getPassword() {
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		return user.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
