package com.learning.hotelbooking.repository;

import com.learning.hotelbooking.model.City;
import com.learning.hotelbooking.model.Hotel;

import java.util.ArrayList;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = {HotelRepository.class})
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.learning.hotelbooking.model"})
@DataJpaTest(properties = {"spring.main.allow-bean-definition-overriding=true"})
class HotelRepositoryTest {
    @Autowired
    private HotelRepository hotelRepository;

    /**
     * Method under test: {@link HotelRepository#findAllByCityOrderByTariffPerDayAsc(City)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testFindAllByCityOrderByTariffPerDayAsc() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   org.springframework.dao.DataIntegrityViolationException: could not execute statement; SQL [n/a]; constraint [FKF1IABDV6BI2YOHH9H48WCE42X]; nested exception is org.hibernate.exception.ConstraintViolationException: could not execute statement
        //       at org.springframework.orm.jpa.vendor.HibernateJpaDialect.convertHibernateAccessException(HibernateJpaDialect.java:276)
        //       at org.springframework.orm.jpa.vendor.HibernateJpaDialect.translateExceptionIfPossible(HibernateJpaDialect.java:233)
        //       at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.translateExceptionIfPossible(AbstractEntityManagerFactoryBean.java:551)
        //       at org.springframework.dao.support.ChainedPersistenceExceptionTranslator.translateExceptionIfPossible(ChainedPersistenceExceptionTranslator.java:61)
        //       at org.springframework.dao.support.DataAccessUtils.translateIfNecessary(DataAccessUtils.java:242)
        //       at org.springframework.dao.support.PersistenceExceptionTranslationInterceptor.invoke(PersistenceExceptionTranslationInterceptor.java:152)
        //       at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)
        //       at org.springframework.data.jpa.repository.support.CrudMethodMetadataPostProcessor$CrudMethodMetadataPopulatingMethodInterceptor.invoke(CrudMethodMetadataPostProcessor.java:145)
        //       at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)
        //       at org.springframework.aop.interceptor.ExposeInvocationInterceptor.invoke(ExposeInvocationInterceptor.java:97)
        //       at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)
        //       at org.springframework.aop.framework.JdkDynamicAopProxy.invoke(JdkDynamicAopProxy.java:215)
        //       at jdk.proxy4.$Proxy126.findAllByCityOrderByTariffPerDayAsc(null)
        //   In order to prevent findAllByCityOrderByTariffPerDayAsc(City)
        //   from throwing DataIntegrityViolationException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   findAllByCityOrderByTariffPerDayAsc(City).
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
        hotel.setNoOfRooms(1000);
        hotel.setRating("Rating");
        hotel.setTariffPerDay(10.0d);

        City city1 = new City();
        city1.setBookings(new ArrayList<>());
        city1.setCityId(123L);
        city1.setCityName("Oxford");
        city1.setHotels(new ArrayList<>());

        Hotel hotel1 = new Hotel();
        hotel1.setCity(city1);
        hotel1.setHotelImgPath("Hotel Img Path");
        hotel1.setHotelName("Hotel Name");
        hotel1.setNoOfRooms(1000);
        hotel1.setRating("Rating");
        hotel1.setTariffPerDay(10.0d);
        hotelRepository.save(hotel);
        hotelRepository.save(hotel1);

        City city2 = new City();
        city2.setBookings(new ArrayList<>());
        city2.setCityName("Oxford");
        city2.setHotels(new ArrayList<>());
        hotelRepository.findAllByCityOrderByTariffPerDayAsc(city2);
    }

    /**
     * Method under test: {@link HotelRepository#findAllByCityOrderByTariffPerDayAsc(City)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testFindAllByCityOrderByTariffPerDayAsc2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   org.springframework.dao.DataIntegrityViolationException: could not execute statement; SQL [n/a]; constraint [FKF1IABDV6BI2YOHH9H48WCE42X]; nested exception is org.hibernate.exception.ConstraintViolationException: could not execute statement
        //       at org.springframework.orm.jpa.vendor.HibernateJpaDialect.convertHibernateAccessException(HibernateJpaDialect.java:276)
        //       at org.springframework.orm.jpa.vendor.HibernateJpaDialect.translateExceptionIfPossible(HibernateJpaDialect.java:233)
        //       at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.translateExceptionIfPossible(AbstractEntityManagerFactoryBean.java:551)
        //       at org.springframework.dao.support.ChainedPersistenceExceptionTranslator.translateExceptionIfPossible(ChainedPersistenceExceptionTranslator.java:61)
        //       at org.springframework.dao.support.DataAccessUtils.translateIfNecessary(DataAccessUtils.java:242)
        //       at org.springframework.dao.support.PersistenceExceptionTranslationInterceptor.invoke(PersistenceExceptionTranslationInterceptor.java:152)
        //       at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)
        //       at org.springframework.data.jpa.repository.support.CrudMethodMetadataPostProcessor$CrudMethodMetadataPopulatingMethodInterceptor.invoke(CrudMethodMetadataPostProcessor.java:145)
        //       at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)
        //       at org.springframework.aop.interceptor.ExposeInvocationInterceptor.invoke(ExposeInvocationInterceptor.java:97)
        //       at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)
        //       at org.springframework.aop.framework.JdkDynamicAopProxy.invoke(JdkDynamicAopProxy.java:215)
        //       at jdk.proxy4.$Proxy126.findAllByCityOrderByTariffPerDayAsc(null)
        //   In order to prevent findAllByCityOrderByTariffPerDayAsc(City)
        //   from throwing DataIntegrityViolationException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   findAllByCityOrderByTariffPerDayAsc(City).
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
        hotel.setNoOfRooms(1000);
        hotel.setRating("Rating");
        hotel.setTariffPerDay(10.0d);

        City city1 = new City();
        city1.setBookings(new ArrayList<>());
        city1.setCityId(123L);
        city1.setCityName("Oxford");
        city1.setHotels(new ArrayList<>());

        Hotel hotel1 = new Hotel();
        hotel1.setCity(city1);
        hotel1.setHotelImgPath("Hotel Img Path");
        hotel1.setHotelName("Hotel Name");
        hotel1.setNoOfRooms(1000);
        hotel1.setRating("Rating");
        hotel1.setTariffPerDay(10.0d);
        hotelRepository.save(hotel);
        hotelRepository.save(hotel1);

        City city2 = new City();
        city2.setBookings(new ArrayList<>());
        city2.setCityName("Oxford");
        city2.setHotels(new ArrayList<>());
        hotelRepository.findAllByCityOrderByTariffPerDayAsc(city2);
    }

    /**
     * Method under test: {@link HotelRepository#findAllByCityOrderByRatingAsc(City)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testFindAllByCityOrderByRatingAsc() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   org.springframework.dao.DataIntegrityViolationException: could not execute statement; SQL [n/a]; constraint [FKF1IABDV6BI2YOHH9H48WCE42X]; nested exception is org.hibernate.exception.ConstraintViolationException: could not execute statement
        //       at org.springframework.orm.jpa.vendor.HibernateJpaDialect.convertHibernateAccessException(HibernateJpaDialect.java:276)
        //       at org.springframework.orm.jpa.vendor.HibernateJpaDialect.translateExceptionIfPossible(HibernateJpaDialect.java:233)
        //       at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.translateExceptionIfPossible(AbstractEntityManagerFactoryBean.java:551)
        //       at org.springframework.dao.support.ChainedPersistenceExceptionTranslator.translateExceptionIfPossible(ChainedPersistenceExceptionTranslator.java:61)
        //       at org.springframework.dao.support.DataAccessUtils.translateIfNecessary(DataAccessUtils.java:242)
        //       at org.springframework.dao.support.PersistenceExceptionTranslationInterceptor.invoke(PersistenceExceptionTranslationInterceptor.java:152)
        //       at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)
        //       at org.springframework.data.jpa.repository.support.CrudMethodMetadataPostProcessor$CrudMethodMetadataPopulatingMethodInterceptor.invoke(CrudMethodMetadataPostProcessor.java:145)
        //       at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)
        //       at org.springframework.aop.interceptor.ExposeInvocationInterceptor.invoke(ExposeInvocationInterceptor.java:97)
        //       at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)
        //       at org.springframework.aop.framework.JdkDynamicAopProxy.invoke(JdkDynamicAopProxy.java:215)
        //       at jdk.proxy4.$Proxy126.findAllByCityOrderByRatingAsc(null)
        //   In order to prevent findAllByCityOrderByRatingAsc(City)
        //   from throwing DataIntegrityViolationException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   findAllByCityOrderByRatingAsc(City).
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
        hotel.setNoOfRooms(1000);
        hotel.setRating("Rating");
        hotel.setTariffPerDay(10.0d);

        City city1 = new City();
        city1.setBookings(new ArrayList<>());
        city1.setCityId(123L);
        city1.setCityName("Oxford");
        city1.setHotels(new ArrayList<>());

        Hotel hotel1 = new Hotel();
        hotel1.setCity(city1);
        hotel1.setHotelImgPath("Hotel Img Path");
        hotel1.setHotelName("Hotel Name");
        hotel1.setNoOfRooms(1000);
        hotel1.setRating("Rating");
        hotel1.setTariffPerDay(10.0d);
        hotelRepository.save(hotel);
        hotelRepository.save(hotel1);

        City city2 = new City();
        city2.setBookings(new ArrayList<>());
        city2.setCityName("Oxford");
        city2.setHotels(new ArrayList<>());
        hotelRepository.findAllByCityOrderByRatingAsc(city2);
    }

    /**
     * Method under test: {@link HotelRepository#findAllByCityOrderByHotelNameAsc(City)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testFindAllByCityOrderByHotelNameAsc() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   org.springframework.dao.DataIntegrityViolationException: could not execute statement; SQL [n/a]; constraint [FKF1IABDV6BI2YOHH9H48WCE42X]; nested exception is org.hibernate.exception.ConstraintViolationException: could not execute statement
        //       at org.springframework.orm.jpa.vendor.HibernateJpaDialect.convertHibernateAccessException(HibernateJpaDialect.java:276)
        //       at org.springframework.orm.jpa.vendor.HibernateJpaDialect.translateExceptionIfPossible(HibernateJpaDialect.java:233)
        //       at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.translateExceptionIfPossible(AbstractEntityManagerFactoryBean.java:551)
        //       at org.springframework.dao.support.ChainedPersistenceExceptionTranslator.translateExceptionIfPossible(ChainedPersistenceExceptionTranslator.java:61)
        //       at org.springframework.dao.support.DataAccessUtils.translateIfNecessary(DataAccessUtils.java:242)
        //       at org.springframework.dao.support.PersistenceExceptionTranslationInterceptor.invoke(PersistenceExceptionTranslationInterceptor.java:152)
        //       at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)
        //       at org.springframework.data.jpa.repository.support.CrudMethodMetadataPostProcessor$CrudMethodMetadataPopulatingMethodInterceptor.invoke(CrudMethodMetadataPostProcessor.java:145)
        //       at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)
        //       at org.springframework.aop.interceptor.ExposeInvocationInterceptor.invoke(ExposeInvocationInterceptor.java:97)
        //       at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)
        //       at org.springframework.aop.framework.JdkDynamicAopProxy.invoke(JdkDynamicAopProxy.java:215)
        //       at jdk.proxy4.$Proxy126.findAllByCityOrderByHotelNameAsc(null)
        //   In order to prevent findAllByCityOrderByHotelNameAsc(City)
        //   from throwing DataIntegrityViolationException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   findAllByCityOrderByHotelNameAsc(City).
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
        hotel.setNoOfRooms(1000);
        hotel.setRating("Rating");
        hotel.setTariffPerDay(10.0d);

        City city1 = new City();
        city1.setBookings(new ArrayList<>());
        city1.setCityId(123L);
        city1.setCityName("Oxford");
        city1.setHotels(new ArrayList<>());

        Hotel hotel1 = new Hotel();
        hotel1.setCity(city1);
        hotel1.setHotelImgPath("Hotel Img Path");
        hotel1.setHotelName("Hotel Name");
        hotel1.setNoOfRooms(1000);
        hotel1.setRating("Rating");
        hotel1.setTariffPerDay(10.0d);
        hotelRepository.save(hotel);
        hotelRepository.save(hotel1);

        City city2 = new City();
        city2.setBookings(new ArrayList<>());
        city2.setCityName("Oxford");
        city2.setHotels(new ArrayList<>());
        hotelRepository.findAllByCityOrderByHotelNameAsc(city2);
    }

    /**
     * Method under test: {@link HotelRepository#findAllByCityOrderByHotelNameAsc(Long)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testFindAllByCityOrderByHotelNameAsc2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   org.springframework.dao.DataIntegrityViolationException: could not execute statement; SQL [n/a]; constraint [FKF1IABDV6BI2YOHH9H48WCE42X]; nested exception is org.hibernate.exception.ConstraintViolationException: could not execute statement
        //       at org.springframework.orm.jpa.vendor.HibernateJpaDialect.convertHibernateAccessException(HibernateJpaDialect.java:276)
        //       at org.springframework.orm.jpa.vendor.HibernateJpaDialect.translateExceptionIfPossible(HibernateJpaDialect.java:233)
        //       at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.translateExceptionIfPossible(AbstractEntityManagerFactoryBean.java:551)
        //       at org.springframework.dao.support.ChainedPersistenceExceptionTranslator.translateExceptionIfPossible(ChainedPersistenceExceptionTranslator.java:61)
        //       at org.springframework.dao.support.DataAccessUtils.translateIfNecessary(DataAccessUtils.java:242)
        //       at org.springframework.dao.support.PersistenceExceptionTranslationInterceptor.invoke(PersistenceExceptionTranslationInterceptor.java:152)
        //       at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)
        //       at org.springframework.data.jpa.repository.support.CrudMethodMetadataPostProcessor$CrudMethodMetadataPopulatingMethodInterceptor.invoke(CrudMethodMetadataPostProcessor.java:145)
        //       at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)
        //       at org.springframework.aop.interceptor.ExposeInvocationInterceptor.invoke(ExposeInvocationInterceptor.java:97)
        //       at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)
        //       at org.springframework.aop.framework.JdkDynamicAopProxy.invoke(JdkDynamicAopProxy.java:215)
        //       at jdk.proxy4.$Proxy126.findAllByCityOrderByHotelNameAsc(null)
        //   In order to prevent findAllByCityOrderByHotelNameAsc(Long)
        //   from throwing DataIntegrityViolationException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   findAllByCityOrderByHotelNameAsc(Long).
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
        hotel.setNoOfRooms(1000);
        hotel.setRating("Rating");
        hotel.setTariffPerDay(10.0d);

        City city1 = new City();
        city1.setBookings(new ArrayList<>());
        city1.setCityId(123L);
        city1.setCityName("Oxford");
        city1.setHotels(new ArrayList<>());

        Hotel hotel1 = new Hotel();
        hotel1.setCity(city1);
        hotel1.setHotelImgPath("Hotel Img Path");
        hotel1.setHotelName("Hotel Name");
        hotel1.setNoOfRooms(1000);
        hotel1.setRating("Rating");
        hotel1.setTariffPerDay(10.0d);
        hotelRepository.save(hotel);
        hotelRepository.save(hotel1);
        hotelRepository.findAllByCityOrderByHotelNameAsc(1L);
    }
}

