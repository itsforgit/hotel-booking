package com.learning.hotelbooking.service.impl;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.learning.hotelbooking.model.City;
import com.learning.hotelbooking.model.Hotel;
import com.learning.hotelbooking.repository.HotelRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {HotelServiceImpl.class})
@ExtendWith(SpringExtension.class)
class HotelServiceImplTest {
    @MockBean
    private HotelRepository hotelRepository;

    @Autowired
    private HotelServiceImpl hotelServiceImpl;

    /**
     * Method under test: {@link HotelServiceImpl#findAllByCity(Long)}
     */
    @Test
    void testFindAllByCity() {
        ArrayList<Hotel> hotelList = new ArrayList<>();
        when(hotelRepository.findAllByCityOrderByHotelNameAsc((Long) any())).thenReturn(hotelList);
        List<Hotel> actualFindAllByCityResult = hotelServiceImpl.findAllByCity(1L);
        assertSame(hotelList, actualFindAllByCityResult);
        assertTrue(actualFindAllByCityResult.isEmpty());
        verify(hotelRepository).findAllByCityOrderByHotelNameAsc((Long) any());
    }

    /**
     * Method under test: {@link HotelServiceImpl#findAllByCity(Long)}
     */
    @Test
    void testFindAllByCity2() {
        ArrayList<Hotel> hotelList = new ArrayList<>();
        when(hotelRepository.findAllByCityOrderByHotelNameAsc((Long) any())).thenReturn(hotelList);
        List<Hotel> actualFindAllByCityResult = hotelServiceImpl.findAllByCity(1L);
        assertSame(hotelList, actualFindAllByCityResult);
        assertTrue(actualFindAllByCityResult.isEmpty());
        verify(hotelRepository).findAllByCityOrderByHotelNameAsc((Long) any());
    }

    /**
     * Method under test: {@link HotelServiceImpl#findOne(long)}
     */
    @Test
    void testFindOne() {
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
        Optional<Hotel> ofResult = Optional.of(hotel);
        when(hotelRepository.findById((Long) any())).thenReturn(ofResult);
        assertSame(hotel, hotelServiceImpl.findOne(1L));
        verify(hotelRepository).findById((Long) any());
    }

    /**
     * Method under test: {@link HotelServiceImpl#findOne(long)}
     */
    @Test
    void testFindOne2() {
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
        Optional<Hotel> ofResult = Optional.of(hotel);
        when(hotelRepository.findById((Long) any())).thenReturn(ofResult);
        assertSame(hotel, hotelServiceImpl.findOne(1L));
        verify(hotelRepository).findById((Long) any());
    }

    /**
     * Method under test: {@link HotelServiceImpl#findAllByCityOrderByTariffPerDayAsc(City)}
     */
    @Test
    void testFindAllByCityOrderByTariffPerDayAsc() {
        ArrayList<Hotel> hotelList = new ArrayList<>();
        when(hotelRepository.findAllByCityOrderByTariffPerDayAsc((City) any())).thenReturn(hotelList);

        City city = new City();
        city.setBookings(new ArrayList<>());
        city.setCityId(123L);
        city.setCityName("Oxford");
        city.setHotels(new ArrayList<>());
        List<Hotel> actualFindAllByCityOrderByTariffPerDayAscResult = hotelServiceImpl
                .findAllByCityOrderByTariffPerDayAsc(city);
        assertSame(hotelList, actualFindAllByCityOrderByTariffPerDayAscResult);
        assertTrue(actualFindAllByCityOrderByTariffPerDayAscResult.isEmpty());
        verify(hotelRepository).findAllByCityOrderByTariffPerDayAsc((City) any());
    }

    /**
     * Method under test: {@link HotelServiceImpl#findAllByCityOrderByTariffPerDayAsc(City)}
     */
    @Test
    void testFindAllByCityOrderByTariffPerDayAsc2() {
        ArrayList<Hotel> hotelList = new ArrayList<>();
        when(hotelRepository.findAllByCityOrderByTariffPerDayAsc((City) any())).thenReturn(hotelList);

        City city = new City();
        city.setBookings(new ArrayList<>());
        city.setCityId(123L);
        city.setCityName("Oxford");
        city.setHotels(new ArrayList<>());
        List<Hotel> actualFindAllByCityOrderByTariffPerDayAscResult = hotelServiceImpl
                .findAllByCityOrderByTariffPerDayAsc(city);
        assertSame(hotelList, actualFindAllByCityOrderByTariffPerDayAscResult);
        assertTrue(actualFindAllByCityOrderByTariffPerDayAscResult.isEmpty());
        verify(hotelRepository).findAllByCityOrderByTariffPerDayAsc((City) any());
    }

