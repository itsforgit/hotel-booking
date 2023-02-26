package com.learning.hotelbooking.service.impl;

import com.learning.hotelbooking.exception.NoRecordFoundException;
import com.learning.hotelbooking.exception.ValidationException;
import com.learning.hotelbooking.model.BookingEntity;
import com.learning.hotelbooking.model.City;
import com.learning.hotelbooking.model.Hotel;
import com.learning.hotelbooking.repository.BookingRepository;
import com.learning.hotelbooking.service.BookingService;
import com.learning.hotelbooking.service.CityService;
import com.learning.hotelbooking.service.HotelService;
import com.learning.hotelbooking.view.Booking;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

@Service
public class BookingServiceImpl implements BookingService {

    private final BookingRepository bookingRepository;

    private final HotelService hotelService;

    private final CityService cityService;

    public BookingServiceImpl(BookingRepository bookingRepository, HotelService hotelService, CityService cityService) {
        this.bookingRepository = bookingRepository;
        this.hotelService = hotelService;
        this.cityService = cityService;
    }


    @Override
    @Transactional
    public BookingEntity addBooking(Booking booking) throws Exception {
        BookingEntity bookingEntity = this.getBookingDetails(booking);

        return bookingRepository.save(bookingEntity);
    }

    public BookingEntity getBookingDetails(Booking b) throws Exception {
        BookingEntity booking = new BookingEntity();
        if (null == b.getNoOfRooms()) {
            throw new ValidationException("Error-2", "this is mandatory Field");
        }
        booking.setCustomerName(b.getCustomerName());
        booking.setNoOfRooms(b.getNoOfRooms());
        booking.setCreatedDate(new Date());
        booking.setCheckInDate(b.getCheckInDate());
        booking.setCheckOutDate(b.getCheckOutDate());
        Hotel hotel;
        if (null == b.getHotelID() || b.getHotelID().isEmpty()) {
            throw new ValidationException("Error-2", "this is mandatory Field");
        }
        if (null == b.getCityID() || b.getCityID().isEmpty()) {
            throw new ValidationException("Error-2", "this is mandatory Field");
        }

        if (b.getHotelID().equalsIgnoreCase("10")) {
            hotel = hotelService.findOne(1L);
            if (hotel == null) {
                throw new NoRecordFoundException("ERRO1", "No Data found");
            }
        } else {
            Long hotelId;
            try {
                hotelId = Long.parseLong(b.getHotelID());
            } catch (NumberFormatException nfe) {
                throw new ValidationException("Error-3", "NumberFormat Exception: invalid input string");
            }
            hotel = hotelService.findOne(hotelId);
            if (hotel == null) {
                throw new NoRecordFoundException("ERRO1", "Hotel not Found");
            }
        }
        Long cityId;
        try {
            cityId = Long.parseLong(b.getCityID());
        } catch (NumberFormatException nfe) {
            throw new ValidationException("Error-3", "NumberFormat Exception: invalid input string");
        }

        City city = cityService.findOne(cityId);
        if (city == null) {
            throw new NoRecordFoundException("ERRO1", "City not found");
        }
        booking.setCity(city);
        booking.setAdults(b.getAdults());
        booking.setChildren(b.getChildren());
        booking.setEmailID(b.getEmailID());
        // Find the days between
        Period daysBetween = Period.between(b.getCheckInDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
                b.getCheckOutDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        // Calculate the amount
        if (null == b.getNoOfRooms()) {
            throw new ValidationException("Error-2", "this is mandatory Field");
        }

        Double totalAmt = b.getNoOfRooms() * hotel.getTariffPerDay() * daysBetween.getDays();
        booking.setTotalAmt(totalAmt);
        booking.setHotel(hotel);
        return booking;
    }
}
