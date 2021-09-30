package com.model;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.Entities.*;



@Component
public interface MoviesDAO {
	
	public Movies findMovies(int userId);
	public boolean deleteMovies(Movies movies);
	public boolean updateMovies(Movies movies);
	public List<Movies> findAll();
	public void saveMovies(Movies movies);
	public Movies QueryMovies(String movieName,int hallId);

}
