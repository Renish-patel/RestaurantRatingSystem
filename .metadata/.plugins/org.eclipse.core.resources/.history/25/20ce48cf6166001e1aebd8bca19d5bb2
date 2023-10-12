package com.lcwd.ratingservice.Imple;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcwd.ratingservice.entity.Rating;
import com.lcwd.ratingservice.repository.ratingRepository;
import com.lcwd.ratingservice.service.ratingService;

@Service
public class ratingServiceImple implements ratingService {
	
	@Autowired
	private ratingRepository ratingRepository;
	
	@Override
	public Rating createRating(Rating rating) {
		String id =  UUID.randomUUID().toString();
		rating.setRatingId(id);
		return ratingRepository.save(rating);
	}

	@Override
	public List<Rating> getallRatings() {
		
		return ratingRepository.findAll();
	}

	@Override
	public List<Rating> getByUserId(String userId) {
		return ratingRepository.findByUserId(userId);
	}

	@Override
	public List<Rating> getByHotelId(String hotelId) {
		return ratingRepository.findByHotelId(hotelId);
	}

}
