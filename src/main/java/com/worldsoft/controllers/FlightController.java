package com.worldsoft.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.worldsoft.Services.FlightService;
import com.worldsoft.entitiesRequest.FlightRequest;
import com.worldsoft.entitiesResponse.FlightResponse;


@CrossOrigin("*")
@RequestMapping("/api/search")
@RestController


public class FlightController {
	@Autowired
	private FlightService flightService ;
	@PostMapping("/flight")
	 public FlightResponse  searchnewflight(@RequestBody FlightRequest flightRequest ){
	       return flightService.searchflight(flightRequest);
	    }

}
