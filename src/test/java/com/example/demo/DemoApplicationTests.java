package com.example.demo;
import java.sql.Date;
import org.apache.catalina.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.model.*;
import com.example.demo.Entities.*;
import static org.assertj.core.api.Assertions.assertThat;
@SpringBootTest
class DemoApplicationTests {
	@Autowired
	UsersDAO usersDAOImpl;
	@Autowired
	ShowsDAO showsDAOImpl;
	@Autowired
	MoviesDAO moviesDAOImpl;

	@Test
	void contextLoads() {
		Users user=new Users(256,"lxmn",'a',967619,"lxmn@gmail.com");
		usersDAOImpl.saveUser(user);
		Users user1=usersDAOImpl.findUser(user.getUserId());
		assertThat("lxmn").isEqualTo(user1.getUserName());
	}
	@Test
	void contextLoads1() {
		Movies movie=new Movies("xyz");
		moviesDAOImpl.saveMovies(movie);
		Movies movie1=moviesDAOImpl.findMovies(movie.getMovieId());
		assertThat("xyz").isEqualTo(movie.getMovieName());
	}
	/*@Test
	void contextLoads2() {
		String d1="2021-09-09";
		String d2="2021-09-12";
		Date date2=Date.valueOf(d2);
		Date date=Date.valueOf(d1);
		Shows s=new Shows(1,12,date,date2);
		showsDAOImpl.saveShows(s);
		Shows s2=showsDAOImpl.findShows(s.getShowId());
		assertThat(date).isEqualTo(s2.getFromDate());
	}*/
	
}
