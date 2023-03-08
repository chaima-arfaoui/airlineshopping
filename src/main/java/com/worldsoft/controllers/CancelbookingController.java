package com.worldsoft.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.worldsoft.Services.CancelbookingService;
import com.worldsoft.entitiesRequest.CancelBookingRequest;
import com.worldsoft.entitiesResponse.CancelbookingResponse;

@CrossOrigin("*")
@RequestMapping("/api/cancel")
@RestController

public class CancelbookingController {
	@Autowired
	private CancelbookingService cancelbookingService;

	@PostMapping("/Cancelbooking")
	public CancelbookingResponse ajouterfarerules(@RequestBody CancelBookingRequest cancelBookingRequest) {
		return cancelbookingService.addcancel(cancelBookingRequest);

	}

}
