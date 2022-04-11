package com.kej.security_board.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
// 컨트롤러 매핑 바로전에 접근자의 사용 권한을 확인하는 어노테이션
// 웹 요청 필터 체인을 걸어줌
@EnableWebSecurity 
@EnableGlobalMethodSecurity(securedEnabled= true)
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	// _패스워드 암호화_ 해주는 객체를 Bean으로 만들어서 리턴
	@Bean
	public BCryptPasswordEncoder encodePwd() {
		return new BCryptPasswordEncoder();
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http.csrf().disable();
		
		//인증 요청에 따라서 접근 권한 부여
		http.authorizeRequests()
			.antMatchers("/board/**","/index").authenticated() //인증된 사용자는 누구나 접근 가능
			.antMatchers("/manager/**").access("hasRole('ADMIN') or hasRole('MANAGER')")
			.antMatchers("/admin/**").access("hasRole('ADMIN')")
			.anyRequest().permitAll() //그 외 나머지 요청은 지정하지 않은 곳에만 접근 가능 
		.and()
			.formLogin()
			.loginPage("/login") //로그인 url
			.loginProcessingUrl("/loginProc") //로그인 처리 url (스프링 자체 로그인 지원 url)
			.defaultSuccessUrl("/");

	}
}
