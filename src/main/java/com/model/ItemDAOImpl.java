package com.model;

import java.util.ArrayList;
import java.util.List;

import javax.management.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ItemDAOImpl implements ItemDAO{
	@Autowired
	SessionFactory sessionFactory;
	public void saveItem(Item item)
	{
		Session session=sessionFactory.openSession();
		session.save(item);
		session.flush();
		session.close();
	}
	public Item findItem(int id)
	{
		Session session=sessionFactory.openSession();
		Item item=session.get(Item.class, id);
		return item;
	}
	
	public boolean deleteItem(Item item)
	{
		Session session=sessionFactory.openSession();
		session.delete(item);
		session.flush();
		session.close();
		return true;
	}
	public boolean updateItem(Item item)
	{
		Session session=sessionFactory.openSession();
		session.update(item);
		session.flush();
		session.close();
		
		return true;
	}
	public List<Item> findAll()
	{
		Session session=sessionFactory.openSession();
		org.hibernate.Query query=session.createQuery("select i from Item i");
		
		return query.list();
	}
}