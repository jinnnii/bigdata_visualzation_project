package com.kej.securityex.model;



import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Data
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String username;
	private String password;
	private String email;
	
//	@ColumnDefault("ROLE_USER")
	private String role; //ROLE_USER, ROLE_ADMIN, ROLE_MANAGER	
	
	@CreationTimestamp
//	@Temporal(TemporalType.TIMESTAMP)
	private Timestamp createDate;
	
}
