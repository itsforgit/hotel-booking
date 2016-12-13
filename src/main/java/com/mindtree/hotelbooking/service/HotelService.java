package com.mindtree.hotelbooking.service;

import java.util.List;

import com.mindtree.hotelbooking.model.City;
import com.mindtree.hotelbooking.model.Hotel;

public interface HotelService {

	public List<Hotel> findAllByCity(Long cityID);

	public List<Hotel> findAllByCityOrderByRatingAsc(City city);

	public List<Hotel> findAllByCityOrderByHotelNameAsc(City city);

	public Hotel findOne(long hotelID);

	public List<Hotel> findAllByCityOrderByTariffPerDayAsc(City city);

}
