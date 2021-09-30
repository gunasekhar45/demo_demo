package com.model;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.Entities.*;



@Component
public interface BookingDAO {
	
	public Booking findBoooking(int userId);
	public boolean deleteBooking(Booking booking);
	public boolean updateBooking(Booking booking);
	public List<Booking> findAll();
	public void saveBooking(Booking booking);
	
	public BookingDetail booking(Booking booking, int noOfSeats, SeatType seatType);

}
