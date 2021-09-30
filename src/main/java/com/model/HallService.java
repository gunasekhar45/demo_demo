package com.model;
import javax.persistence.Entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Entities.*;

@Component
public class HallService {
	@Autowired
	HallDAO hallDAOImpl;
	
	public void save(Hall hall)
	{
		hallDAOImpl.saveHall(hall);
	}
	
	public Hall find(int id) 
	{
		return hallDAOImpl.findHall(id);
	}
	
	public List<Hall> getAll()
	{
		return hallDAOImpl.findAll();
	}
	
	public boolean delete(int id)
	{
		Hall hall=find(id);
		return hallDAOImpl.deleteHall(hall);
	}
	
	public boolean update(Hall hall) 
	{
		return hallDAOImpl.updateHall(hall);
	}
}