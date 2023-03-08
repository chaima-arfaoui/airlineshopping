package com.worldsoft.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.worldsoft.Services.RetreiveService;
import com.worldsoft.entitiesRequest.RetrieveRequest;
import com.worldsoft.entitiesResponse.RetreiveResponse;


@CrossOrigin("*")
@RequestMapping("/api/retrieve")
@RestController
public class RetreiveController {
	@Autowired
	private RetreiveService retreiveService;

	@GetMapping("/retrieveMREF/{faresourceCode}")
	public RetreiveResponse trouverMref(@PathVariable String faresourceCode) {
		return retreiveService.trouvemref(faresourceCode);

	}

}
