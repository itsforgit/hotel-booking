package com.learning.hotelbooking.controller;

import com.learning.hotelbooking.model.BookingEntity;
import com.learning.hotelbooking.model.City;
import com.learning.hotelbooking.model.Hotel;
import com.learning.hotelbooking.service.BookingService;
import com.learning.hotelbooking.service.CityService;
import com.learning.hotelbooking.service.HotelService;
import com.learning.hotelbooking.view.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * This is used book the hotel and display the list of hotel by city
 *
 * @author M1030360
 */
@Controller
public class BookingController {

    @Autowired(required = true)
    private BookingService bookingService;

    @Autowired(required = true)
    private CityService cityService;

    @Autowired(required = true)
    private HotelService hotelService;

    /**
     * Show the booking page
     *
     * @return
     */
    @RequestMapping(value = "/bookings", method = RequestMethod.GET)
    public ModelAndView getBookings() {
        Booking b = new Booking();

        return new ModelAndView("booking", "booking", b);
    }

    /**
     * Load the cities
     *
     * @return
     */
    @ModelAttribute("cities")
    public Map<Long, String> getCities() {
        List<City> cities = cityService.findAll();
        return cities.stream().collect(Collectors.toMap(City::getCityId, City::getCityName));
    }

    /**
     * Save the booking details to DB
     *
     * @param b
     * @param bindingResult
     * @param model
     * @return
     */
    @RequestMapping(value = "/booking/book", method = RequestMethod.POST)
    public ModelAndView addBooking(@Valid @ModelAttribute("booking") Booking b, BindingResult bindingResult,
                                   Model model) throws Exception {

        if (bindingResult.hasErrors()) {
            return new ModelAndView("booking", "booking", b);
        }
        BookingEntity bookingEntity = bookingService.addBooking(b);
        model.addAttribute("bookingID", bookingEntity.getId());

        model.addAttribute("totalAmt", bookingEntity.getTotalAmt());

        b.setHotelID("");
        b.setCityID("");
        b.setCustomerName("");
        b.setCheckInDate(null);
        b.setCheckOutDate(null);
        b.setNoOfRooms(null);
        b.setChildren(null);
        b.setAdults(null);
        b.setEmailID(null);

        return new ModelAndView("booking", "booking", b);
    }

    /**
     * Show the search page
     *
     * @return
     */
    @RequestMapping(value = "/viewrooms", method = RequestMethod.GET)
    public ModelAndView viewRooms() {
        Booking b = new Booking();
        return new ModelAndView("viewrooms", "booking", b);
    }

    /**
     * Search hotels by city order by price
     *
     * @param b
     * @param model
     * @return
     */
    @RequestMapping(value = "/view/search", method = RequestMethod.POST)
    public ModelAndView searchRooms(@ModelAttribute("booking") Booking b, Model model) {

        if (b.getSortBy() != null) {
            List<Hotel> hotels = null;
            switch (b.getSortBy()) {
                case "1":
                    hotels = hotelService
                            .findAllByCityOrderByTariffPerDayAsc(cityService.findOne(Long.valueOf(b.getCityID())));
                case "2":
                    hotels = hotelService
                            .findAllByCityOrderByHotelNameAsc(cityService.findOne(Long.valueOf(b.getCityID())));
                    break;
                case "3":
                    hotels = hotelService.findAllByCityOrderByRatingAsc(cityService.findOne(Long.valueOf(b.getCityID())));
                    break;
                default:
                    break;
            }
            model.addAttribute("hotels", hotels);
        }
        return new ModelAndView("viewrooms", "booking", b);
    }
}
