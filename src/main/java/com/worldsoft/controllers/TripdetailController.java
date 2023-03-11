package com.worldsoft.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.worldsoft.Services.TripdetailService;
import com.worldsoft.entitiesRequest.BookingRequest;
import com.worldsoft.entitiesRequest.TripdetailRequest;
import com.worldsoft.entitiesResponse.BookingResponse;
import com.worldsoft.entitiesResponse.TripDetailsResponse;

@CrossOrigin("*")
@RequestMapping("/api/details")
@RestController

public class TripdetailController {
	@Autowired
	private TripdetailService tripdetailService ;
	@GetMapping("/tripdetail/{mfref}")
	public TripDetailsResponse getmfref (@PathVariable String mfref) {
		return tripdetailService.gettripdetail(mfref);
		
	}
	
}


