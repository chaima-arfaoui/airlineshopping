package com.worldsoft.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.worldsoft.Services.RevalidationService;
import com.worldsoft.entitiesRequest.RevalidationRequest;
import com.worldsoft.entitiesResponse.RevalidationResponse;

@CrossOrigin("*")
@RequestMapping("/api/revalidation")
@RestController

public class RevalidationController {
	@Autowired
	private RevalidationService revalidationservice ;
	@PostMapping("/revalidateflight")
	public RevalidationResponse addrevalidate (@RequestBody RevalidationRequest revalidationRequest) {
		return revalidationservice.addrevalidation(revalidationRequest);
		
	}
	
	
	

}
