package com.worldsoft.multicitycontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.worldsoft.multicityRequest.BookRequest;
import com.worldsoft.multicityRequest.TripDetailsRequest;
import com.worldsoft.multicityResponse.BookResponse;
import com.worldsoft.multicityResponse.TripDetailsResponse;
import com.worldsoft.multicityServices.BookService;
import com.worldsoft.multicityServices.TripService;

@CrossOrigin("*")
@RequestMapping("/api/multicity")
@RestController
public class TripController {
	@Autowired
	private TripService tripService;

	@PostMapping("/tripdetails")
	public TripDetailsResponse postdetail(@RequestBody TripDetailsRequest tripDetailsRequest) {
		return tripService.getdetaails(tripDetailsRequest);
	}

}
