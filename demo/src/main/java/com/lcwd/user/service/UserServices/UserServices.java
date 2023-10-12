package com.lcwd.user.service.UserServices;

import java.util.List;

import com.lcwd.user.service.entities.User;

public interface UserServices {
	
	User saveUser(User user);
	
	List<User> getAllUser();
	
	User getUser(String userId);

}
