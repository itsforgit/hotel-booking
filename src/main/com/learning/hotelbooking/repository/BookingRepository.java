/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.learning.hotelbooking.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.learning.hotelbooking.model.BookingEntity;

@Repository
public interface BookingRepository extends CrudRepository<BookingEntity, Long> {

}
