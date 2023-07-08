package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Railway;
import com.app.services.RailwayService;



@RestController
@RequestMapping("/railway")
public class RailwayController {
	
	@Autowired
	private RailwayService rws;
	
	public RailwayController() {
		System.out.println("In default constructor of"+getClass());
	}
	
	@GetMapping
	public List<Railway> listRailways(){
		
		return rws.getRailwayDetails();
	}
	
	@PostMapping
	public ResponseEntity<?> saveRailwayDetails(@RequestBody Railway transientRailway){
	
		return new ResponseEntity<>(rws.addRailway(transientRailway),HttpStatus.CREATED);
	}
	
	
	
	

}
