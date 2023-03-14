package com.worldsoft.multicitycontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.worldsoft.multicityRequest.RevalidationRequest;
import com.worldsoft.multicityResponse.RevalidationResponse;
import com.worldsoft.multicityServices.RevaliService;


@CrossOrigin("*")
@RequestMapping("/api/multicity")
@RestController
public class Revalidationcontroller {
	@Autowired
	private RevaliService revaliService;

	@PostMapping("/revalidation")
	public RevalidationResponse revaflight(@RequestBody RevalidationRequest revalidationRequest) {
		return revaliService.revalide(revalidationRequest);
	}

}
