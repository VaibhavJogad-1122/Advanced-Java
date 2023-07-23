package com.app.controller;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.RailwayDto;
import com.app.entities.Category;
import com.app.service.RailwayService;
@Validated
@RestController
@RequestMapping("/railway")
public class RailwayController {

	@Autowired
	RailwayService railwayservice;
	
	@PostMapping("/add")
	public ResponseEntity<?> addRailway(@RequestBody @Valid RailwayDto new_railway){
		RailwayDto valid_railway = railwayservice.addrailway(new_railway);
		return ResponseEntity.status(HttpStatus.CREATED).body(valid_railway);
	}
	
	@PostMapping("/delete")
	public ResponseEntity<?> deleteRailway(@RequestBody Long railway_id){
		RailwayDto deleted_railway = railwayservice.deleteRailway(railway_id);
		return ResponseEntity.status(HttpStatus.OK).body(deleted_railway);
	}
	
	@PostMapping("/show")
	public ResponseEntity<?>  showRailways(@RequestBody @Valid @NotNull Category category){
		return ResponseEntity.status(HttpStatus.OK).body(railwayservice.getAllRailwayByCategory(category));
	}
}
