package com.worldsoft.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.worldsoft.Services.CancelbookingService;
import com.worldsoft.Services.SearchptrService;
import com.worldsoft.entitiesRequest.CancelBookingRequest;
import com.worldsoft.entitiesResponse.CancelbookingResponse;
import com.worldsoft.ptrentitiesRequest.Searchptrequest;
import com.worldsoft.ptrentitiesResponse.Searchptresponse;

@CrossOrigin("*")
@RequestMapping("/api/search")
@RestController
public class SearchptrController {
	private SearchptrService searchptrService;

	@PostMapping("/searchptr")
	public Searchptresponse ajouterptr(@RequestBody Searchptrequest searchptrequest) {
		return searchptrService.searchptr(searchptrequest);

	}

}
