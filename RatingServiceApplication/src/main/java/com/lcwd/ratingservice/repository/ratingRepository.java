package com.lcwd.ratingservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lcwd.ratingservice.entity.Rating;

public interface ratingRepository extends JpaRepository<Rating, String> {

	//custom finder method
	List<Rating> findByUserId(String userId);
	List<Rating> findByHotelId(String hotelId);


}