    /**
     * Method under test: {@link HotelServiceImpl#findAllByCityOrderByRatingAsc(City)}
     */
    @Test
    void testFindAllByCityOrderByRatingAsc() {
        ArrayList<Hotel> hotelList = new ArrayList<>();
        when(hotelRepository.findAllByCityOrderByRatingAsc((City) any())).thenReturn(hotelList);

        City city = new City();
        city.setBookings(new ArrayList<>());
        city.setCityId(123L);
        city.setCityName("Oxford");
        city.setHotels(new ArrayList<>());
        List<Hotel> actualFindAllByCityOrderByRatingAscResult = hotelServiceImpl.findAllByCityOrderByRatingAsc(city);
        assertSame(hotelList, actualFindAllByCityOrderByRatingAscResult);
        assertTrue(actualFindAllByCityOrderByRatingAscResult.isEmpty());
        verify(hotelRepository).findAllByCityOrderByRatingAsc((City) any());
    }

    /**
     * Method under test: {@link HotelServiceImpl#findAllByCityOrderByRatingAsc(City)}
     */
    @Test
    void testFindAllByCityOrderByRatingAsc2() {
        ArrayList<Hotel> hotelList = new ArrayList<>();
        when(hotelRepository.findAllByCityOrderByRatingAsc((City) any())).thenReturn(hotelList);

        City city = new City();
        city.setBookings(new ArrayList<>());
        city.setCityId(123L);
        city.setCityName("Oxford");
        city.setHotels(new ArrayList<>());
        List<Hotel> actualFindAllByCityOrderByRatingAscResult = hotelServiceImpl.findAllByCityOrderByRatingAsc(city);
        assertSame(hotelList, actualFindAllByCityOrderByRatingAscResult);
        assertTrue(actualFindAllByCityOrderByRatingAscResult.isEmpty());
        verify(hotelRepository).findAllByCityOrderByRatingAsc((City) any());
    }

    /**
     * Method under test: {@link HotelServiceImpl#findAllByCityOrderByHotelNameAsc(City)}
     */
    @Test
    void testFindAllByCityOrderByHotelNameAsc() {
        ArrayList<Hotel> hotelList = new ArrayList<>();
        when(hotelRepository.findAllByCityOrderByHotelNameAsc((City) any())).thenReturn(hotelList);

        City city = new City();
        city.setBookings(new ArrayList<>());
        city.setCityId(123L);
        city.setCityName("Oxford");
        city.setHotels(new ArrayList<>());
        List<Hotel> actualFindAllByCityOrderByHotelNameAscResult = hotelServiceImpl.findAllByCityOrderByHotelNameAsc(city);
        assertSame(hotelList, actualFindAllByCityOrderByHotelNameAscResult);
        assertTrue(actualFindAllByCityOrderByHotelNameAscResult.isEmpty());
        verify(hotelRepository).findAllByCityOrderByHotelNameAsc((City) any());
    }

    /**
     * Method under test: {@link HotelServiceImpl#findAllByCityOrderByHotelNameAsc(City)}
     */
    @Test
    void testFindAllByCityOrderByHotelNameAsc2() {
        ArrayList<Hotel> hotelList = new ArrayList<>();
        when(hotelRepository.findAllByCityOrderByHotelNameAsc((City) any())).thenReturn(hotelList);

        City city = new City();
        city.setBookings(new ArrayList<>());
        city.setCityId(123L);
        city.setCityName("Oxford");
        city.setHotels(new ArrayList<>());
        List<Hotel> actualFindAllByCityOrderByHotelNameAscResult = hotelServiceImpl.findAllByCityOrderByHotelNameAsc(city);
        assertSame(hotelList, actualFindAllByCityOrderByHotelNameAscResult);
        assertTrue(actualFindAllByCityOrderByHotelNameAscResult.isEmpty());
        verify(hotelRepository).findAllByCityOrderByHotelNameAsc((City) any());
    }
}

