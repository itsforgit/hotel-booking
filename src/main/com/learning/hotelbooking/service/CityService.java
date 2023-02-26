package com.learning.hotelbooking.service;

import java.util.List;

import com.learning.hotelbooking.model.City;


public interface CityService {

    public List<City> findAll();

	public City findOne(Long cityID);

}
