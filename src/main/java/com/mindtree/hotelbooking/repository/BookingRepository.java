/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mindtree.hotelbooking.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.hotelbooking.model.Booking;

/**
 *
 * @author M1030360
 */
@Repository
public interface BookingRepository extends CrudRepository<Booking, Long> {

}
