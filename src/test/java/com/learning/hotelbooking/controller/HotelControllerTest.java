package com.learning.hotelbooking.controller;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

import com.learning.hotelbooking.service.HotelService;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {HotelController.class})
@ExtendWith(SpringExtension.class)
class HotelControllerTest {
    @Autowired
    private HotelController hotelController;

    @MockBean
    private HotelService hotelService;

    /**
     * Method under test: {@link HotelController#hotelByCity(Long)}
     */
    @Test
    void testHotelByCity() throws Exception {
        when(hotelService.findAllByCity((Long) any())).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/hotelByCity");
        MockHttpServletRequestBuilder requestBuilder = getResult.param("cityId", String.valueOf(1L));
        MockMvcBuilders.standaloneSetup(hotelController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.content().string("[]"));
    }
}

