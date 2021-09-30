package com.example.demo.Entities;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Booking {
	public Booking(){
		
	}
	@Id
	@GeneratedValue
	int bookingId;
	@ManyToOne
	Shows show;
	@ManyToOne
	Users userId;
	@OneToMany
	List<BookingDetail> bookingDetails;
	public List<BookingDetail> getBookingDetails() {
		return bookingDetails;
	}
	public void setBookingDetails(List<BookingDetail> bookingDetails) {
		this.bookingDetails = bookingDetails;
	}
	Date bookedDate;
	
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public Shows getS() {
		return show;
	}
	public void setS(Shows show) {
		this.show = show;
	}
	public Users getUserId() {
		return userId;
	}
	public void setUserId(Users userId) {
		this.userId = userId;
	}
	public Date getBookedDate() {
		return bookedDate;
	}
	public void setBookedDate(Date bookedDate) {
		this.bookedDate = bookedDate;
	}
	
	
	public Booking(int bookingId, Shows show, Users userId, List<BookingDetail> bookingDetails, Date bookedDate) {
		super();
		this.bookingId = bookingId;
		this.show = show;
		this.userId = userId;
		this.bookingDetails = bookingDetails;
		this.bookedDate = bookedDate;
		
	}
	
	
}