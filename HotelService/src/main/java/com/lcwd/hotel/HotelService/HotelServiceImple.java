package com.lcwd.hotel.HotelService;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcwd.hotel.Repository.HotelRepo;
import com.lcwd.hotel.entity.Hotel;
import com.lcwd.hotel.exception.ResourceNotFound;
import com.lcwd.hotel.services.HotelServices;

@Service
public class HotelServiceImple implements HotelServices {
	
	@Autowired
	private HotelRepo hotelRepo;
	
	//save 
	@Override
	public Hotel create(Hotel hotel) {
		String id =  UUID.randomUUID().toString();
		hotel.setId(id);
		return hotelRepo.save(hotel);
	}

	// find all in database 
	@Override
	public List<Hotel> getall() {
		// TODO Auto-generated method stub
		return hotelRepo.findAll();
	}

	
	@Override
	public Hotel getHotel(String id) {	
		// TODO Auto-generated method stub
		return hotelRepo.findById(id).orElseThrow(()-> new ResourceNotFound("userId doesnot found"));
	}

}
