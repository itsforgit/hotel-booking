package com.learning.hotelbooking.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.anyLong;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.learning.hotelbooking.exception.NoRecordFoundException;
import com.learning.hotelbooking.exception.ValidationException;
import com.learning.hotelbooking.model.BookingEntity;
import com.learning.hotelbooking.model.City;
import com.learning.hotelbooking.model.Hotel;
import com.learning.hotelbooking.repository.BookingRepository;
import com.learning.hotelbooking.repository.CityRepository;
import com.learning.hotelbooking.service.CityService;
import com.learning.hotelbooking.service.HotelService;
import com.learning.hotelbooking.view.Booking;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {BookingServiceImpl.class, Booking.class})
@ExtendWith(SpringExtension.class)
class BookingServiceImplTest {
    @Autowired
    private Booking booking;

    @MockBean
    private BookingRepository bookingRepository;

    @Autowired
    private BookingServiceImpl bookingServiceImpl;

    @MockBean
    private CityService cityService;

    @MockBean
    private HotelService hotelService;

    /**
     * Method under test: {@link BookingServiceImpl#addBooking(Booking)}
     */
    @Test
    void testAddBooking() throws Exception {
        assertThrows(ValidationException.class, () -> bookingServiceImpl.addBooking(booking));
        assertThrows(ValidationException.class, () -> bookingServiceImpl.addBooking(booking));
    }

    /**
     * Method under test: {@link BookingServiceImpl#addBooking(Booking)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAddBooking2() throws Exception {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()"
        //   because the return value of "com.learning.hotelbooking.view.Booking.getNoOfRooms()" is null
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.getBookingDetails(BookingServiceImpl.java:50)
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.addBooking(BookingServiceImpl.java:39)
        //   In order to prevent addBooking(Booking)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   addBooking(Booking).
        //   See https://diff.blue/R013 to resolve this issue.

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because the return value of "com.learning.hotelbooking.view.Booking.getNoOfRooms()" is null
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.getBookingDetails(BookingServiceImpl.java:50)
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.addBooking(BookingServiceImpl.java:39)
        //   In order to prevent addBooking(Booking)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   addBooking(Booking).
        //   See https://diff.blue/R013 to resolve this issue.

        BookingRepository bookingRepository = mock(BookingRepository.class);
        HotelServiceImpl hotelService = new HotelServiceImpl();
        BookingServiceImpl bookingServiceImpl = new BookingServiceImpl(bookingRepository, hotelService,
                new CityServiceImpl(mock(CityRepository.class)));
        bookingServiceImpl.addBooking(new Booking());
    }

    /**
     * Method under test: {@link BookingServiceImpl#addBooking(Booking)}
     */
    @Test
    void testAddBooking3() throws Exception {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because the return value of "com.learning.hotelbooking.view.Booking.getNoOfRooms()" is null
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.getBookingDetails(BookingServiceImpl.java:50)
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.addBooking(BookingServiceImpl.java:39)
        //   In order to prevent addBooking(Booking)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   addBooking(Booking).
        //   See https://diff.blue/R013 to resolve this issue.

        BookingRepository bookingRepository = mock(BookingRepository.class);
        HotelServiceImpl hotelService = new HotelServiceImpl();
        BookingServiceImpl bookingServiceImpl = new BookingServiceImpl(bookingRepository, hotelService,
                new CityServiceImpl(mock(CityRepository.class)));

        Booking booking = new Booking();
        booking.setNoOfRooms(1000);
        assertThrows(ValidationException.class, () -> bookingServiceImpl.addBooking(booking));
    }

