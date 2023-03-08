package com.worldsoft.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.worldsoft.Services.BookingService;
import com.worldsoft.entitiesRequest.BookingRequest;
import com.worldsoft.entitiesResponse.BookingResponse;

@CrossOrigin("*")
@RequestMapping("/api/booking")
@RestController

public class BookingController {
	@Autowired
	private BookingService bookingService ;
	@PostMapping("/bookingflight")
	public BookingResponse addbooking (@RequestBody BookingRequest bookingRequest) {
		return bookingService.addbookflight(bookingRequest);
		
	}
	

}
