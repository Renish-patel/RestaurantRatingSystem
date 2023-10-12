package com.lcwd.ratingservice.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lcwd.ratingservice.entity.Rating;
import com.lcwd.ratingservice.service.ratingService;

@RestController
@RequestMapping("/ratings")
public class RatingController {
		@Autowired
		private ratingService ratingService;
	//create 
		@PostMapping
	public ResponseEntity<Rating> create(@RequestBody Rating rating) {
		return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.createRating(rating));
	}
	
	//get all ratings
		@GetMapping
	public ResponseEntity<List<Rating>> getRating(){
		return ResponseEntity.ok(ratingService.getallRatings());
	}
	
	//get By userId 
	@GetMapping("/users/{userId}")
	public ResponseEntity<List<Rating>> getByUserId(@PathVariable String userId){
		return ResponseEntity.ok(ratingService.getByUserId(userId));
	}

	//get By HotelId
	@GetMapping("/hotels/{hotelId}")

	public ResponseEntity<List<Rating>> getByHotelId( @PathVariable String hotelId){
		return ResponseEntity.ok(ratingService.getByHotelId(hotelId));
	}
	
}