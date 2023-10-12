package com.lcwd.hotel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lcwd.hotel.entity.Hotel;

public interface HotelRepo extends JpaRepository<Hotel,String>{

}
