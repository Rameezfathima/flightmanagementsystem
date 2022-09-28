package com.springboot.booking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.booking.model.Booking;

@Repository
public interface BookRepository extends JpaRepository<Booking,Long>{

	

}
