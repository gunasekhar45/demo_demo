package com.model;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.Entities.*;



@Component
public interface HallDAO {
	
	public Hall findHall(int userId);
	public boolean deleteHall(Hall hall);
	public boolean updateHall(Hall hall);
	public List<Hall> findAll();
	public void saveHall(Hall hall);

}
