package com.mindtree.hotelbooking.service;

import java.util.List;

import com.mindtree.hotelbooking.model.City;


public interface CityService {

    public List<City> findAll();

	public City findOne(Long cityID);

}
