package com.login.pack.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.pack.Model.User;
import com.login.pack.Repository.Repo;

@Service
public class ServiceImpl implements UserService  {
	
	@Autowired
	private Repo repo;

	@Override
	public User createUser(User user) {
		User user_save = repo.save(user);
		return user_save;
	}
	
	@Override
	public User getUser(String userName) {
		User username = repo.findByUserName(userName);
		return username;
	}
	
	

}
