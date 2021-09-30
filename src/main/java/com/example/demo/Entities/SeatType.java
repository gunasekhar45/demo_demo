package com.example.demo.Entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class SeatType {
	@Id
	int seatTypeId;
	String seatTypeDesc;
	float seatFare;
	@OneToMany
	List<HallCapacity> hallCapacity;
	public List<HallCapacity> getHallCapacity() {
		return hallCapacity;
	}
	public void setHallCapacity(List<HallCapacity> hallCapacity) {
		this.hallCapacity = hallCapacity;
	}
	public List<BookingDetail> getBookingDetail() {
		return bookingDetail;
	}
	public void setBookingDetail(List<BookingDetail> bookingDetail) {
		this.bookingDetail = bookingDetail;
	}
	@OneToMany
	List<BookingDetail> bookingDetail;
	public int getSeatTypeId() {
		return seatTypeId;
	}
	public void setSeatTypeId(int seatTypeId) {
		this.seatTypeId = seatTypeId;
	}
	public String getSeatTypeDesc() {
		return seatTypeDesc;
	}
	public void setSeatTypeDesc(String seatTypeDesc) {
		this.seatTypeDesc = seatTypeDesc;
	}
	public float getSeatFare() {
		return seatFare;
	}
	public void setSeatFare(float seatFare) {
		this.seatFare = seatFare;
	}
	
	public SeatType(int seatTypeId, String seatTypeDesc, float seatFare, List<HallCapacity> hallCapacity,
			List<BookingDetail> bookingDetail) {
		super();
		this.seatTypeId = seatTypeId;
		this.seatTypeDesc = seatTypeDesc;
		this.seatFare = seatFare;
		this.hallCapacity = hallCapacity;
		this.bookingDetail = bookingDetail;
	}
	public SeatType() {
		super();
	}
}