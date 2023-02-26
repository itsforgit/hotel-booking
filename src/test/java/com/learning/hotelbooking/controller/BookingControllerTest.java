package com.learning.hotelbooking.controller;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.learning.hotelbooking.model.City;
import com.learning.hotelbooking.service.BookingService;
import com.learning.hotelbooking.service.CityService;
import com.learning.hotelbooking.service.HotelService;
import com.learning.hotelbooking.view.Booking;

import java.util.ArrayList;

import org.junit.jupiter.api.Disabled;

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
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.ModelAndView;

@ContextConfiguration(classes = {BookingController.class, Booking.class})
@ExtendWith(SpringExtension.class)
class BookingControllerTest {
    @Autowired
    private Booking booking;

    @Autowired
    private BookingController bookingController;

    @MockBean
    private BookingService bookingService;

    @MockBean
    private CityService cityService;

    @MockBean
    private HotelService hotelService;

    /**
     * Method under test: {@link BookingController#addBooking(Booking, BindingResult, Model)}
     */
    @Test
    void testAddBooking() throws Exception {
        when(cityService.findAll()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/booking/book");
        MockMvcBuilders.standaloneSetup(bookingController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(2))
                .andExpect(MockMvcResultMatchers.model().attributeExists("booking", "cities"))
                .andExpect(MockMvcResultMatchers.view().name("booking"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("booking"));
    }

    /**
     * Method under test: {@link BookingController#addBooking(Booking, BindingResult, Model)}
     */
    @Test
    void testAddBooking2() throws Exception {
        when(cityService.findAll()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/booking/book");
        MockMvcBuilders.standaloneSetup(bookingController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(2))
                .andExpect(MockMvcResultMatchers.model().attributeExists("booking", "cities"))
                .andExpect(MockMvcResultMatchers.view().name("booking"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("booking"));
    }

    /**
     * Method under test: {@link BookingController#addBooking(Booking, BindingResult, Model)}
     */
    @Test
    void testAddBooking3() throws Exception {
        when(cityService.findAll()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/booking/book");
        MockMvcBuilders.standaloneSetup(bookingController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(2))
                .andExpect(MockMvcResultMatchers.model().attributeExists("booking", "cities"))
                .andExpect(MockMvcResultMatchers.view().name("booking"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("booking"));
    }

    /**
     * Method under test: {@link BookingController#getBookings()}
     */
    @Test
    void testGetBookings() throws Exception {
        when(cityService.findAll()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/bookings");
        MockMvcBuilders.standaloneSetup(bookingController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(2))
                .andExpect(MockMvcResultMatchers.model().attributeExists("booking", "cities"))
                .andExpect(MockMvcResultMatchers.view().name("booking"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("booking"));
    }

    /**
     * Method under test: {@link BookingController#getCities()}
     */
    @Test
    void testGetCities() {
        when(cityService.findAll()).thenReturn(new ArrayList<>());
        assertTrue(bookingController.getCities().isEmpty());
        verify(cityService).findAll();
    }

    /**
     * Method under test: {@link BookingController#getCities()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetCities2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalStateException: Duplicate key 123 (attempted merging values Oxford and Oxford)
        //       at java.util.stream.Collectors.duplicateKeyException(Collectors.java:135)
        //       at java.util.stream.Collectors.lambda$uniqKeysMapAccumulator$1(Collectors.java:182)
        //       at java.util.stream.ReduceOps$3ReducingSink.accept(ReduceOps.java:169)
        //       at java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1625)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:682)
        //       at com.learning.hotelbooking.controller.BookingController.getCities(BookingController.java:67)
        //   In order to prevent getCities()
        //   from throwing IllegalStateException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getCities().
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

        ArrayList<City> cityList = new ArrayList<>();
        cityList.add(city1);
        cityList.add(city);
        when(cityService.findAll()).thenReturn(cityList);
        bookingController.getCities();
    }

    /**
     * Method under test: {@link BookingController#getCities()}
     */
    @Test
    void testGetCities3() {
        when(cityService.findAll()).thenReturn(new ArrayList<>());
        assertTrue(bookingController.getCities().isEmpty());
        verify(cityService).findAll();
    }

    /**
     * Method under test: {@link BookingController#getCities()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetCities4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalStateException: Duplicate key 123 (attempted merging values Oxford and Oxford)
        //       at java.util.stream.Collectors.duplicateKeyException(Collectors.java:135)
        //       at java.util.stream.Collectors.lambda$uniqKeysMapAccumulator$1(Collectors.java:182)
        //       at java.util.stream.ReduceOps$3ReducingSink.accept(ReduceOps.java:169)
        //       at java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1625)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:682)
        //       at com.learning.hotelbooking.controller.BookingController.getCities(BookingController.java:67)
        //   In order to prevent getCities()
        //   from throwing IllegalStateException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getCities().
        //   See https://diff.blue/R013 to resolve this issue.

        City city = new City();
        city.setBookings(new ArrayList<>());
        city.setCityId(123L);
        city.setCityName("Oxford");
        city.setHotels(new ArrayList<>());

        City city1 = new City();
        city1.setBookings(new ArrayList<>());
        city1.setCityId(1234L);
        city1.setCityName("Oxford1");
        city1.setHotels(new ArrayList<>());

        ArrayList<City> cityList = new ArrayList<>();
        cityList.add(city1);
        cityList.add(city);
        when(cityService.findAll()).thenReturn(cityList);
        bookingController.getCities();
    }

    /**
     * Method under test: {@link BookingController#getCities()}
     */
    @Test
    void testGetCities5() {
        when(cityService.findAll()).thenReturn(new ArrayList<>());
        assertTrue(bookingController.getCities().isEmpty());
        verify(cityService).findAll();
    }

    /**
     * Method under test: {@link BookingController#getCities()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetCities6() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IllegalStateException: Duplicate key 123 (attempted merging values Oxford and Oxford)
        //       at java.util.stream.Collectors.duplicateKeyException(Collectors.java:135)
        //       at java.util.stream.Collectors.lambda$uniqKeysMapAccumulator$1(Collectors.java:182)
        //       at java.util.stream.ReduceOps$3ReducingSink.accept(ReduceOps.java:169)
        //       at java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1625)
        //       at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509)
        //       at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
        //       at java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
        //       at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        //       at java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:682)
        //       at com.learning.hotelbooking.controller.BookingController.getCities(BookingController.java:67)
        //   In order to prevent getCities()
        //   from throwing IllegalStateException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getCities().
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

        ArrayList<City> cityList = new ArrayList<>();
        cityList.add(city1);
        cityList.add(city);
        when(cityService.findAll()).thenReturn(cityList);
        bookingController.getCities();
    }

    /**
     * Method under test: {@link BookingController#viewRooms()}
     */
    @Test
    void testViewRooms() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   javax.servlet.ServletException: Circular view path [viewrooms]: would dispatch back to the current handler URL [/viewrooms] again. Check your ViewResolver setup! (Hint: This may be the result of an unspecified view, due to default view name generation.)
        //       at org.springframework.web.servlet.view.InternalResourceView.prepareForRendering(InternalResourceView.java:210)
        //       at org.springframework.web.servlet.view.InternalResourceView.renderMergedOutputModel(InternalResourceView.java:148)
        //       at org.springframework.web.servlet.view.AbstractView.render(AbstractView.java:316)
        //       at org.springframework.web.servlet.DispatcherServlet.render(DispatcherServlet.java:1401)
        //       at org.springframework.test.web.servlet.TestDispatcherServlet.render(TestDispatcherServlet.java:137)
        //       at org.springframework.web.servlet.DispatcherServlet.processDispatchResult(DispatcherServlet.java:1145)
        //       at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1084)
        //       at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:963)
        //       at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1006)
        //       at org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:898)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:655)
        //       at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:883)
        //       at org.springframework.test.web.servlet.TestDispatcherServlet.service(TestDispatcherServlet.java:72)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:764)
        //       at org.springframework.mock.web.MockFilterChain$ServletFilterProxy.doFilter(MockFilterChain.java:167)
        //       at org.springframework.mock.web.MockFilterChain.doFilter(MockFilterChain.java:134)
        //       at org.springframework.test.web.servlet.MockMvc.perform(MockMvc.java:199)
        //   In order to prevent viewRooms()
        //   from throwing ServletException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   viewRooms().
        //   See https://diff.blue/R013 to resolve this issue.

        ModelAndView actualViewRoomsResult = (new BookingController()).viewRooms();
        assertTrue(actualViewRoomsResult.isReference());
        assertSame(actualViewRoomsResult.getModel(), actualViewRoomsResult.getModelMap());
    }

    /**
     * Method under test: {@link BookingController#viewRooms()}
     */
    @Test
    void testViewRooms2() throws Exception {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   javax.servlet.ServletException: Circular view path [viewrooms]: would dispatch back to the current handler URL [/viewrooms] again. Check your ViewResolver setup! (Hint: This may be the result of an unspecified view, due to default view name generation.)
        //       at org.springframework.web.servlet.view.InternalResourceView.prepareForRendering(InternalResourceView.java:210)
        //       at org.springframework.web.servlet.view.InternalResourceView.renderMergedOutputModel(InternalResourceView.java:148)
        //       at org.springframework.web.servlet.view.AbstractView.render(AbstractView.java:316)
        //       at org.springframework.web.servlet.DispatcherServlet.render(DispatcherServlet.java:1401)
        //       at org.springframework.test.web.servlet.TestDispatcherServlet.render(TestDispatcherServlet.java:137)
        //       at org.springframework.web.servlet.DispatcherServlet.processDispatchResult(DispatcherServlet.java:1145)
        //       at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1084)
        //       at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:963)
        //       at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1006)
        //       at org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:898)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:655)
        //       at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:883)
        //       at org.springframework.test.web.servlet.TestDispatcherServlet.service(TestDispatcherServlet.java:72)
        //       at javax.servlet.http.HttpServlet.service(HttpServlet.java:764)
        //       at org.springframework.mock.web.MockFilterChain$ServletFilterProxy.doFilter(MockFilterChain.java:167)
        //       at org.springframework.mock.web.MockFilterChain.doFilter(MockFilterChain.java:134)
        //       at org.springframework.test.web.servlet.MockMvc.perform(MockMvc.java:199)
        //   In order to prevent viewRooms()
        //   from throwing ServletException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   viewRooms().
        //   See https://diff.blue/R013 to resolve this issue.

        BeanPropertyBindingResult beanPropertyBindingResult = mock(BeanPropertyBindingResult.class);
        when(beanPropertyBindingResult.hasErrors()).thenReturn(true);
        BindException bindingResult = new BindException(
                new BindException(new BindException(new BindException(beanPropertyBindingResult))));

        BookingController bookingController = new BookingController();
        Booking b = new Booking();
        bookingController.addBooking(b, bindingResult, new ConcurrentModel());
        ModelAndView actualViewRoomsResult = bookingController.viewRooms();
        assertTrue(actualViewRoomsResult.isReference());
        assertSame(actualViewRoomsResult.getModel(), actualViewRoomsResult.getModelMap());
        verify(beanPropertyBindingResult).hasErrors();
    }

    /**
     * Method under test: {@link BookingController#searchRooms(Booking, Model)}
     */
    @Test
    void testSearchRooms() throws Exception {
        when(cityService.findAll()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/view/search");
        MockMvcBuilders.standaloneSetup(bookingController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(2))
                .andExpect(MockMvcResultMatchers.model().attributeExists("booking", "cities"))
                .andExpect(MockMvcResultMatchers.view().name("viewrooms"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("viewrooms"));
    }

    /**
     * Method under test: {@link BookingController#searchRooms(Booking, Model)}
     */
    @Test
    void testSearchRooms2() throws Exception {
        when(cityService.findAll()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/view/search");
        MockMvcBuilders.standaloneSetup(bookingController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(2))
                .andExpect(MockMvcResultMatchers.model().attributeExists("booking", "cities"))
                .andExpect(MockMvcResultMatchers.view().name("viewrooms"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("viewrooms"));
    }
}

