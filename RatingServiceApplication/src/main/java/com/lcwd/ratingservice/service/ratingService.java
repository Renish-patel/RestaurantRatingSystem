package com.lcwd.ratingservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lcwd.ratingservice.entity.Rating;

@Service
public interface ratingService {

	//create 
	Rating createRating(Rating rating);
	
	//getall 
	List<Rating> getallRatings(); 
	
	//get by user id 
	List<Rating> getByUserId(String userId); 
	
	// get by hotel id 
	List<Rating> getByHotelId(String hotelId); 

}
