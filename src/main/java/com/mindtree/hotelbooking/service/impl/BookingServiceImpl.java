package com.mindtree.hotelbooking.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mindtree.hotelbooking.model.Booking;
import com.mindtree.hotelbooking.repository.BookingRepository;
import com.mindtree.hotelbooking.service.BookingService;

@Service
public class BookingServiceImpl implements BookingService {

	@Autowired
    private BookingRepository bookingRepository;


    @Override
    @Transactional
    public Booking addBooking(Booking booking) {
    	return bookingRepository.save(booking);
    }

}
