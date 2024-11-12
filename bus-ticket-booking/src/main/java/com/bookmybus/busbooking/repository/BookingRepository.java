package com.bookmybus.busbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookmybus.busbooking.entity.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {

}
