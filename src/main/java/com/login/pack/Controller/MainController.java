package com.login.pack.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.login.pack.Model.User;
import com.login.pack.Service.UserService;

@RestController
@RequestMapping("/home")
public class MainController {

	@Autowired
	UserService userService;

	@PostMapping("/create")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		User createUser = userService.createUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(createUser);
	}
	
//	
//	// get account details
//	@GetMapping("/{userName}")
//	public User getUserDetailsByName(@PathVariable String userName) {
//		User user = userService.getUser(userName);
//		return user;
//	}
	
	@GetMapping("/{username}/{password}")
	public User getuserDetailsByUserPass(@PathVariable String username, String password) {
		User user = userService.getUser(username);
		return user;
	}
}
