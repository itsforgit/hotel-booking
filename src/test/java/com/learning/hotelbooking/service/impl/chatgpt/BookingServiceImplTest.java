package com.learning.hotelbooking.service.impl.chatgpt;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

import com.learning.hotelbooking.model.BookingEntity;
import com.learning.hotelbooking.model.City;
import com.learning.hotelbooking.model.Hotel;
import com.learning.hotelbooking.repository.BookingRepository;
import com.learning.hotelbooking.service.CityService;
import com.learning.hotelbooking.service.HotelService;
import com.learning.hotelbooking.service.impl.BookingServiceImpl;
import com.learning.hotelbooking.view.Booking;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class BookingServiceImplTest {

    @Mock
    private BookingRepository bookingRepository;

    @Mock
    private HotelService hotelService;

    @Mock
    private CityService cityService;

    @InjectMocks
    private BookingServiceImpl bookingService;

    private Booking booking;

    @BeforeEach
    public void setUp() {
        booking = new Booking();
        booking.setCustomerName("John Smith");
        booking.setNoOfRooms(2);
        booking.setCheckInDate(new Date());
        booking.setCheckOutDate(new Date());
        booking.setHotelID("1");
        booking.setCityID("1");
        booking.setAdults(2);
        booking.setChildren(0);
        booking.setEmailID("john.smith@example.com");
    }

    @Test
    @DisplayName("Add Booking")
    public void testAddBooking() throws Exception {
        Hotel hotel = new Hotel();
        hotel.setTariffPerDay(100.0);
        when(hotelService.findOne(1L)).thenReturn(hotel);
        when(cityService.findOne(1L)).thenReturn(new City());
        BookingEntity bookingEntity = new BookingEntity();
        bookingEntity.setCustomerName(booking.getCustomerName());
        bookingEntity.setNoOfRooms(booking.getNoOfRooms());
        bookingEntity.setCreatedDate(new Date());
        bookingEntity.setCheckInDate(booking.getCheckInDate());
        bookingEntity.setCheckOutDate(booking.getCheckOutDate());
        bookingEntity.setCity(cityService.findOne(1L));
        bookingEntity.setAdults(booking.getAdults());
        bookingEntity.setChildren(booking.getChildren());
        bookingEntity.setEmailID(booking.getEmailID());
        Period daysBetween = Period.between(booking.getCheckInDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
                booking.getCheckOutDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        Double totalAmt = booking.getNoOfRooms() * hotel.getTariffPerDay() * daysBetween.getDays();
        bookingEntity.setTotalAmt(totalAmt);
        bookingEntity.setHotel(hotel);
        when(bookingRepository.save(any(BookingEntity.class))).thenReturn(bookingEntity);
        BookingEntity savedBooking = bookingService.addBooking(booking);
        assertNotNull(savedBooking);
        assertEquals(bookingEntity.getCustomerName(), savedBooking.getCustomerName());
        assertEquals(bookingEntity.getNoOfRooms(), savedBooking.getNoOfRooms());
        assertEquals(bookingEntity.getCreatedDate(), savedBooking.getCreatedDate());
        assertEquals(bookingEntity.getCheckInDate(), savedBooking.getCheckInDate());
        assertEquals(bookingEntity.getCheckOutDate(), savedBooking.getCheckOutDate());
        assertEquals(bookingEntity.getCity(), savedBooking.getCity());
        assertEquals(bookingEntity.getAdults(), savedBooking.getAdults());
        assertEquals(bookingEntity.getChildren(), savedBooking.getChildren());
        assertEquals(bookingEntity.getEmailID(), savedBooking.getEmailID());
        assertEquals(bookingEntity.getTotalAmt(), savedBooking.getTotalAmt());
        assertEquals(bookingEntity.getHotel(), savedBooking.getHotel());
        verify(hotelService, times(1)).findOne(1L);
    }

}
