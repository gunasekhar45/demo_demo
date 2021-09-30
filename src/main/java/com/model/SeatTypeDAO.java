package com.model;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.Entities.*;



@Component
public interface SeatTypeDAO {
	
	public SeatType findSeatType(int userId);
	public boolean deleteSeatType(SeatType seattype);
	public boolean updateSeatType(SeatType seattype);
	public List<SeatType> findAll();
	public void saveSeatType(SeatType seattype);

}
