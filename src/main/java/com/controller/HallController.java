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
@RequestMapping("/hall")
@Api(value = "HallController", description = "Description for Hall Controller")
public class HallController {

@Autowired
HallService hallService;

@GetMapping("/")
@ResponseBody
public String getMessage() {
return "hello world";
}
@GetMapping("/getHall")
@ApiOperation(value = "Get  All Halls ", httpMethod = "GET")

public ResponseEntity<?> getAllHalls()
{
	List<Hall> hallslist=hallService.getAll();
	return new ResponseEntity(hallslist,HttpStatus.OK);
}

@PostMapping("/savehalls")
@ApiOperation(value = "Save halls", httpMethod = "POST")
public ResponseEntity<?> saveHalls(Hall hall)
{
	hallService.save(hall);
 return ResponseEntity.ok(hall+" saved");
}


@PostMapping("/updatehalls")
@ApiOperation(value="Update halls",httpMethod="POST")
public ResponseEntity<?> updateHalls(Hall hall)
{
if(hallService.update(hall))
{
	 return ResponseEntity.ok(hall+"halls updated");
}
else
{
	return new ResponseEntity("not updated ",HttpStatus.BAD_REQUEST);
}

}
}