package com.model;
import javax.persistence.Entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Entities.*;

@Component
public class ShowsService {
	@Autowired
	ShowsDAO showsDAOImpl;
	
	public void save(Shows shows)
	{
		showsDAOImpl.saveShows(shows);
	}
	
	public Shows find(int id) 
	{
		return showsDAOImpl.findShows(id);
	}
	
	public List<Shows> getAll()
	{
		return showsDAOImpl.findAll();
	}
	
	public boolean delete(int id)
	{
		Shows shows=find(id);
		return showsDAOImpl.deleteShows(shows);
	}
	
	public boolean update(Shows shows) 
	{
		return showsDAOImpl.updateShows(shows);
	}
}