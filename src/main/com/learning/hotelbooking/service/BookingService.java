package com.learning.hotelbooking.service;

import com.learning.hotelbooking.model.BookingEntity;
import com.learning.hotelbooking.view.Booking;

public interface BookingService {

    public BookingEntity addBooking(Booking booking ) throws Exception;

}
