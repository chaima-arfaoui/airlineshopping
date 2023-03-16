package com.worldsoft.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.worldsoft.Services.CreateptrService;
import com.worldsoft.Services.MarkasreadService;
import com.worldsoft.ptrentitiesRequest.Createptrequest;
import com.worldsoft.ptrentitiesRequest.MarkasreadRequest;
import com.worldsoft.ptrentitiesResponse.Createptresponse;
import com.worldsoft.ptrentitiesResponse.MarkasreadResponse;

@CrossOrigin("*")
@RequestMapping("/api/ptr")
@RestController
public class MarkasreadController {
	
		@Autowired
		private MarkasreadService markasreadService;
		@PostMapping("/markasread")
		public MarkasreadResponse ajouterptr (@RequestBody MarkasreadRequest markasreadRequest) {
			return markasreadService.addmark(markasreadRequest);

		}


}
