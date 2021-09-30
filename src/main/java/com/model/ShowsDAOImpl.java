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
public class ShowsDAOImpl implements ShowsDAO {
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void saveShows(Shows shows)
	{
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(shows);
		session.flush();
		session.close(); 
		tx.commit();
	}
	
	public boolean deleteShows(Shows shows)
	{
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.delete(shows);
		session.flush();
		session.close();
		return true;
	}
	public boolean updateShows(Shows shows)
	{
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.update(shows);
		session.flush();
		session.close();
		tx.commit();
		return true;
	}
	public List<Shows> findAll()
	{
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		org.hibernate.Query query=session.createQuery("select i from Shows i");
		tx.commit();
		return query.list();
	}

	@Override
	public Shows findShows(int userId) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		Shows shows=session.get(Shows.class,userId);
tx.commit();
		return shows;
	}
	
	
	
	
	
}