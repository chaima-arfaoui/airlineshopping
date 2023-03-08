package com.worldsoft.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.worldsoft.Services.SessionService;
import com.worldsoft.entitiesRequest.SessionRequest;
import com.worldsoft.entitiesResponse.SessionResponse;


@CrossOrigin("*")
@RequestMapping("/api/session")
@RestController
public class SessionController {
	@Autowired
    private SessionService sessionservice;
	 @PostMapping("/CreateSession")
	    public SessionResponse addNewSession(@RequestBody SessionRequest sessionRequest){
	       return sessionservice.sessionjds(sessionRequest);
	    }
	
	    
	

}
