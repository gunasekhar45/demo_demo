package com.model;
import javax.persistence.Entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Entities.*;

@Component
public class MoviesService {
	@Autowired
	MoviesDAO moviesDAOImpl;
	
	public void save(Movies movies)
	{
		moviesDAOImpl.saveMovies(movies);
	}
	
	public Movies find(int id) 
	{
		return moviesDAOImpl.findMovies(id);
	}
	
	public List<Movies> getAll()
	{
		return moviesDAOImpl.findAll();
	}
	
	public boolean delete(int id)
	{
Movies movies=find(id);
		return moviesDAOImpl.deleteMovies(movies);
	}
	
	public boolean update(Movies movies) 
	{
		return moviesDAOImpl.updateMovies(movies);
	}

	public Movies QueryMovies(String movieName, int hallId) {
		// TODO Auto-generated method stub
		return moviesDAOImpl.QueryMovies(movieName, hallId);
	}
}