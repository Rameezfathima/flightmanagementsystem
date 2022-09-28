package com.springboot.booking.controller;

import java.awt.print.Book;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.booking.model.Booking;
import com.springboot.booking.service.BookService;

@RestController
@RequestMapping("api/book")
public class BookController {
	private BookService bookService;

	public BookController(BookService bookService) {
		super();
		this.bookService = bookService;
	}
	@PostMapping
	public ResponseEntity<Booking>saveBooking(@RequestBody Booking booking){
		return new ResponseEntity<Booking> (bookService.saveBooking(booking),
				HttpStatus.OK);
		
	}
	@GetMapping()
	public List<Booking> getAllBookings(){
		return bookService.getAllBookings();
	}
	@GetMapping("{id}")
	public ResponseEntity<Booking>getBookingById(@PathVariable long id){
		return new ResponseEntity<Booking>(bookService.getBookingById(id),HttpStatus.OK);
        
    }
	

	//update all detail
	@PutMapping("{id}")
	public ResponseEntity<Booking> updateBooking(@PathVariable("id")long id,
			@RequestBody Booking booking){
		return new ResponseEntity<Booking>(bookService.updateBooking(booking, id)
				,HttpStatus.OK);}
	
	//dELETE BOOKING
	@DeleteMapping("{id}")
	public ResponseEntity<String>deleteBooking(@PathVariable("id")long id)
	{
		bookService.deleteBooking(id);
		return new ResponseEntity<String>("Deleted successfully",HttpStatus.OK);}
			
		
	}
	
	
