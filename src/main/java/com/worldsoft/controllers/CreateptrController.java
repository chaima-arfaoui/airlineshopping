package com.worldsoft.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.worldsoft.Services.CreateptrService;
import com.worldsoft.ptrentitiesRequest.VoidPostRequest;
import com.worldsoft.ptrentitiesResponse.Createptresponse;

@CrossOrigin("*")
@RequestMapping("/api/ptr")
@RestController
public class CreateptrController {
	@Autowired
	private CreateptrService createptrService;
	@PostMapping("/create")
	public Createptresponse ajouterptr (@RequestBody VoidPostRequest voidPostRequest) {
		return createptrService.addpt(voidPostRequest);

	}


}
