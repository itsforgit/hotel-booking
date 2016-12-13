/**
 * 
 */
package com.mindtree.hotelbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.hotelbooking.model.Hotel;
import com.mindtree.hotelbooking.service.HotelService;

/**
 * @author M1030360
 *
 */
@RestController
public class HotelController {

	@Autowired
	HotelService hotelService;

	@RequestMapping("/hotelByCity")
	public List<Hotel> greeting(@RequestParam(value = "cityId") Long cityId) {
		return hotelService.findAllByCity(cityId);
	}
}
