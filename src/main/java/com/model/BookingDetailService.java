package com.model;
import javax.persistence.Entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Entities.*;

@Component
public class BookingDetailService {
	@Autowired
	BookingDetailDAO bookingDetailDAOImpl;
	
	public void save(BookingDetail bookingDetail)
	{
		bookingDetailDAOImpl.saveBookingDetail(bookingDetail);
	}
	
	public BookingDetail find(int id) 
	{
		return bookingDetailDAOImpl.findBoookingDetail(id);
	}
	
	public List<BookingDetail> getAll()
	{
		return bookingDetailDAOImpl.findAll();
	}
	
	public boolean delete(int id)
	{
		BookingDetail bookingDetail=find(id);
		return bookingDetailDAOImpl.deleteBookingDetail(bookingDetail);
	}
	
	public boolean update(BookingDetail bookingDetail) 
	{
		return bookingDetailDAOImpl.updateBookingDetail(bookingDetail);
	}
}