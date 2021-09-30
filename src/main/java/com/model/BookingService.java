package com.model;
import javax.persistence.Entity;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Entities.*;

@Component
public class BookingService {
	@Autowired
	BookingDAO bookingDAOImpl;
	
	public void save(Booking booking)
	{
		bookingDAOImpl.saveBooking(booking);
	}
	
	public Booking find(int id) 
	{
		return bookingDAOImpl.findBoooking(id);
	}
	
	public List<Booking> getAll()
	{
		return bookingDAOImpl.findAll();
	}
	
	public boolean delete(int id)
	{
		Booking booking=find(id);
		return bookingDAOImpl.deleteBooking(booking);
	}
	
	public boolean update(Booking booking) 
	{
		return bookingDAOImpl.updateBooking(booking);
	}

	public BookingDetail booking(Booking booking,int noOfSeats,SeatType seatType) {
		// TODO Auto-generated method stub
		return bookingDAOImpl.booking(booking,noOfSeats,seatType);
		}

	}