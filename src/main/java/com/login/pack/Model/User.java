package com.login.pack.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "User")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	@Column(name = "Email", nullable = false)
	private String email;
	@Column(name = "Username", nullable = false, length = 30, unique = true)
	private String username;
	@Column(name = "Password", nullable = false, length = 30)
	private String password;
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}



	public User(Long userId, String email, String username, String password) {
		super();
		this.userId = userId;
		this.email = email;
		this.username = username;
		this.password = password;
	}

	public User( String email, String username, String password) {
		super();
		this.email = email;
		this.username = username;
		this.password = password;
	}


	public Long getUserId() {
		return userId;
	}



	public void setUserId(Long userId) {
		this.userId = userId;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	@Override
	public String toString() {
		return "User [userId=" + userId + ", email=" + email + ", username=" + username + ", password=" + password
				+ "]";
	}
	
	 

	
}
