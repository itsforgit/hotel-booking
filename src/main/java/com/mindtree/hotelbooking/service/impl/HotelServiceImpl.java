package com.mindtree.hotelbooking.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.hotelbooking.model.City;
import com.mindtree.hotelbooking.model.Hotel;
import com.mindtree.hotelbooking.repository.HotelRepository;
import com.mindtree.hotelbooking.service.HotelService;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	private HotelRepository repository;

	@Override
	public List<Hotel> findAllByCity(Long cityID) {
		return repository.findAllByCityOrderByHotelNameAsc(cityID);
	}

	@Override
	public Hotel findOne(long hotelID) {
		return repository.findOne(hotelID);
	}

	@Override
	public List<Hotel> findAllByCityOrderByTariffPerDayAsc(City city) {
		return repository.findAllByCityOrderByTariffPerDayAsc(city);
	}

	@Override
	public List<Hotel> findAllByCityOrderByRatingAsc(City city) {
		return repository.findAllByCityOrderByRatingAsc(city);
	}

	@Override
	public List<Hotel> findAllByCityOrderByHotelNameAsc(City city) {
		return repository.findAllByCityOrderByHotelNameAsc(city);
	}

}
