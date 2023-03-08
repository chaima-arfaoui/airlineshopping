package com.worldsoft.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.worldsoft.Services.FarerulespreService;
import com.worldsoft.entitiesRequest.FareRulesRequest;
import com.worldsoft.entitiesResponse.FareRulesResponse;

@CrossOrigin("*")
@RequestMapping("/api/farerules")
@RestController

public class FarerulesController {
	@Autowired
	private FarerulespreService farerulespretservice ;
	 @PostMapping("/CreateFarerules")
	public FareRulesResponse ajouterfarerules (@RequestBody FareRulesRequest farerulesrequest) {
		return farerulespretservice.addprefarerules(farerulesrequest);
		
	}

}
