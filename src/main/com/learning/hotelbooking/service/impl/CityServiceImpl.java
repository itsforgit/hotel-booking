package com.learning.hotelbooking.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.learning.hotelbooking.model.City;
import com.learning.hotelbooking.repository.CityRepository;
import com.learning.hotelbooking.service.CityService;

@Service
public class CityServiceImpl implements CityService {

	private final CityRepository repository;

	public CityServiceImpl(CityRepository repository) {
		this.repository = repository;
	}

	@Override
	@Transactional
	public List<City> findAll() {
		return (List<City>) repository.findAll();
	}

	@Override
	@Transactional
	public City findOne(Long cityID) {
		return repository.findById(cityID).orElse(null);
	}

}
