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
@RequestMapping("/hallcapacity")
@Api(value = "HallCapacityController", description = "Description for HallCapacity Controller")
public class HallCapacityController {

@Autowired
HallCapacityService hallCapacityService;

@GetMapping("/")
@ResponseBody
public String getMessage() {
return "hello world";
}
@GetMapping("/getHallCapacity")
@ApiOperation(value = "Get  All HallCapacitys ", httpMethod = "GET")

public ResponseEntity<?> getAllHallCapacitys()
{
	List<HallCapacity> hallcapacityslist=hallCapacityService.getAll();
	return new ResponseEntity(hallcapacityslist,HttpStatus.OK);
}

@PostMapping("/savehallcapacitys")
@ApiOperation(value = "Save hallcapacitys", httpMethod = "POST")
public ResponseEntity<?> saveHallCapacitys(HallCapacity hallCapacity)
{
	hallCapacityService.save(hallCapacity);
 return ResponseEntity.ok(hallCapacity+" saved");
}


@PostMapping("/updatehallcapacitys")
@ApiOperation(value="Update hallcapacitys",httpMethod="POST")
public ResponseEntity<?> updateHallCapacitys(HallCapacity hallcapacity)
{
if(hallCapacityService.update(hallcapacity))
{
	 return ResponseEntity.ok(hallcapacity+"booking updated");
}
else
{
	return new ResponseEntity("not updated ",HttpStatus.BAD_REQUEST);
}

}
}