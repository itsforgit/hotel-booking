package com.mindtree.hotelbooking.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mindtree.hotelbooking.model.City;
import com.mindtree.hotelbooking.repository.CityRepository;
import com.mindtree.hotelbooking.service.CityService;

@Service
public class CityServiceImpl implements CityService {

	@Autowired
	private CityRepository repository;

	@Override
	@Transactional
	public List<City> findAll() {
		return (List<City>) repository.findAll();
	}

	@Override
	@Transactional
	public City findOne(Long cityID) {
		return repository.findOne(cityID);
	}

}
