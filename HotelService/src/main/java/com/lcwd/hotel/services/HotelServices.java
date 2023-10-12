package com.lcwd.hotel.services;

import java.util.List;

import com.lcwd.hotel.entity.Hotel;

public interface HotelServices {

	//create 
	Hotel create(Hotel hotel);
	
	//getall
	List<Hotel> getall();
	
	//get single
	Hotel getHotel(String id);
}
