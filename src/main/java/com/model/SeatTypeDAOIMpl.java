package com.model;
import javax.persistence.Entity;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Entities.*;

@Component
public class SeatTypeDAOIMpl implements SeatTypeDAO {
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void saveSeatType(SeatType seattype)
	{
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(seattype);
		session.flush();
		session.close(); 
		tx.commit();
	}
	
	public boolean deleteSeatType(SeatType seattype)
	{
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.delete(seattype);
		session.flush();
		session.close();
		return true;
	}
	public boolean updateSeatType(SeatType seattype)
	{
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.update(seattype);
		session.flush();
		session.close();
		tx.commit();
		return true;
	}
	public List<SeatType> findAll()
	{
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		org.hibernate.Query query=session.createQuery("select i from SeatType i");
		tx.commit();
		return query.list();
	}

	@Override
	public SeatType findSeatType(int seatTypeId) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		SeatType seattype=session.get(SeatType.class,seatTypeId);
tx.commit();
		return seattype;
	}
	
	
	
	
	
}