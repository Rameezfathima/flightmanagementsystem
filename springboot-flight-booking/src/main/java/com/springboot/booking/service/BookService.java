package com.springboot.booking.service;

import java.awt.print.Book;
import java.util.List;

import com.springboot.booking.model.Booking;

public interface BookService {
	//save
	Booking saveBooking(Booking booking);
//VIEW SINGLE BOOKING
	Booking getBookingById(long id);
	//FIND ALL
	List<Booking>getAllBookings();
	//update booking
	Booking updateBooking(Booking booking,long id);
	//delete booking
	void deleteBooking(long id);
	
	
	
 
}
