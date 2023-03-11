package com.worldsoft.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.worldsoft.Services.CreateptrService;
import com.worldsoft.ptrentitiesRequest.Createptrequest;
import com.worldsoft.ptrentitiesResponse.Createptresponse;

@CrossOrigin("*")
@RequestMapping("/api/post")
@RestController
public class CreateptrController {
	@Autowired
	private CreateptrService createptrService;
	@PostMapping("/Createptr")
	public Createptresponse ajouterptr (@RequestBody Createptrequest createptrequest) {
		return createptrService.addpt(createptrequest);

	}


}
