package com.example.demo.Entities;



import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class BookingDetail implements Serializable {
	@Id
	@GeneratedValue
	int bookingDetailId;
	@ManyToOne
	Booking booking;
	@ManyToOne
	SeatType seatType;
	int noOfSeats;
	public Booking getBooking() {
		return booking;
	}
	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	public SeatType getSeatType() {
		return seatType;
	}
	public void setSeatType(SeatType seatType) {
		this.seatType = seatType;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public BookingDetail(Booking booking, SeatType seatType, int noOfSeats) {
		super();
		this.booking = booking;
		this.seatType = seatType;
		this.noOfSeats = noOfSeats;
	}
	public BookingDetail() {
		super();
	}
	
}