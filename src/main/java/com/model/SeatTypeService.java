package com.model;
import javax.persistence.Entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Entities.*;

@Component
public class SeatTypeService {
	@Autowired
	SeatTypeDAO seatTypeDAOImpl;
	
	public void save(SeatType seattype)
	{
		seatTypeDAOImpl.saveSeatType(seattype);
	}
	
	public SeatType find(int id) 
	{
		return seatTypeDAOImpl.findSeatType(id);
	}
	
	public List<SeatType> getAll()
	{
		return seatTypeDAOImpl.findAll();
	}
	
	public boolean delete(int id)
	{
		SeatType seattype=find(id);
		return seatTypeDAOImpl.deleteSeatType(seattype);
	}
	
	public boolean update(SeatType seattype) 
	{
		return seatTypeDAOImpl.updateSeatType(seattype);
	}
}