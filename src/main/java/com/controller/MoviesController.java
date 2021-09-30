package com.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Entities.*;
import com.model.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
@RestController
@RequestMapping("/movies")
@Api(value = "MoviesController", description = "Description for Movies Controller")
public class MoviesController {

@Autowired
MoviesService moviesService;

@GetMapping("/")
@ResponseBody
public String getMessage() {
return "hello world";
}
@GetMapping("/getMovies")
@ApiOperation(value = "Get  All Movies ", httpMethod = "GET")

public ResponseEntity<?> getAllMovies()
{
	List<Movies> movieslist=moviesService.getAll();
	return new ResponseEntity(movieslist,HttpStatus.OK);
}

@PostMapping("/savemovies")
@ApiOperation(value = "Save moviess", httpMethod = "POST")
public ResponseEntity<?> saveMovies(Movies movies)
{
moviesService.save(movies);
 return ResponseEntity.ok(movies+" saved");
}


@PostMapping("/updatemoviess")
@ApiOperation(value="Update movies",httpMethod="POST")
public ResponseEntity<?> updateMovies(Movies movies)
{
if(moviesService.update(movies))
{
	 return ResponseEntity.ok(movies+"halls updated");
}
else
{
	return new ResponseEntity("not updated ",HttpStatus.BAD_REQUEST);
}

}

@PostMapping("/querymovies")
@ApiOperation(value = "Query Movies", httpMethod = "POST")
public ResponseEntity<?> QueryMovies(String movieName,int hallId)
{
	Movies m=moviesService.QueryMovies(movieName,hallId);
 return ResponseEntity.ok(m);
	
}


}