/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.learning.hotelbooking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.learning.hotelbooking.model.City;
import com.learning.hotelbooking.model.Hotel;

@Repository
public interface HotelRepository extends CrudRepository<Hotel, Long> {

	public static final String FIND_HOTEL = "SELECT new com.learning.hotelbooking.model.Hotel(id, hotelName) FROM Hotel where city.cityId=?1";

	public List<Hotel> findAllByCityOrderByTariffPerDayAsc(City city);

	public List<Hotel> findAllByCityOrderByRatingAsc(City city);

	public List<Hotel> findAllByCityOrderByHotelNameAsc(City city);

	@Query(value = FIND_HOTEL)
	public List<Hotel> findAllByCityOrderByHotelNameAsc(Long city);
}
