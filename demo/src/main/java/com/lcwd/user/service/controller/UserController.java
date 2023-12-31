package com.lcwd.user.service.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lcwd.user.service.UserServices.UserServices;
import com.lcwd.user.service.entities.User;

import ch.qos.logback.classic.Logger;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;

@RestController
@RequestMapping("/users")
public class UserController {

	
	
	@Autowired
	private UserServices userServices;
	
	private Logger logger = (Logger) LoggerFactory.getLogger(UserController.class);
	
	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user ) {
		User user1 = userServices.saveUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(user1);
	}

	@GetMapping("/{userId}")
//	@CircuitBreaker(name = "ratingHotelBreaker", fallbackMethod = "ratingHotelFallback")
	@RateLimiter(name = "UserRateLimiter",fallbackMethod = "ratingHotelFallback")
	
	public ResponseEntity<User> getUser(@PathVariable String userId) {
		User users = userServices.getUser(userId);
		return ResponseEntity.ok(users);
	}

	public ResponseEntity<User> ratingHotelFallback(String userId, Exception ex) {
		
		ex.printStackTrace();
		logger.info("fallback executed because service is down", ex.getMessage());
		User user = User.builder().email("dummy@gamil.com").name("dummny").about("dummy").userId("123").build();
		return new ResponseEntity<>(user, HttpStatus.OK);

	}

	@GetMapping
	public ResponseEntity<List<User>> getAllUsers() {
		List<User> allUsers = userServices.getAllUser();
		return ResponseEntity.ok(allUsers);
	}

}
