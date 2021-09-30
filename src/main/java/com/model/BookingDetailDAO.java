package com.model;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.Entities.*;



@Component
public interface BookingDetailDAO {
	
	public BookingDetail findBoookingDetail(int userId);
	public boolean deleteBookingDetail(BookingDetail bookingdetail);
	public boolean updateBookingDetail(BookingDetail bookingdetail);
	public List<BookingDetail> findAll();
	public void saveBookingDetail(BookingDetail bookingdetail);

}
