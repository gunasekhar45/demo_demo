package com.example.demo.Entities;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Shows {
	@Id
	int showId;
	@ManyToOne
	Hall hall;
	@ManyToOne
	Movies movies;
	public List<Booking> getBooking() {
		return booking;
	}
	public void setBooking(List<Booking> booking) {
		this.booking = booking;
	}
	@OneToMany
	List<Booking> booking;
	int slotNo;
	Date fromDate;
	Date toDate;
	public int getShowId() {
		return showId;
	}
	public void setShowId(int showId) {
		this.showId = showId;
	}
	public Hall getHall() {
		return hall;
	}
	public Shows(int showId, Hall hall, Movies movies, List<Booking> booking, int slotNo, Date fromDate, Date toDate) {
		super();
		this.showId = showId;
		this.hall = hall;
		this.movies = movies;
		this.booking = booking;
		this.slotNo = slotNo;
		this.fromDate = fromDate;
		this.toDate = toDate;
	}
	public void setHall(Hall hall) {
		this.hall = hall;
	}
	public Movies getMovies() {
		return movies;
	}
	public Shows() {
		super();
		
	}
	public Shows(int showId, int slotNo, Date fromDate, Date toDate) {
		super();
		this.showId = showId;
		this.slotNo = slotNo;
		this.fromDate = fromDate;
		this.toDate = toDate;
	}
	public void setMovies(Movies movies) {
		this.movies = movies;
	}
	public int getSlotNo() {
		return slotNo;
	}
	public void setSlotNo(int slotNo) {
		this.slotNo = slotNo;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	
	
	
}