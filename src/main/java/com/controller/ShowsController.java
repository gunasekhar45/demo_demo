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
@RequestMapping("/shows")
@Api(value = "ShowssController", description = "Description for Showss Controller")
public class ShowsController {

@Autowired
ShowsService showsService;

@GetMapping("/")
@ResponseBody
public String getMessage() {
return "hello world";
}
@GetMapping("/getShows")
@ApiOperation(value = "Get  All Shows ", httpMethod = "GET")

public ResponseEntity<?> getAllShows()
{
	List<Shows> showslist=showsService.getAll();
	return new ResponseEntity(showslist,HttpStatus.OK);
}

@PostMapping("/saveshows")
@ApiOperation(value = "Save shows", httpMethod = "POST")
public ResponseEntity<?> saveShows(Shows shows)
{
showsService.save(shows);
 return ResponseEntity.ok(shows+" saved");
}


@PostMapping("/updateshows")
@ApiOperation(value="Update shows",httpMethod="POST")
public ResponseEntity<?> updateMovies(Shows shows)
{
if(showsService.update(shows))
{
	 return ResponseEntity.ok(shows+"halls updated");
}
else
{
	return new ResponseEntity("not updated ",HttpStatus.BAD_REQUEST);
}

}
}