package com.login.pack.Service;

import com.login.pack.Model.User;

public interface UserService {

	public User createUser(User user);
	
	public User getUser(String userName);
}
