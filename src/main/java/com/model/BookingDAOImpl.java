package com.model;
import javax.persistence.Entity;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Entities.*;

@Component
public class BookingDAOImpl implements BookingDAO {
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void saveBooking(Booking booking)
	{
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction()  ; 
			    
				session.save(booking);
				session.flush();
				session.close(); 
				tx.commit();
				
			}

	
	
	public boolean deleteBooking(Booking booking)
	{
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.delete(booking);
		session.flush();
		session.close();
		return true;
	}
	public boolean updateBooking(Booking booking)
	{
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.update(booking);
		session.flush();
		session.close();
		tx.commit();
		return true;
	}
	public List<Booking> findAll()
	{
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		org.hibernate.Query query=session.createQuery("select i from BookingDetail i");
		tx.commit();
		return query.list();
	}
	@Override
	public Booking findBoooking(int bookingId) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		Booking booking=session.get(Booking.class,bookingId);
tx.commit();
		return booking;
	}
	
	public BookingDetail booking(Booking booking,int noOfSeats,SeatType seatType)
	{
	Session session=sessionFactory.openSession();
	Transaction tx=session.beginTransaction();
	session.save(booking);
	BookingDetail b=new BookingDetail();
	b.setNoOfSeats(noOfSeats);
	b.setSeatType(seatType);
	session.save(b);

	//booking.getBookingDetails().add(b);
	session.flush();
	session.close();
	tx.commit();
	return b;
	}
			
		
	}
	
	
