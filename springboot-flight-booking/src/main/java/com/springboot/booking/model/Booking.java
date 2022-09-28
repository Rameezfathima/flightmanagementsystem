package com.springboot.booking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book_table")
public class Booking {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long bookingid;
	@Column(name="ticket_cost")
	private double ticketcost;
	@Column(name="no_ofpassengers")
	private int noofpassengers;
	@Column(name="book_date")
	private String bookingdate;
	public Booking(long bookingid, double ticketcost, int noofpassengers, String bookingdate) {
		super();
		this.bookingid = bookingid;
		this.ticketcost = ticketcost;
		this.noofpassengers = noofpassengers;
		this.bookingdate = bookingdate;
	}
	public Booking() {
		super();
	}
	public long getBookingid() {
		return bookingid;
	}
	public void setBookingid(long bookingid) {
		this.bookingid = bookingid;
	}
	public double getTicketcost() {
		return ticketcost;
	}
	public void setTicketcost(double ticketcost) {
		this.ticketcost = ticketcost;
	}
	public int getNoofpassengers() {
		return noofpassengers;
	}
	public void setNoofpassengers(int noofpassengers) {
		this.noofpassengers = noofpassengers;
	}
	public String getBookingdate() {
		return bookingdate;
	}
	public void setBookingdate(String bookingdate) {
		this.bookingdate = bookingdate;
	}
	

}