    /**
     * Method under test: {@link BookingServiceImpl#addBooking(Booking)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAddBooking4() throws Exception {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because the return value of "com.learning.hotelbooking.view.Booking.getNoOfRooms()" is null
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.getBookingDetails(BookingServiceImpl.java:50)
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.addBooking(BookingServiceImpl.java:39)
        //   In order to prevent addBooking(Booking)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   addBooking(Booking).
        //   See https://diff.blue/R013 to resolve this issue.

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.learning.hotelbooking.view.Booking.getCustomerName()" because "b" is null
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.getBookingDetails(BookingServiceImpl.java:49)
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.addBooking(BookingServiceImpl.java:39)
        //   In order to prevent addBooking(Booking)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   addBooking(Booking).
        //   See https://diff.blue/R013 to resolve this issue.

        BookingRepository bookingRepository = mock(BookingRepository.class);
        HotelServiceImpl hotelService = new HotelServiceImpl();
        (new BookingServiceImpl(bookingRepository, hotelService, new CityServiceImpl(mock(CityRepository.class))))
                .addBooking(null);
    }

    /**
     * Method under test: {@link BookingServiceImpl#addBooking(Booking)}
     */
    @Test
    void testAddBooking5() throws Exception {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because the return value of "com.learning.hotelbooking.view.Booking.getNoOfRooms()" is null
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.getBookingDetails(BookingServiceImpl.java:50)
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.addBooking(BookingServiceImpl.java:39)
        //   In order to prevent addBooking(Booking)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   addBooking(Booking).
        //   See https://diff.blue/R013 to resolve this issue.

        BookingRepository bookingRepository = mock(BookingRepository.class);
        HotelServiceImpl hotelService = new HotelServiceImpl();
        BookingServiceImpl bookingServiceImpl = new BookingServiceImpl(bookingRepository, hotelService,
                new CityServiceImpl(mock(CityRepository.class)));
        Booking booking = mock(Booking.class);
        when(booking.getCityID()).thenReturn("Oxford");
        when(booking.getNoOfRooms()).thenReturn(1000);
        when(booking.getCustomerName()).thenReturn("Customer Name");
        when(booking.getHotelID()).thenReturn("Hotel ID");
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        when(booking.getCheckInDate()).thenReturn(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        when(booking.getCheckOutDate()).thenReturn(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        assertThrows(ValidationException.class, () -> bookingServiceImpl.addBooking(booking));
        verify(booking, atLeast(1)).getNoOfRooms();
        verify(booking, atLeast(1)).getCityID();
        verify(booking).getCustomerName();
        verify(booking, atLeast(1)).getHotelID();
        verify(booking).getCheckInDate();
        verify(booking).getCheckOutDate();
    }

    /**
     * Method under test: {@link BookingServiceImpl#addBooking(Booking)}
     */
    @Test
    void testAddBooking6() throws Exception {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because the return value of "com.learning.hotelbooking.view.Booking.getNoOfRooms()" is null
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.getBookingDetails(BookingServiceImpl.java:50)
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.addBooking(BookingServiceImpl.java:39)
        //   In order to prevent addBooking(Booking)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   addBooking(Booking).
        //   See https://diff.blue/R013 to resolve this issue.

        BookingRepository bookingRepository = mock(BookingRepository.class);
        HotelServiceImpl hotelService = new HotelServiceImpl();
        BookingServiceImpl bookingServiceImpl = new BookingServiceImpl(bookingRepository, hotelService,
                new CityServiceImpl(mock(CityRepository.class)));
        Booking booking = mock(Booking.class);
        when(booking.getCityID()).thenThrow(new NumberFormatException("Error-2"));
        when(booking.getNoOfRooms()).thenReturn(1000);
        when(booking.getCustomerName()).thenReturn("Customer Name");
        when(booking.getHotelID()).thenReturn("Hotel ID");
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        when(booking.getCheckInDate()).thenReturn(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        when(booking.getCheckOutDate()).thenReturn(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        assertThrows(NumberFormatException.class, () -> bookingServiceImpl.addBooking(booking));
        verify(booking, atLeast(1)).getNoOfRooms();
        verify(booking).getCityID();
        verify(booking).getCustomerName();
        verify(booking, atLeast(1)).getHotelID();
        verify(booking).getCheckInDate();
        verify(booking).getCheckOutDate();
    }

    /**
     * Method under test: {@link BookingServiceImpl#addBooking(Booking)}
     */
    @Test
    void testAddBooking7() throws Exception {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because the return value of "com.learning.hotelbooking.view.Booking.getNoOfRooms()" is null
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.getBookingDetails(BookingServiceImpl.java:50)
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.addBooking(BookingServiceImpl.java:39)
        //   In order to prevent addBooking(Booking)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   addBooking(Booking).
        //   See https://diff.blue/R013 to resolve this issue.

        BookingRepository bookingRepository = mock(BookingRepository.class);
        HotelServiceImpl hotelService = new HotelServiceImpl();
        BookingServiceImpl bookingServiceImpl = new BookingServiceImpl(bookingRepository, hotelService,
                new CityServiceImpl(mock(CityRepository.class)));
        Booking booking = mock(Booking.class);
        when(booking.getCityID()).thenReturn("");
        when(booking.getNoOfRooms()).thenReturn(1000);
        when(booking.getCustomerName()).thenReturn("Customer Name");
        when(booking.getHotelID()).thenReturn("Hotel ID");
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        when(booking.getCheckInDate()).thenReturn(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        when(booking.getCheckOutDate()).thenReturn(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        assertThrows(ValidationException.class, () -> bookingServiceImpl.addBooking(booking));
        verify(booking, atLeast(1)).getNoOfRooms();
        verify(booking, atLeast(1)).getCityID();
        verify(booking).getCustomerName();
        verify(booking, atLeast(1)).getHotelID();
        verify(booking).getCheckInDate();
        verify(booking).getCheckOutDate();
    }

    /**
     * Method under test: {@link BookingServiceImpl#addBooking(Booking)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAddBooking8() throws Exception {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because the return value of "com.learning.hotelbooking.view.Booking.getNoOfRooms()" is null
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.getBookingDetails(BookingServiceImpl.java:50)
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.addBooking(BookingServiceImpl.java:39)
        //   In order to prevent addBooking(Booking)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   addBooking(Booking).
        //   See https://diff.blue/R013 to resolve this issue.

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.learning.hotelbooking.repository.HotelRepository.findById(Object)" because "this.repository" is null
        //       at com.learning.hotelbooking.service.impl.HotelServiceImpl.findOne(HotelServiceImpl.java:26)
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.getBookingDetails(BookingServiceImpl.java:66)
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.addBooking(BookingServiceImpl.java:39)
        //   In order to prevent addBooking(Booking)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   addBooking(Booking).
        //   See https://diff.blue/R013 to resolve this issue.

        BookingRepository bookingRepository = mock(BookingRepository.class);
        HotelServiceImpl hotelService = new HotelServiceImpl();
        BookingServiceImpl bookingServiceImpl = new BookingServiceImpl(bookingRepository, hotelService,
                new CityServiceImpl(mock(CityRepository.class)));
        Booking booking = mock(Booking.class);
        when(booking.getCityID()).thenReturn("Oxford");
        when(booking.getNoOfRooms()).thenReturn(1000);
        when(booking.getCustomerName()).thenReturn("Customer Name");
        when(booking.getHotelID()).thenReturn("10");
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        when(booking.getCheckInDate()).thenReturn(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        when(booking.getCheckOutDate()).thenReturn(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        bookingServiceImpl.addBooking(booking);
    }

    /**
     * Method under test: {@link BookingServiceImpl#addBooking(Booking)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAddBooking9() throws Exception {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because the return value of "com.learning.hotelbooking.view.Booking.getNoOfRooms()" is null
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.getBookingDetails(BookingServiceImpl.java:50)
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.addBooking(BookingServiceImpl.java:39)
        //   In order to prevent addBooking(Booking)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   addBooking(Booking).
        //   See https://diff.blue/R013 to resolve this issue.

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.learning.hotelbooking.repository.HotelRepository.findById(Object)" because "this.repository" is null
        //       at com.learning.hotelbooking.service.impl.HotelServiceImpl.findOne(HotelServiceImpl.java:26)
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.getBookingDetails(BookingServiceImpl.java:77)
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.addBooking(BookingServiceImpl.java:39)
        //   In order to prevent addBooking(Booking)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   addBooking(Booking).
        //   See https://diff.blue/R013 to resolve this issue.

        BookingRepository bookingRepository = mock(BookingRepository.class);
        HotelServiceImpl hotelService = new HotelServiceImpl();
        BookingServiceImpl bookingServiceImpl = new BookingServiceImpl(bookingRepository, hotelService,
                new CityServiceImpl(mock(CityRepository.class)));
        Booking booking = mock(Booking.class);
        when(booking.getCityID()).thenReturn("Oxford");
        when(booking.getNoOfRooms()).thenReturn(1000);
        when(booking.getCustomerName()).thenReturn("Customer Name");
        when(booking.getHotelID()).thenReturn("42");
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        when(booking.getCheckInDate()).thenReturn(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        when(booking.getCheckOutDate()).thenReturn(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        bookingServiceImpl.addBooking(booking);
    }

    /**
     * Method under test: {@link BookingServiceImpl#addBooking(Booking)}
     */
    @Test
    void testAddBooking10() throws Exception {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because the return value of "com.learning.hotelbooking.view.Booking.getNoOfRooms()" is null
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.getBookingDetails(BookingServiceImpl.java:50)
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.addBooking(BookingServiceImpl.java:39)
        //   In order to prevent addBooking(Booking)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   addBooking(Booking).
        //   See https://diff.blue/R013 to resolve this issue.

        BookingRepository bookingRepository = mock(BookingRepository.class);
        HotelServiceImpl hotelService = new HotelServiceImpl();
        BookingServiceImpl bookingServiceImpl = new BookingServiceImpl(bookingRepository, hotelService,
                new CityServiceImpl(mock(CityRepository.class)));
        Booking booking = mock(Booking.class);
        when(booking.getCityID()).thenReturn("Oxford");
        when(booking.getNoOfRooms()).thenReturn(1000);
        when(booking.getCustomerName()).thenReturn("Customer Name");
        when(booking.getHotelID()).thenReturn("");
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        when(booking.getCheckInDate()).thenReturn(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        when(booking.getCheckOutDate()).thenReturn(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        assertThrows(ValidationException.class, () -> bookingServiceImpl.addBooking(booking));
        verify(booking, atLeast(1)).getNoOfRooms();
        verify(booking).getCustomerName();
        verify(booking, atLeast(1)).getHotelID();
        verify(booking).getCheckInDate();
        verify(booking).getCheckOutDate();
    }

    /**
     * Method under test: {@link BookingServiceImpl#addBooking(Booking)}
     */
    @Test
    void testAddBooking11() throws Exception {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because the return value of "com.learning.hotelbooking.view.Booking.getNoOfRooms()" is null
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.getBookingDetails(BookingServiceImpl.java:50)
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.addBooking(BookingServiceImpl.java:39)
        //   In order to prevent addBooking(Booking)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   addBooking(Booking).
        //   See https://diff.blue/R013 to resolve this issue.

        City city = new City();
        city.setBookings(new ArrayList<>());
        city.setCityId(123L);
        city.setCityName("Oxford");
        city.setHotels(new ArrayList<>());

        Hotel hotel = new Hotel();
        hotel.setCity(city);
        hotel.setHotelImgPath("Hotel Img Path");
        hotel.setHotelName("Hotel Name");
        hotel.setId(123L);
        hotel.setNoOfRooms(1000);
        hotel.setRating("Rating");
        hotel.setTariffPerDay(10.0d);
        HotelService hotelService = mock(HotelService.class);
        when(hotelService.findOne(anyLong())).thenReturn(hotel);
        BookingRepository bookingRepository = mock(BookingRepository.class);
        BookingServiceImpl bookingServiceImpl = new BookingServiceImpl(bookingRepository, hotelService,
                new CityServiceImpl(mock(CityRepository.class)));
        Booking booking = mock(Booking.class);
        when(booking.getCityID()).thenReturn("Oxford");
        when(booking.getNoOfRooms()).thenReturn(1000);
        when(booking.getCustomerName()).thenReturn("Customer Name");
        when(booking.getHotelID()).thenReturn("10");
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        when(booking.getCheckInDate()).thenReturn(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        when(booking.getCheckOutDate()).thenReturn(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        assertThrows(ValidationException.class, () -> bookingServiceImpl.addBooking(booking));
        verify(hotelService).findOne(anyLong());
        verify(booking, atLeast(1)).getNoOfRooms();
        verify(booking, atLeast(1)).getCityID();
        verify(booking).getCustomerName();
        verify(booking, atLeast(1)).getHotelID();
        verify(booking).getCheckInDate();
        verify(booking).getCheckOutDate();
    }

    /**
     * Method under test: {@link BookingServiceImpl#addBooking(Booking)}
     */
    @Test
    void testAddBooking12() throws Exception {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because the return value of "com.learning.hotelbooking.view.Booking.getNoOfRooms()" is null
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.getBookingDetails(BookingServiceImpl.java:50)
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.addBooking(BookingServiceImpl.java:39)
        //   In order to prevent addBooking(Booking)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   addBooking(Booking).
        //   See https://diff.blue/R013 to resolve this issue.

        City city = new City();
        city.setBookings(new ArrayList<>());
        city.setCityId(123L);
        city.setCityName("Oxford");
        city.setHotels(new ArrayList<>());

        City city1 = new City();
        city1.setBookings(new ArrayList<>());
        city1.setCityId(123L);
        city1.setCityName("Oxford");
        city1.setHotels(new ArrayList<>());

        Hotel hotel = new Hotel();
        hotel.setCity(city1);
        hotel.setHotelImgPath("Hotel Img Path");
        hotel.setHotelName("Hotel Name");
        hotel.setId(123L);
        hotel.setNoOfRooms(1000);
        hotel.setRating("Rating");
        hotel.setTariffPerDay(10.0d);

        BookingEntity bookingEntity = new BookingEntity();
        bookingEntity.setAdults(1);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        bookingEntity.setCheckInDate(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        bookingEntity.setCheckOutDate(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        bookingEntity.setChildren(1);
        bookingEntity.setCity(city);
        LocalDateTime atStartOfDayResult2 = LocalDate.of(1970, 1, 1).atStartOfDay();
        bookingEntity.setCreatedDate(Date.from(atStartOfDayResult2.atZone(ZoneId.of("UTC")).toInstant()));
        bookingEntity.setCustomerName("Customer Name");
        bookingEntity.setEmailID("jane.doe@example.org");
        bookingEntity.setHotel(hotel);
        bookingEntity.setId(123L);
        bookingEntity.setNoOfRooms(1000);
        bookingEntity.setTotalAmt(10.0d);
        BookingRepository bookingRepository = mock(BookingRepository.class);
        when(bookingRepository.save((BookingEntity) any())).thenReturn(bookingEntity);

        City city2 = new City();
        city2.setBookings(new ArrayList<>());
        city2.setCityId(123L);
        city2.setCityName("Oxford");
        city2.setHotels(new ArrayList<>());

        Hotel hotel1 = new Hotel();
        hotel1.setCity(city2);
        hotel1.setHotelImgPath("Hotel Img Path");
        hotel1.setHotelName("Hotel Name");
        hotel1.setId(123L);
        hotel1.setNoOfRooms(1000);
        hotel1.setRating("Rating");
        hotel1.setTariffPerDay(10.0d);
        HotelService hotelService = mock(HotelService.class);
        when(hotelService.findOne(anyLong())).thenReturn(hotel1);

        City city3 = new City();
        city3.setBookings(new ArrayList<>());
        city3.setCityId(123L);
        city3.setCityName("Oxford");
        city3.setHotels(new ArrayList<>());
        CityRepository cityRepository = mock(CityRepository.class);
        when(cityRepository.findById((Long) any())).thenReturn(Optional.of(city3));
        BookingServiceImpl bookingServiceImpl = new BookingServiceImpl(bookingRepository, hotelService,
                new CityServiceImpl(cityRepository));
        Booking booking = mock(Booking.class);
        when(booking.getAdults()).thenReturn(1);
        when(booking.getChildren()).thenReturn(1);
        when(booking.getEmailID()).thenReturn("jane.doe@example.org");
        when(booking.getCityID()).thenReturn("10");
        when(booking.getNoOfRooms()).thenReturn(1000);
        when(booking.getCustomerName()).thenReturn("Customer Name");
        when(booking.getHotelID()).thenReturn("10");
        LocalDateTime atStartOfDayResult3 = LocalDate.of(1970, 1, 1).atStartOfDay();
        when(booking.getCheckInDate()).thenReturn(Date.from(atStartOfDayResult3.atZone(ZoneId.of("UTC")).toInstant()));
        LocalDateTime atStartOfDayResult4 = LocalDate.of(1970, 1, 1).atStartOfDay();
        when(booking.getCheckOutDate()).thenReturn(Date.from(atStartOfDayResult4.atZone(ZoneId.of("UTC")).toInstant()));
        assertSame(bookingEntity, bookingServiceImpl.addBooking(booking));
        verify(bookingRepository).save((BookingEntity) any());
        verify(hotelService).findOne(anyLong());
        verify(cityRepository).findById((Long) any());
        verify(booking).getAdults();
        verify(booking).getChildren();
        verify(booking, atLeast(1)).getNoOfRooms();
        verify(booking, atLeast(1)).getCityID();
        verify(booking).getCustomerName();
        verify(booking).getEmailID();
        verify(booking, atLeast(1)).getHotelID();
        verify(booking, atLeast(1)).getCheckInDate();
        verify(booking, atLeast(1)).getCheckOutDate();
    }

    /**
     * Method under test: {@link BookingServiceImpl#addBooking(Booking)}
     */
    @Test
    void testAddBooking13() throws Exception {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because the return value of "com.learning.hotelbooking.view.Booking.getNoOfRooms()" is null
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.getBookingDetails(BookingServiceImpl.java:50)
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.addBooking(BookingServiceImpl.java:39)
        //   In order to prevent addBooking(Booking)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   addBooking(Booking).
        //   See https://diff.blue/R013 to resolve this issue.

        City city = new City();
        city.setBookings(new ArrayList<>());
        city.setCityId(123L);
        city.setCityName("Oxford");
        city.setHotels(new ArrayList<>());

        City city1 = new City();
        city1.setBookings(new ArrayList<>());
        city1.setCityId(123L);
        city1.setCityName("Oxford");
        city1.setHotels(new ArrayList<>());

        Hotel hotel = new Hotel();
        hotel.setCity(city1);
        hotel.setHotelImgPath("Hotel Img Path");
        hotel.setHotelName("Hotel Name");
        hotel.setId(123L);
        hotel.setNoOfRooms(1000);
        hotel.setRating("Rating");
        hotel.setTariffPerDay(10.0d);

        BookingEntity bookingEntity = new BookingEntity();
        bookingEntity.setAdults(1);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        bookingEntity.setCheckInDate(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        bookingEntity.setCheckOutDate(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        bookingEntity.setChildren(1);
        bookingEntity.setCity(city);
        LocalDateTime atStartOfDayResult2 = LocalDate.of(1970, 1, 1).atStartOfDay();
        bookingEntity.setCreatedDate(Date.from(atStartOfDayResult2.atZone(ZoneId.of("UTC")).toInstant()));
        bookingEntity.setCustomerName("Customer Name");
        bookingEntity.setEmailID("jane.doe@example.org");
        bookingEntity.setHotel(hotel);
        bookingEntity.setId(123L);
        bookingEntity.setNoOfRooms(1000);
        bookingEntity.setTotalAmt(10.0d);
        BookingRepository bookingRepository = mock(BookingRepository.class);
        when(bookingRepository.save((BookingEntity) any())).thenReturn(bookingEntity);

        City city2 = new City();
        city2.setBookings(new ArrayList<>());
        city2.setCityId(123L);
        city2.setCityName("Oxford");
        city2.setHotels(new ArrayList<>());

        Hotel hotel1 = new Hotel();
        hotel1.setCity(city2);
        hotel1.setHotelImgPath("Hotel Img Path");
        hotel1.setHotelName("Hotel Name");
        hotel1.setId(123L);
        hotel1.setNoOfRooms(1000);
        hotel1.setRating("Rating");
        hotel1.setTariffPerDay(10.0d);
        HotelService hotelService = mock(HotelService.class);
        when(hotelService.findOne(anyLong())).thenReturn(hotel1);

        City city3 = new City();
        city3.setBookings(new ArrayList<>());
        city3.setCityId(123L);
        city3.setCityName("Oxford");
        city3.setHotels(new ArrayList<>());
        CityRepository cityRepository = mock(CityRepository.class);
        when(cityRepository.findById((Long) any())).thenReturn(Optional.of(city3));
        BookingServiceImpl bookingServiceImpl = new BookingServiceImpl(bookingRepository, hotelService,
                new CityServiceImpl(cityRepository));
        Booking booking = mock(Booking.class);
        when(booking.getAdults()).thenThrow(new NumberFormatException("10"));
        when(booking.getChildren()).thenThrow(new NumberFormatException("10"));
        when(booking.getEmailID()).thenThrow(new NumberFormatException("10"));
        when(booking.getCityID()).thenReturn("10");
        when(booking.getNoOfRooms()).thenReturn(1000);
        when(booking.getCustomerName()).thenReturn("Customer Name");
        when(booking.getHotelID()).thenReturn("10");
        LocalDateTime atStartOfDayResult3 = LocalDate.of(1970, 1, 1).atStartOfDay();
        when(booking.getCheckInDate()).thenReturn(Date.from(atStartOfDayResult3.atZone(ZoneId.of("UTC")).toInstant()));
        LocalDateTime atStartOfDayResult4 = LocalDate.of(1970, 1, 1).atStartOfDay();
        when(booking.getCheckOutDate()).thenReturn(Date.from(atStartOfDayResult4.atZone(ZoneId.of("UTC")).toInstant()));
        assertThrows(NumberFormatException.class, () -> bookingServiceImpl.addBooking(booking));
        verify(hotelService).findOne(anyLong());
        verify(cityRepository).findById((Long) any());
        verify(booking).getAdults();
        verify(booking, atLeast(1)).getNoOfRooms();
        verify(booking, atLeast(1)).getCityID();
        verify(booking).getCustomerName();
        verify(booking, atLeast(1)).getHotelID();
        verify(booking).getCheckInDate();
        verify(booking).getCheckOutDate();
    }

    /**
     * Method under test: {@link BookingServiceImpl#addBooking(Booking)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAddBooking14() throws Exception {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because the return value of "com.learning.hotelbooking.view.Booking.getNoOfRooms()" is null
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.getBookingDetails(BookingServiceImpl.java:50)
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.addBooking(BookingServiceImpl.java:39)
        //   In order to prevent addBooking(Booking)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   addBooking(Booking).
        //   See https://diff.blue/R013 to resolve this issue.

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.util.Optional.orElse(Object)" because the return value of "com.learning.hotelbooking.repository.CityRepository.findById(Object)" is null
        //       at com.learning.hotelbooking.service.impl.CityServiceImpl.findOne(CityServiceImpl.java:31)
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.getBookingDetails(BookingServiceImpl.java:89)
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.addBooking(BookingServiceImpl.java:39)
        //   In order to prevent addBooking(Booking)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   addBooking(Booking).
        //   See https://diff.blue/R013 to resolve this issue.

        City city = new City();
        city.setBookings(new ArrayList<>());
        city.setCityId(123L);
        city.setCityName("Oxford");
        city.setHotels(new ArrayList<>());

        City city1 = new City();
        city1.setBookings(new ArrayList<>());
        city1.setCityId(123L);
        city1.setCityName("Oxford");
        city1.setHotels(new ArrayList<>());

        Hotel hotel = new Hotel();
        hotel.setCity(city1);
        hotel.setHotelImgPath("Hotel Img Path");
        hotel.setHotelName("Hotel Name");
        hotel.setId(123L);
        hotel.setNoOfRooms(1000);
        hotel.setRating("Rating");
        hotel.setTariffPerDay(10.0d);

        BookingEntity bookingEntity = new BookingEntity();
        bookingEntity.setAdults(1);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        bookingEntity.setCheckInDate(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        bookingEntity.setCheckOutDate(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        bookingEntity.setChildren(1);
        bookingEntity.setCity(city);
        LocalDateTime atStartOfDayResult2 = LocalDate.of(1970, 1, 1).atStartOfDay();
        bookingEntity.setCreatedDate(Date.from(atStartOfDayResult2.atZone(ZoneId.of("UTC")).toInstant()));
        bookingEntity.setCustomerName("Customer Name");
        bookingEntity.setEmailID("jane.doe@example.org");
        bookingEntity.setHotel(hotel);
        bookingEntity.setId(123L);
        bookingEntity.setNoOfRooms(1000);
        bookingEntity.setTotalAmt(10.0d);
        BookingRepository bookingRepository = mock(BookingRepository.class);
        when(bookingRepository.save((BookingEntity) any())).thenReturn(bookingEntity);

        City city2 = new City();
        city2.setBookings(new ArrayList<>());
        city2.setCityId(123L);
        city2.setCityName("Oxford");
        city2.setHotels(new ArrayList<>());

        Hotel hotel1 = new Hotel();
        hotel1.setCity(city2);
        hotel1.setHotelImgPath("Hotel Img Path");
        hotel1.setHotelName("Hotel Name");
        hotel1.setId(123L);
        hotel1.setNoOfRooms(1000);
        hotel1.setRating("Rating");
        hotel1.setTariffPerDay(10.0d);
        HotelService hotelService = mock(HotelService.class);
        when(hotelService.findOne(anyLong())).thenReturn(hotel1);
        CityRepository cityRepository = mock(CityRepository.class);
        when(cityRepository.findById((Long) any())).thenReturn(null);
        BookingServiceImpl bookingServiceImpl = new BookingServiceImpl(bookingRepository, hotelService,
                new CityServiceImpl(cityRepository));
        Booking booking = mock(Booking.class);
        when(booking.getAdults()).thenReturn(1);
        when(booking.getChildren()).thenReturn(1);
        when(booking.getEmailID()).thenReturn("jane.doe@example.org");
        when(booking.getCityID()).thenReturn("10");
        when(booking.getNoOfRooms()).thenReturn(1000);
        when(booking.getCustomerName()).thenReturn("Customer Name");
        when(booking.getHotelID()).thenReturn("10");
        LocalDateTime atStartOfDayResult3 = LocalDate.of(1970, 1, 1).atStartOfDay();
        when(booking.getCheckInDate()).thenReturn(Date.from(atStartOfDayResult3.atZone(ZoneId.of("UTC")).toInstant()));
        LocalDateTime atStartOfDayResult4 = LocalDate.of(1970, 1, 1).atStartOfDay();
        when(booking.getCheckOutDate()).thenReturn(Date.from(atStartOfDayResult4.atZone(ZoneId.of("UTC")).toInstant()));
        bookingServiceImpl.addBooking(booking);
    }

    /**
     * Method under test: {@link BookingServiceImpl#addBooking(Booking)}
     */
    @Test
    void testAddBooking15() throws Exception {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because the return value of "com.learning.hotelbooking.view.Booking.getNoOfRooms()" is null
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.getBookingDetails(BookingServiceImpl.java:50)
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.addBooking(BookingServiceImpl.java:39)
        //   In order to prevent addBooking(Booking)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   addBooking(Booking).
        //   See https://diff.blue/R013 to resolve this issue.

        City city = new City();
        city.setBookings(new ArrayList<>());
        city.setCityId(123L);
        city.setCityName("Oxford");
        city.setHotels(new ArrayList<>());

        City city1 = new City();
        city1.setBookings(new ArrayList<>());
        city1.setCityId(123L);
        city1.setCityName("Oxford");
        city1.setHotels(new ArrayList<>());

        Hotel hotel = new Hotel();
        hotel.setCity(city1);
        hotel.setHotelImgPath("Hotel Img Path");
        hotel.setHotelName("Hotel Name");
        hotel.setId(123L);
        hotel.setNoOfRooms(1000);
        hotel.setRating("Rating");
        hotel.setTariffPerDay(10.0d);

        BookingEntity bookingEntity = new BookingEntity();
        bookingEntity.setAdults(1);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        bookingEntity.setCheckInDate(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        bookingEntity.setCheckOutDate(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        bookingEntity.setChildren(1);
        bookingEntity.setCity(city);
        LocalDateTime atStartOfDayResult2 = LocalDate.of(1970, 1, 1).atStartOfDay();
        bookingEntity.setCreatedDate(Date.from(atStartOfDayResult2.atZone(ZoneId.of("UTC")).toInstant()));
        bookingEntity.setCustomerName("Customer Name");
        bookingEntity.setEmailID("jane.doe@example.org");
        bookingEntity.setHotel(hotel);
        bookingEntity.setId(123L);
        bookingEntity.setNoOfRooms(1000);
        bookingEntity.setTotalAmt(10.0d);
        BookingRepository bookingRepository = mock(BookingRepository.class);
        when(bookingRepository.save((BookingEntity) any())).thenReturn(bookingEntity);

        City city2 = new City();
        city2.setBookings(new ArrayList<>());
        city2.setCityId(123L);
        city2.setCityName("Oxford");
        city2.setHotels(new ArrayList<>());

        Hotel hotel1 = new Hotel();
        hotel1.setCity(city2);
        hotel1.setHotelImgPath("Hotel Img Path");
        hotel1.setHotelName("Hotel Name");
        hotel1.setId(123L);
        hotel1.setNoOfRooms(1000);
        hotel1.setRating("Rating");
        hotel1.setTariffPerDay(10.0d);
        HotelService hotelService = mock(HotelService.class);
        when(hotelService.findOne(anyLong())).thenReturn(hotel1);
        CityRepository cityRepository = mock(CityRepository.class);
        when(cityRepository.findById((Long) any())).thenReturn(Optional.empty());
        BookingServiceImpl bookingServiceImpl = new BookingServiceImpl(bookingRepository, hotelService,
                new CityServiceImpl(cityRepository));
        Booking booking = mock(Booking.class);
        when(booking.getAdults()).thenReturn(1);
        when(booking.getChildren()).thenReturn(1);
        when(booking.getEmailID()).thenReturn("jane.doe@example.org");
        when(booking.getCityID()).thenReturn("10");
        when(booking.getNoOfRooms()).thenReturn(1000);
        when(booking.getCustomerName()).thenReturn("Customer Name");
        when(booking.getHotelID()).thenReturn("10");
        LocalDateTime atStartOfDayResult3 = LocalDate.of(1970, 1, 1).atStartOfDay();
        when(booking.getCheckInDate()).thenReturn(Date.from(atStartOfDayResult3.atZone(ZoneId.of("UTC")).toInstant()));
        LocalDateTime atStartOfDayResult4 = LocalDate.of(1970, 1, 1).atStartOfDay();
        when(booking.getCheckOutDate()).thenReturn(Date.from(atStartOfDayResult4.atZone(ZoneId.of("UTC")).toInstant()));
        assertThrows(NoRecordFoundException.class, () -> bookingServiceImpl.addBooking(booking));
        verify(hotelService).findOne(anyLong());
        verify(cityRepository).findById((Long) any());
        verify(booking, atLeast(1)).getNoOfRooms();
        verify(booking, atLeast(1)).getCityID();
        verify(booking).getCustomerName();
        verify(booking, atLeast(1)).getHotelID();
        verify(booking).getCheckInDate();
        verify(booking).getCheckOutDate();
    }

    /**
     * Method under test: {@link BookingServiceImpl#addBooking(Booking)}
     */
    @Test
    void testAddBooking16() throws Exception {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because the return value of "com.learning.hotelbooking.view.Booking.getNoOfRooms()" is null
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.getBookingDetails(BookingServiceImpl.java:50)
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.addBooking(BookingServiceImpl.java:39)
        //   In order to prevent addBooking(Booking)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   addBooking(Booking).
        //   See https://diff.blue/R013 to resolve this issue.

        City city = new City();
        city.setBookings(new ArrayList<>());
        city.setCityId(123L);
        city.setCityName("Oxford");
        city.setHotels(new ArrayList<>());

        City city1 = new City();
        city1.setBookings(new ArrayList<>());
        city1.setCityId(123L);
        city1.setCityName("Oxford");
        city1.setHotels(new ArrayList<>());

        Hotel hotel = new Hotel();
        hotel.setCity(city1);
        hotel.setHotelImgPath("Hotel Img Path");
        hotel.setHotelName("Hotel Name");
        hotel.setId(123L);
        hotel.setNoOfRooms(1000);
        hotel.setRating("Rating");
        hotel.setTariffPerDay(10.0d);

        BookingEntity bookingEntity = new BookingEntity();
        bookingEntity.setAdults(1);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        bookingEntity.setCheckInDate(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        bookingEntity.setCheckOutDate(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        bookingEntity.setChildren(1);
        bookingEntity.setCity(city);
        LocalDateTime atStartOfDayResult2 = LocalDate.of(1970, 1, 1).atStartOfDay();
        bookingEntity.setCreatedDate(Date.from(atStartOfDayResult2.atZone(ZoneId.of("UTC")).toInstant()));
        bookingEntity.setCustomerName("Customer Name");
        bookingEntity.setEmailID("jane.doe@example.org");
        bookingEntity.setHotel(hotel);
        bookingEntity.setId(123L);
        bookingEntity.setNoOfRooms(1000);
        bookingEntity.setTotalAmt(10.0d);
        BookingRepository bookingRepository = mock(BookingRepository.class);
        when(bookingRepository.save((BookingEntity) any())).thenReturn(bookingEntity);

        City city2 = new City();
        city2.setBookings(new ArrayList<>());
        city2.setCityId(123L);
        city2.setCityName("Oxford");
        city2.setHotels(new ArrayList<>());

        Hotel hotel1 = new Hotel();
        hotel1.setCity(city2);
        hotel1.setHotelImgPath("Hotel Img Path");
        hotel1.setHotelName("Hotel Name");
        hotel1.setId(123L);
        hotel1.setNoOfRooms(1000);
        hotel1.setRating("Rating");
        hotel1.setTariffPerDay(10.0d);
        HotelService hotelService = mock(HotelService.class);
        when(hotelService.findOne(anyLong())).thenReturn(hotel1);

        City city3 = new City();
        city3.setBookings(new ArrayList<>());
        city3.setCityId(123L);
        city3.setCityName("Oxford");
        city3.setHotels(new ArrayList<>());
        CityRepository cityRepository = mock(CityRepository.class);
        when(cityRepository.findById((Long) any())).thenReturn(Optional.of(city3));
        BookingServiceImpl bookingServiceImpl = new BookingServiceImpl(bookingRepository, hotelService,
                new CityServiceImpl(cityRepository));
        Booking booking = mock(Booking.class);
        when(booking.getAdults()).thenReturn(1);
        when(booking.getChildren()).thenReturn(1);
        when(booking.getEmailID()).thenReturn("jane.doe@example.org");
        when(booking.getCityID()).thenReturn(null);
        when(booking.getNoOfRooms()).thenReturn(1000);
        when(booking.getCustomerName()).thenReturn("Customer Name");
        when(booking.getHotelID()).thenReturn("10");
        LocalDateTime atStartOfDayResult3 = LocalDate.of(1970, 1, 1).atStartOfDay();
        when(booking.getCheckInDate()).thenReturn(Date.from(atStartOfDayResult3.atZone(ZoneId.of("UTC")).toInstant()));
        LocalDateTime atStartOfDayResult4 = LocalDate.of(1970, 1, 1).atStartOfDay();
        when(booking.getCheckOutDate()).thenReturn(Date.from(atStartOfDayResult4.atZone(ZoneId.of("UTC")).toInstant()));
        assertThrows(ValidationException.class, () -> bookingServiceImpl.addBooking(booking));
        verify(booking, atLeast(1)).getNoOfRooms();
        verify(booking).getCityID();
        verify(booking).getCustomerName();
        verify(booking, atLeast(1)).getHotelID();
        verify(booking).getCheckInDate();
        verify(booking).getCheckOutDate();
    }

    /**
     * Method under test: {@link BookingServiceImpl#addBooking(Booking)}
     */
    @Test
    void testAddBooking17() throws Exception {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because the return value of "com.learning.hotelbooking.view.Booking.getNoOfRooms()" is null
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.getBookingDetails(BookingServiceImpl.java:50)
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.addBooking(BookingServiceImpl.java:39)
        //   In order to prevent addBooking(Booking)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   addBooking(Booking).
        //   See https://diff.blue/R013 to resolve this issue.

        City city = new City();
        city.setBookings(new ArrayList<>());
        city.setCityId(123L);
        city.setCityName("Oxford");
        city.setHotels(new ArrayList<>());

        City city1 = new City();
        city1.setBookings(new ArrayList<>());
        city1.setCityId(123L);
        city1.setCityName("Oxford");
        city1.setHotels(new ArrayList<>());

        Hotel hotel = new Hotel();
        hotel.setCity(city1);
        hotel.setHotelImgPath("Hotel Img Path");
        hotel.setHotelName("Hotel Name");
        hotel.setId(123L);
        hotel.setNoOfRooms(1000);
        hotel.setRating("Rating");
        hotel.setTariffPerDay(10.0d);

        BookingEntity bookingEntity = new BookingEntity();
        bookingEntity.setAdults(1);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        bookingEntity.setCheckInDate(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        bookingEntity.setCheckOutDate(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        bookingEntity.setChildren(1);
        bookingEntity.setCity(city);
        LocalDateTime atStartOfDayResult2 = LocalDate.of(1970, 1, 1).atStartOfDay();
        bookingEntity.setCreatedDate(Date.from(atStartOfDayResult2.atZone(ZoneId.of("UTC")).toInstant()));
        bookingEntity.setCustomerName("Customer Name");
        bookingEntity.setEmailID("jane.doe@example.org");
        bookingEntity.setHotel(hotel);
        bookingEntity.setId(123L);
        bookingEntity.setNoOfRooms(1000);
        bookingEntity.setTotalAmt(10.0d);
        BookingRepository bookingRepository = mock(BookingRepository.class);
        when(bookingRepository.save((BookingEntity) any())).thenReturn(bookingEntity);

        City city2 = new City();
        city2.setBookings(new ArrayList<>());
        city2.setCityId(123L);
        city2.setCityName("Oxford");
        city2.setHotels(new ArrayList<>());

        Hotel hotel1 = new Hotel();
        hotel1.setCity(city2);
        hotel1.setHotelImgPath("Hotel Img Path");
        hotel1.setHotelName("Hotel Name");
        hotel1.setId(123L);
        hotel1.setNoOfRooms(1000);
        hotel1.setRating("Rating");
        hotel1.setTariffPerDay(10.0d);
        HotelService hotelService = mock(HotelService.class);
        when(hotelService.findOne(anyLong())).thenReturn(hotel1);

        City city3 = new City();
        city3.setBookings(new ArrayList<>());
        city3.setCityId(123L);
        city3.setCityName("Oxford");
        city3.setHotels(new ArrayList<>());
        CityRepository cityRepository = mock(CityRepository.class);
        when(cityRepository.findById((Long) any())).thenReturn(Optional.of(city3));
        BookingServiceImpl bookingServiceImpl = new BookingServiceImpl(bookingRepository, hotelService,
                new CityServiceImpl(cityRepository));
        Booking booking = mock(Booking.class);
        when(booking.getAdults()).thenReturn(1);
        when(booking.getChildren()).thenReturn(1);
        when(booking.getEmailID()).thenReturn("jane.doe@example.org");
        when(booking.getCityID()).thenReturn("10");
        when(booking.getNoOfRooms()).thenReturn(1000);
        when(booking.getCustomerName()).thenReturn("Customer Name");
        when(booking.getHotelID()).thenReturn("42");
        LocalDateTime atStartOfDayResult3 = LocalDate.of(1970, 1, 1).atStartOfDay();
        when(booking.getCheckInDate()).thenReturn(Date.from(atStartOfDayResult3.atZone(ZoneId.of("UTC")).toInstant()));
        LocalDateTime atStartOfDayResult4 = LocalDate.of(1970, 1, 1).atStartOfDay();
        when(booking.getCheckOutDate()).thenReturn(Date.from(atStartOfDayResult4.atZone(ZoneId.of("UTC")).toInstant()));
        assertSame(bookingEntity, bookingServiceImpl.addBooking(booking));
        verify(bookingRepository).save((BookingEntity) any());
        verify(hotelService).findOne(anyLong());
        verify(cityRepository).findById((Long) any());
        verify(booking).getAdults();
        verify(booking).getChildren();
        verify(booking, atLeast(1)).getNoOfRooms();
        verify(booking, atLeast(1)).getCityID();
        verify(booking).getCustomerName();
        verify(booking).getEmailID();
        verify(booking, atLeast(1)).getHotelID();
        verify(booking, atLeast(1)).getCheckInDate();
        verify(booking, atLeast(1)).getCheckOutDate();
    }

    /**
     * Method under test: {@link BookingServiceImpl#getBookingDetails(Booking)}
     */
    @Test
    void testGetBookingDetails() throws Exception {
        assertThrows(ValidationException.class, () -> bookingServiceImpl.getBookingDetails(booking));
        assertThrows(ValidationException.class, () -> bookingServiceImpl.getBookingDetails(booking));
    }

    /**
     * Method under test: {@link BookingServiceImpl#getBookingDetails(Booking)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetBookingDetails2() throws Exception {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because the return value of "com.learning.hotelbooking.view.Booking.getNoOfRooms()" is null
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.getBookingDetails(BookingServiceImpl.java:50)
        //   In order to prevent getBookingDetails(Booking)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getBookingDetails(Booking).
        //   See https://diff.blue/R013 to resolve this issue.

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because the return value of "com.learning.hotelbooking.view.Booking.getNoOfRooms()" is null
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.getBookingDetails(BookingServiceImpl.java:50)
        //   In order to prevent getBookingDetails(Booking)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getBookingDetails(Booking).
        //   See https://diff.blue/R013 to resolve this issue.

        BookingRepository bookingRepository = mock(BookingRepository.class);
        HotelServiceImpl hotelService = new HotelServiceImpl();
        BookingServiceImpl bookingServiceImpl = new BookingServiceImpl(bookingRepository, hotelService,
                new CityServiceImpl(mock(CityRepository.class)));
        bookingServiceImpl.getBookingDetails(new Booking());
    }

    /**
     * Method under test: {@link BookingServiceImpl#getBookingDetails(Booking)}
     */
    @Test
    void testGetBookingDetails3() throws Exception {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because the return value of "com.learning.hotelbooking.view.Booking.getNoOfRooms()" is null
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.getBookingDetails(BookingServiceImpl.java:50)
        //   In order to prevent getBookingDetails(Booking)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getBookingDetails(Booking).
        //   See https://diff.blue/R013 to resolve this issue.

        BookingRepository bookingRepository = mock(BookingRepository.class);
        HotelServiceImpl hotelService = new HotelServiceImpl();
        BookingServiceImpl bookingServiceImpl = new BookingServiceImpl(bookingRepository, hotelService,
                new CityServiceImpl(mock(CityRepository.class)));

        Booking booking = new Booking();
        booking.setNoOfRooms(1000);
        assertThrows(ValidationException.class, () -> bookingServiceImpl.getBookingDetails(booking));
    }

    /**
     * Method under test: {@link BookingServiceImpl#getBookingDetails(Booking)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetBookingDetails4() throws Exception {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because the return value of "com.learning.hotelbooking.view.Booking.getNoOfRooms()" is null
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.getBookingDetails(BookingServiceImpl.java:50)
        //   In order to prevent getBookingDetails(Booking)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getBookingDetails(Booking).
        //   See https://diff.blue/R013 to resolve this issue.

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.learning.hotelbooking.view.Booking.getCustomerName()" because "b" is null
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.getBookingDetails(BookingServiceImpl.java:49)
        //   In order to prevent getBookingDetails(Booking)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getBookingDetails(Booking).
        //   See https://diff.blue/R013 to resolve this issue.

        BookingRepository bookingRepository = mock(BookingRepository.class);
        HotelServiceImpl hotelService = new HotelServiceImpl();
        (new BookingServiceImpl(bookingRepository, hotelService, new CityServiceImpl(mock(CityRepository.class))))
                .getBookingDetails(null);
    }

    /**
     * Method under test: {@link BookingServiceImpl#getBookingDetails(Booking)}
     */
    @Test
    void testGetBookingDetails5() throws Exception {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because the return value of "com.learning.hotelbooking.view.Booking.getNoOfRooms()" is null
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.getBookingDetails(BookingServiceImpl.java:50)
        //   In order to prevent getBookingDetails(Booking)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getBookingDetails(Booking).
        //   See https://diff.blue/R013 to resolve this issue.

        BookingRepository bookingRepository = mock(BookingRepository.class);
        HotelServiceImpl hotelService = new HotelServiceImpl();
        BookingServiceImpl bookingServiceImpl = new BookingServiceImpl(bookingRepository, hotelService,
                new CityServiceImpl(mock(CityRepository.class)));
        Booking booking = mock(Booking.class);
        when(booking.getCityID()).thenReturn("Oxford");
        when(booking.getNoOfRooms()).thenReturn(1000);
        when(booking.getCustomerName()).thenReturn("Customer Name");
        when(booking.getHotelID()).thenReturn("Hotel ID");
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        when(booking.getCheckInDate()).thenReturn(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        when(booking.getCheckOutDate()).thenReturn(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        assertThrows(ValidationException.class, () -> bookingServiceImpl.getBookingDetails(booking));
        verify(booking, atLeast(1)).getNoOfRooms();
        verify(booking, atLeast(1)).getCityID();
        verify(booking).getCustomerName();
        verify(booking, atLeast(1)).getHotelID();
        verify(booking).getCheckInDate();
        verify(booking).getCheckOutDate();
    }

    /**
     * Method under test: {@link BookingServiceImpl#getBookingDetails(Booking)}
     */
    @Test
    void testGetBookingDetails6() throws Exception {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because the return value of "com.learning.hotelbooking.view.Booking.getNoOfRooms()" is null
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.getBookingDetails(BookingServiceImpl.java:50)
        //   In order to prevent getBookingDetails(Booking)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getBookingDetails(Booking).
        //   See https://diff.blue/R013 to resolve this issue.

        BookingRepository bookingRepository = mock(BookingRepository.class);
        HotelServiceImpl hotelService = new HotelServiceImpl();
        BookingServiceImpl bookingServiceImpl = new BookingServiceImpl(bookingRepository, hotelService,
                new CityServiceImpl(mock(CityRepository.class)));
        Booking booking = mock(Booking.class);
        when(booking.getCityID()).thenThrow(new NumberFormatException("Error-2"));
        when(booking.getNoOfRooms()).thenReturn(1000);
        when(booking.getCustomerName()).thenReturn("Customer Name");
        when(booking.getHotelID()).thenReturn("Hotel ID");
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        when(booking.getCheckInDate()).thenReturn(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        when(booking.getCheckOutDate()).thenReturn(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        assertThrows(NumberFormatException.class, () -> bookingServiceImpl.getBookingDetails(booking));
        verify(booking, atLeast(1)).getNoOfRooms();
        verify(booking).getCityID();
        verify(booking).getCustomerName();
        verify(booking, atLeast(1)).getHotelID();
        verify(booking).getCheckInDate();
        verify(booking).getCheckOutDate();
    }

    /**
     * Method under test: {@link BookingServiceImpl#getBookingDetails(Booking)}
     */
    @Test
    void testGetBookingDetails7() throws Exception {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because the return value of "com.learning.hotelbooking.view.Booking.getNoOfRooms()" is null
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.getBookingDetails(BookingServiceImpl.java:50)
        //   In order to prevent getBookingDetails(Booking)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getBookingDetails(Booking).
        //   See https://diff.blue/R013 to resolve this issue.

        BookingRepository bookingRepository = mock(BookingRepository.class);
        HotelServiceImpl hotelService = new HotelServiceImpl();
        BookingServiceImpl bookingServiceImpl = new BookingServiceImpl(bookingRepository, hotelService,
                new CityServiceImpl(mock(CityRepository.class)));
        Booking booking = mock(Booking.class);
        when(booking.getCityID()).thenReturn("");
        when(booking.getNoOfRooms()).thenReturn(1000);
        when(booking.getCustomerName()).thenReturn("Customer Name");
        when(booking.getHotelID()).thenReturn("Hotel ID");
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        when(booking.getCheckInDate()).thenReturn(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        when(booking.getCheckOutDate()).thenReturn(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        assertThrows(ValidationException.class, () -> bookingServiceImpl.getBookingDetails(booking));
        verify(booking, atLeast(1)).getNoOfRooms();
        verify(booking, atLeast(1)).getCityID();
        verify(booking).getCustomerName();
        verify(booking, atLeast(1)).getHotelID();
        verify(booking).getCheckInDate();
        verify(booking).getCheckOutDate();
    }

    /**
     * Method under test: {@link BookingServiceImpl#getBookingDetails(Booking)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetBookingDetails8() throws Exception {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because the return value of "com.learning.hotelbooking.view.Booking.getNoOfRooms()" is null
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.getBookingDetails(BookingServiceImpl.java:50)
        //   In order to prevent getBookingDetails(Booking)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getBookingDetails(Booking).
        //   See https://diff.blue/R013 to resolve this issue.

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.learning.hotelbooking.repository.HotelRepository.findById(Object)" because "this.repository" is null
        //       at com.learning.hotelbooking.service.impl.HotelServiceImpl.findOne(HotelServiceImpl.java:26)
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.getBookingDetails(BookingServiceImpl.java:66)
        //   In order to prevent getBookingDetails(Booking)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getBookingDetails(Booking).
        //   See https://diff.blue/R013 to resolve this issue.

        BookingRepository bookingRepository = mock(BookingRepository.class);
        HotelServiceImpl hotelService = new HotelServiceImpl();
        BookingServiceImpl bookingServiceImpl = new BookingServiceImpl(bookingRepository, hotelService,
                new CityServiceImpl(mock(CityRepository.class)));
        Booking booking = mock(Booking.class);
        when(booking.getCityID()).thenReturn("Oxford");
        when(booking.getNoOfRooms()).thenReturn(1000);
        when(booking.getCustomerName()).thenReturn("Customer Name");
        when(booking.getHotelID()).thenReturn("10");
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        when(booking.getCheckInDate()).thenReturn(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        when(booking.getCheckOutDate()).thenReturn(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        bookingServiceImpl.getBookingDetails(booking);
    }

    /**
     * Method under test: {@link BookingServiceImpl#getBookingDetails(Booking)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetBookingDetails9() throws Exception {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because the return value of "com.learning.hotelbooking.view.Booking.getNoOfRooms()" is null
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.getBookingDetails(BookingServiceImpl.java:50)
        //   In order to prevent getBookingDetails(Booking)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getBookingDetails(Booking).
        //   See https://diff.blue/R013 to resolve this issue.

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.learning.hotelbooking.repository.HotelRepository.findById(Object)" because "this.repository" is null
        //       at com.learning.hotelbooking.service.impl.HotelServiceImpl.findOne(HotelServiceImpl.java:26)
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.getBookingDetails(BookingServiceImpl.java:77)
        //   In order to prevent getBookingDetails(Booking)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getBookingDetails(Booking).
        //   See https://diff.blue/R013 to resolve this issue.

        BookingRepository bookingRepository = mock(BookingRepository.class);
        HotelServiceImpl hotelService = new HotelServiceImpl();
        BookingServiceImpl bookingServiceImpl = new BookingServiceImpl(bookingRepository, hotelService,
                new CityServiceImpl(mock(CityRepository.class)));
        Booking booking = mock(Booking.class);
        when(booking.getCityID()).thenReturn("Oxford");
        when(booking.getNoOfRooms()).thenReturn(1000);
        when(booking.getCustomerName()).thenReturn("Customer Name");
        when(booking.getHotelID()).thenReturn("42");
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        when(booking.getCheckInDate()).thenReturn(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        when(booking.getCheckOutDate()).thenReturn(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        bookingServiceImpl.getBookingDetails(booking);
    }

    /**
     * Method under test: {@link BookingServiceImpl#getBookingDetails(Booking)}
     */
    @Test
    void testGetBookingDetails10() throws Exception {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because the return value of "com.learning.hotelbooking.view.Booking.getNoOfRooms()" is null
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.getBookingDetails(BookingServiceImpl.java:50)
        //   In order to prevent getBookingDetails(Booking)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getBookingDetails(Booking).
        //   See https://diff.blue/R013 to resolve this issue.

        BookingRepository bookingRepository = mock(BookingRepository.class);
        HotelServiceImpl hotelService = new HotelServiceImpl();
        BookingServiceImpl bookingServiceImpl = new BookingServiceImpl(bookingRepository, hotelService,
                new CityServiceImpl(mock(CityRepository.class)));
        Booking booking = mock(Booking.class);
        when(booking.getCityID()).thenReturn("Oxford");
        when(booking.getNoOfRooms()).thenReturn(1000);
        when(booking.getCustomerName()).thenReturn("Customer Name");
        when(booking.getHotelID()).thenReturn("");
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        when(booking.getCheckInDate()).thenReturn(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        when(booking.getCheckOutDate()).thenReturn(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        assertThrows(ValidationException.class, () -> bookingServiceImpl.getBookingDetails(booking));
        verify(booking, atLeast(1)).getNoOfRooms();
        verify(booking).getCustomerName();
        verify(booking, atLeast(1)).getHotelID();
        verify(booking).getCheckInDate();
        verify(booking).getCheckOutDate();
    }

    /**
     * Method under test: {@link BookingServiceImpl#getBookingDetails(Booking)}
     */
    @Test
    void testGetBookingDetails11() throws Exception {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because the return value of "com.learning.hotelbooking.view.Booking.getNoOfRooms()" is null
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.getBookingDetails(BookingServiceImpl.java:50)
        //   In order to prevent getBookingDetails(Booking)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getBookingDetails(Booking).
        //   See https://diff.blue/R013 to resolve this issue.

        City city = new City();
        city.setBookings(new ArrayList<>());
        city.setCityId(123L);
        city.setCityName("Oxford");
        city.setHotels(new ArrayList<>());

        Hotel hotel = new Hotel();
        hotel.setCity(city);
        hotel.setHotelImgPath("Hotel Img Path");
        hotel.setHotelName("Hotel Name");
        hotel.setId(123L);
        hotel.setNoOfRooms(1000);
        hotel.setRating("Rating");
        hotel.setTariffPerDay(10.0d);
        HotelService hotelService = mock(HotelService.class);
        when(hotelService.findOne(anyLong())).thenReturn(hotel);
        BookingRepository bookingRepository = mock(BookingRepository.class);
        BookingServiceImpl bookingServiceImpl = new BookingServiceImpl(bookingRepository, hotelService,
                new CityServiceImpl(mock(CityRepository.class)));
        Booking booking = mock(Booking.class);
        when(booking.getCityID()).thenReturn("Oxford");
        when(booking.getNoOfRooms()).thenReturn(1000);
        when(booking.getCustomerName()).thenReturn("Customer Name");
        when(booking.getHotelID()).thenReturn("10");
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        when(booking.getCheckInDate()).thenReturn(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        when(booking.getCheckOutDate()).thenReturn(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        assertThrows(ValidationException.class, () -> bookingServiceImpl.getBookingDetails(booking));
        verify(hotelService).findOne(anyLong());
        verify(booking, atLeast(1)).getNoOfRooms();
        verify(booking, atLeast(1)).getCityID();
        verify(booking).getCustomerName();
        verify(booking, atLeast(1)).getHotelID();
        verify(booking).getCheckInDate();
        verify(booking).getCheckOutDate();
    }

    /**
     * Method under test: {@link BookingServiceImpl#getBookingDetails(Booking)}
     */
    @Test
    void testGetBookingDetails12() throws Exception {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because the return value of "com.learning.hotelbooking.view.Booking.getNoOfRooms()" is null
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.getBookingDetails(BookingServiceImpl.java:50)
        //   In order to prevent getBookingDetails(Booking)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getBookingDetails(Booking).
        //   See https://diff.blue/R013 to resolve this issue.

        City city = new City();
        city.setBookings(new ArrayList<>());
        city.setCityId(123L);
        city.setCityName("Oxford");
        city.setHotels(new ArrayList<>());

        Hotel hotel = new Hotel();
        hotel.setCity(city);
        hotel.setHotelImgPath("Hotel Img Path");
        hotel.setHotelName("Hotel Name");
        hotel.setId(123L);
        hotel.setNoOfRooms(1000);
        hotel.setRating("Rating");
        hotel.setTariffPerDay(10.0d);
        HotelService hotelService = mock(HotelService.class);
        when(hotelService.findOne(anyLong())).thenReturn(hotel);

        City city1 = new City();
        city1.setBookings(new ArrayList<>());
        city1.setCityId(123L);
        city1.setCityName("Oxford");
        city1.setHotels(new ArrayList<>());
        CityRepository cityRepository = mock(CityRepository.class);
        when(cityRepository.findById((Long) any())).thenReturn(Optional.of(city1));
        BookingServiceImpl bookingServiceImpl = new BookingServiceImpl(mock(BookingRepository.class), hotelService,
                new CityServiceImpl(cityRepository));
        Booking booking = mock(Booking.class);
        when(booking.getAdults()).thenReturn(1);
        when(booking.getChildren()).thenReturn(1);
        when(booking.getEmailID()).thenReturn("jane.doe@example.org");
        when(booking.getCityID()).thenReturn("10");
        when(booking.getNoOfRooms()).thenReturn(1000);
        when(booking.getCustomerName()).thenReturn("Customer Name");
        when(booking.getHotelID()).thenReturn("10");
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        when(booking.getCheckInDate()).thenReturn(fromResult);
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult1 = Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant());
        when(booking.getCheckOutDate()).thenReturn(fromResult1);
        BookingEntity actualBookingDetails = bookingServiceImpl.getBookingDetails(booking);
        assertEquals(1, actualBookingDetails.getAdults().intValue());
        assertEquals(0.0d, actualBookingDetails.getTotalAmt().doubleValue());
        assertEquals(1000, actualBookingDetails.getNoOfRooms());
        assertSame(hotel, actualBookingDetails.getHotel());
        assertEquals("jane.doe@example.org", actualBookingDetails.getEmailID());
        assertSame(fromResult, actualBookingDetails.getCheckInDate());
        assertEquals(1, actualBookingDetails.getChildren().intValue());
        assertSame(city1, actualBookingDetails.getCity());
        assertSame(fromResult1, actualBookingDetails.getCheckOutDate());
        assertEquals("Customer Name", actualBookingDetails.getCustomerName());
        verify(hotelService).findOne(anyLong());
        verify(cityRepository).findById((Long) any());
        verify(booking).getAdults();
        verify(booking).getChildren();
        verify(booking, atLeast(1)).getNoOfRooms();
        verify(booking, atLeast(1)).getCityID();
        verify(booking).getCustomerName();
        verify(booking).getEmailID();
        verify(booking, atLeast(1)).getHotelID();
        verify(booking, atLeast(1)).getCheckInDate();
        verify(booking, atLeast(1)).getCheckOutDate();
    }

    /**
     * Method under test: {@link BookingServiceImpl#getBookingDetails(Booking)}
     */
    @Test
    void testGetBookingDetails13() throws Exception {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because the return value of "com.learning.hotelbooking.view.Booking.getNoOfRooms()" is null
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.getBookingDetails(BookingServiceImpl.java:50)
        //   In order to prevent getBookingDetails(Booking)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getBookingDetails(Booking).
        //   See https://diff.blue/R013 to resolve this issue.

        City city = new City();
        city.setBookings(new ArrayList<>());
        city.setCityId(123L);
        city.setCityName("Oxford");
        city.setHotels(new ArrayList<>());

        Hotel hotel = new Hotel();
        hotel.setCity(city);
        hotel.setHotelImgPath("Hotel Img Path");
        hotel.setHotelName("Hotel Name");
        hotel.setId(123L);
        hotel.setNoOfRooms(1000);
        hotel.setRating("Rating");
        hotel.setTariffPerDay(10.0d);
        HotelService hotelService = mock(HotelService.class);
        when(hotelService.findOne(anyLong())).thenReturn(hotel);

        City city1 = new City();
        city1.setBookings(new ArrayList<>());
        city1.setCityId(123L);
        city1.setCityName("Oxford");
        city1.setHotels(new ArrayList<>());
        CityRepository cityRepository = mock(CityRepository.class);
        when(cityRepository.findById((Long) any())).thenReturn(Optional.of(city1));
        BookingServiceImpl bookingServiceImpl = new BookingServiceImpl(mock(BookingRepository.class), hotelService,
                new CityServiceImpl(cityRepository));
        Booking booking = mock(Booking.class);
        when(booking.getAdults()).thenThrow(new NumberFormatException("10"));
        when(booking.getChildren()).thenThrow(new NumberFormatException("10"));
        when(booking.getEmailID()).thenThrow(new NumberFormatException("10"));
        when(booking.getCityID()).thenReturn("10");
        when(booking.getNoOfRooms()).thenReturn(1000);
        when(booking.getCustomerName()).thenReturn("Customer Name");
        when(booking.getHotelID()).thenReturn("10");
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        when(booking.getCheckInDate()).thenReturn(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        when(booking.getCheckOutDate()).thenReturn(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        assertThrows(NumberFormatException.class, () -> bookingServiceImpl.getBookingDetails(booking));
        verify(hotelService).findOne(anyLong());
        verify(cityRepository).findById((Long) any());
        verify(booking).getAdults();
        verify(booking, atLeast(1)).getNoOfRooms();
        verify(booking, atLeast(1)).getCityID();
        verify(booking).getCustomerName();
        verify(booking, atLeast(1)).getHotelID();
        verify(booking).getCheckInDate();
        verify(booking).getCheckOutDate();
    }

    /**
     * Method under test: {@link BookingServiceImpl#getBookingDetails(Booking)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetBookingDetails14() throws Exception {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because the return value of "com.learning.hotelbooking.view.Booking.getNoOfRooms()" is null
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.getBookingDetails(BookingServiceImpl.java:50)
        //   In order to prevent getBookingDetails(Booking)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getBookingDetails(Booking).
        //   See https://diff.blue/R013 to resolve this issue.

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.util.Optional.orElse(Object)" because the return value of "com.learning.hotelbooking.repository.CityRepository.findById(Object)" is null
        //       at com.learning.hotelbooking.service.impl.CityServiceImpl.findOne(CityServiceImpl.java:31)
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.getBookingDetails(BookingServiceImpl.java:89)
        //   In order to prevent getBookingDetails(Booking)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getBookingDetails(Booking).
        //   See https://diff.blue/R013 to resolve this issue.

        City city = new City();
        city.setBookings(new ArrayList<>());
        city.setCityId(123L);
        city.setCityName("Oxford");
        city.setHotels(new ArrayList<>());

        Hotel hotel = new Hotel();
        hotel.setCity(city);
        hotel.setHotelImgPath("Hotel Img Path");
        hotel.setHotelName("Hotel Name");
        hotel.setId(123L);
        hotel.setNoOfRooms(1000);
        hotel.setRating("Rating");
        hotel.setTariffPerDay(10.0d);
        HotelService hotelService = mock(HotelService.class);
        when(hotelService.findOne(anyLong())).thenReturn(hotel);
        CityRepository cityRepository = mock(CityRepository.class);
        when(cityRepository.findById((Long) any())).thenReturn(null);
        BookingServiceImpl bookingServiceImpl = new BookingServiceImpl(mock(BookingRepository.class), hotelService,
                new CityServiceImpl(cityRepository));
        Booking booking = mock(Booking.class);
        when(booking.getAdults()).thenReturn(1);
        when(booking.getChildren()).thenReturn(1);
        when(booking.getEmailID()).thenReturn("jane.doe@example.org");
        when(booking.getCityID()).thenReturn("10");
        when(booking.getNoOfRooms()).thenReturn(1000);
        when(booking.getCustomerName()).thenReturn("Customer Name");
        when(booking.getHotelID()).thenReturn("10");
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        when(booking.getCheckInDate()).thenReturn(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        when(booking.getCheckOutDate()).thenReturn(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        bookingServiceImpl.getBookingDetails(booking);
    }

    /**
     * Method under test: {@link BookingServiceImpl#getBookingDetails(Booking)}
     */
    @Test
    void testGetBookingDetails15() throws Exception {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because the return value of "com.learning.hotelbooking.view.Booking.getNoOfRooms()" is null
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.getBookingDetails(BookingServiceImpl.java:50)
        //   In order to prevent getBookingDetails(Booking)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getBookingDetails(Booking).
        //   See https://diff.blue/R013 to resolve this issue.

        City city = new City();
        city.setBookings(new ArrayList<>());
        city.setCityId(123L);
        city.setCityName("Oxford");
        city.setHotels(new ArrayList<>());

        Hotel hotel = new Hotel();
        hotel.setCity(city);
        hotel.setHotelImgPath("Hotel Img Path");
        hotel.setHotelName("Hotel Name");
        hotel.setId(123L);
        hotel.setNoOfRooms(1000);
        hotel.setRating("Rating");
        hotel.setTariffPerDay(10.0d);
        HotelService hotelService = mock(HotelService.class);
        when(hotelService.findOne(anyLong())).thenReturn(hotel);
        CityRepository cityRepository = mock(CityRepository.class);
        when(cityRepository.findById((Long) any())).thenReturn(Optional.empty());
        BookingServiceImpl bookingServiceImpl = new BookingServiceImpl(mock(BookingRepository.class), hotelService,
                new CityServiceImpl(cityRepository));
        Booking booking = mock(Booking.class);
        when(booking.getAdults()).thenReturn(1);
        when(booking.getChildren()).thenReturn(1);
        when(booking.getEmailID()).thenReturn("jane.doe@example.org");
        when(booking.getCityID()).thenReturn("10");
        when(booking.getNoOfRooms()).thenReturn(1000);
        when(booking.getCustomerName()).thenReturn("Customer Name");
        when(booking.getHotelID()).thenReturn("10");
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        when(booking.getCheckInDate()).thenReturn(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        when(booking.getCheckOutDate()).thenReturn(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        assertThrows(NoRecordFoundException.class, () -> bookingServiceImpl.getBookingDetails(booking));
        verify(hotelService).findOne(anyLong());
        verify(cityRepository).findById((Long) any());
        verify(booking, atLeast(1)).getNoOfRooms();
        verify(booking, atLeast(1)).getCityID();
        verify(booking).getCustomerName();
        verify(booking, atLeast(1)).getHotelID();
        verify(booking).getCheckInDate();
        verify(booking).getCheckOutDate();
    }

    /**
     * Method under test: {@link BookingServiceImpl#getBookingDetails(Booking)}
     */
    @Test
    void testGetBookingDetails16() throws Exception {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because the return value of "com.learning.hotelbooking.view.Booking.getNoOfRooms()" is null
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.getBookingDetails(BookingServiceImpl.java:50)
        //   In order to prevent getBookingDetails(Booking)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getBookingDetails(Booking).
        //   See https://diff.blue/R013 to resolve this issue.

        City city = new City();
        city.setBookings(new ArrayList<>());
        city.setCityId(123L);
        city.setCityName("Oxford");
        city.setHotels(new ArrayList<>());

        Hotel hotel = new Hotel();
        hotel.setCity(city);
        hotel.setHotelImgPath("Hotel Img Path");
        hotel.setHotelName("Hotel Name");
        hotel.setId(123L);
        hotel.setNoOfRooms(1000);
        hotel.setRating("Rating");
        hotel.setTariffPerDay(10.0d);
        HotelService hotelService = mock(HotelService.class);
        when(hotelService.findOne(anyLong())).thenReturn(hotel);

        City city1 = new City();
        city1.setBookings(new ArrayList<>());
        city1.setCityId(123L);
        city1.setCityName("Oxford");
        city1.setHotels(new ArrayList<>());
        CityRepository cityRepository = mock(CityRepository.class);
        when(cityRepository.findById((Long) any())).thenReturn(Optional.of(city1));
        BookingServiceImpl bookingServiceImpl = new BookingServiceImpl(mock(BookingRepository.class), hotelService,
                new CityServiceImpl(cityRepository));
        Booking booking = mock(Booking.class);
        when(booking.getAdults()).thenReturn(1);
        when(booking.getChildren()).thenReturn(1);
        when(booking.getEmailID()).thenReturn("jane.doe@example.org");
        when(booking.getCityID()).thenReturn(null);
        when(booking.getNoOfRooms()).thenReturn(1000);
        when(booking.getCustomerName()).thenReturn("Customer Name");
        when(booking.getHotelID()).thenReturn("10");
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        when(booking.getCheckInDate()).thenReturn(Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()));
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        when(booking.getCheckOutDate()).thenReturn(Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant()));
        assertThrows(ValidationException.class, () -> bookingServiceImpl.getBookingDetails(booking));
        verify(booking, atLeast(1)).getNoOfRooms();
        verify(booking).getCityID();
        verify(booking).getCustomerName();
        verify(booking, atLeast(1)).getHotelID();
        verify(booking).getCheckInDate();
        verify(booking).getCheckOutDate();
    }

    /**
     * Method under test: {@link BookingServiceImpl#getBookingDetails(Booking)}
     */
    @Test
    void testGetBookingDetails17() throws Exception {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because the return value of "com.learning.hotelbooking.view.Booking.getNoOfRooms()" is null
        //       at com.learning.hotelbooking.service.impl.BookingServiceImpl.getBookingDetails(BookingServiceImpl.java:50)
        //   In order to prevent getBookingDetails(Booking)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getBookingDetails(Booking).
        //   See https://diff.blue/R013 to resolve this issue.

        City city = new City();
        city.setBookings(new ArrayList<>());
        city.setCityId(123L);
        city.setCityName("Oxford");
        city.setHotels(new ArrayList<>());

        Hotel hotel = new Hotel();
        hotel.setCity(city);
        hotel.setHotelImgPath("Hotel Img Path");
        hotel.setHotelName("Hotel Name");
        hotel.setId(123L);
        hotel.setNoOfRooms(1000);
        hotel.setRating("Rating");
        hotel.setTariffPerDay(10.0d);
        HotelService hotelService = mock(HotelService.class);
        when(hotelService.findOne(anyLong())).thenReturn(hotel);

        City city1 = new City();
        city1.setBookings(new ArrayList<>());
        city1.setCityId(123L);
        city1.setCityName("Oxford");
        city1.setHotels(new ArrayList<>());
        CityRepository cityRepository = mock(CityRepository.class);
        when(cityRepository.findById((Long) any())).thenReturn(Optional.of(city1));
        BookingServiceImpl bookingServiceImpl = new BookingServiceImpl(mock(BookingRepository.class), hotelService,
                new CityServiceImpl(cityRepository));
        Booking booking = mock(Booking.class);
        when(booking.getAdults()).thenReturn(1);
        when(booking.getChildren()).thenReturn(1);
        when(booking.getEmailID()).thenReturn("jane.doe@example.org");
        when(booking.getCityID()).thenReturn("10");
        when(booking.getNoOfRooms()).thenReturn(1000);
        when(booking.getCustomerName()).thenReturn("Customer Name");
        when(booking.getHotelID()).thenReturn("42");
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant());
        when(booking.getCheckInDate()).thenReturn(fromResult);
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult1 = Date.from(atStartOfDayResult1.atZone(ZoneId.of("UTC")).toInstant());
        when(booking.getCheckOutDate()).thenReturn(fromResult1);
        BookingEntity actualBookingDetails = bookingServiceImpl.getBookingDetails(booking);
        assertEquals(1, actualBookingDetails.getAdults().intValue());
        assertEquals(0.0d, actualBookingDetails.getTotalAmt().doubleValue());
        assertEquals(1000, actualBookingDetails.getNoOfRooms());
        assertSame(hotel, actualBookingDetails.getHotel());
        assertEquals("jane.doe@example.org", actualBookingDetails.getEmailID());
        assertSame(fromResult, actualBookingDetails.getCheckInDate());
        assertEquals(1, actualBookingDetails.getChildren().intValue());
        assertSame(city1, actualBookingDetails.getCity());
        assertSame(fromResult1, actualBookingDetails.getCheckOutDate());
        assertEquals("Customer Name", actualBookingDetails.getCustomerName());
        verify(hotelService).findOne(anyLong());
        verify(cityRepository).findById((Long) any());
        verify(booking).getAdults();
        verify(booking).getChildren();
        verify(booking, atLeast(1)).getNoOfRooms();
        verify(booking, atLeast(1)).getCityID();
        verify(booking).getCustomerName();
        verify(booking).getEmailID();
        verify(booking, atLeast(1)).getHotelID();
        verify(booking, atLeast(1)).getCheckInDate();
        verify(booking, atLeast(1)).getCheckOutDate();
    }
}

