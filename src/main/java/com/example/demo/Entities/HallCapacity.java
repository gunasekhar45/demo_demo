package com.example.demo.Entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class HallCapacity implements Serializable {
	@Id
	@ManyToOne
	Hall hall;
	@ManyToOne
	SeatType seatType;
	int seatCount;
	public HallCapacity() {
		super();
	}
	public Hall getHall() {
		return hall;
	}
	public void setHall(Hall hall) {
		this.hall = hall;
	}
	public SeatType getSeatType() {
		return seatType;
	}
	public void setSeatType(SeatType seatType) {
		this.seatType = seatType;
	}
	public int getSeatCount() {
		return seatCount;
	}
	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}
	public HallCapacity(Hall hall, SeatType seatType, int seatCount) {
		super();
		this.hall = hall;
		this.seatType = seatType;
		this.seatCount = seatCount;
	}
}