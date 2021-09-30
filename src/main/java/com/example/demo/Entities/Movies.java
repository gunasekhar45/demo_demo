package com.example.demo.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.*;
@Entity
public class Movies {
	
	@Id
	@GeneratedValue
	int movieId;
	@OneToMany
	List<Shows> shows;
	public List<Shows> getShows() {
		return shows;
	}
	public void setShows(List<Shows> shows) {
		this.shows = shows;
	}
	String movieName;
	public int getMovieId() {
		return movieId;
	}
	public Movies(List<Shows> shows, String movieName) {
		super();
		//this.movieId = movieId;
		this.shows = shows;
		this.movieName = movieName;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public Movies(String movieName) {
		super();
		//this.movieId = movieId;
		this.movieName = movieName;
	}
	public Movies() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}