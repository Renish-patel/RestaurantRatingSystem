package com.lcwd.user.service.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Rating {
	
	private String ratingId;
	private String userId;
	private int rating;
	private String hotelId;
	private String feedback;	
	private Hotel hotels;
}
