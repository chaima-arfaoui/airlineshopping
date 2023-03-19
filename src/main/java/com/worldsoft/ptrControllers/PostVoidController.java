package com.worldsoft.ptrControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.worldsoft.ptrServices.PostvoidService;
import com.worldsoft.ptrServices.VoidQuoteService;
import com.worldsoft.ptrentitiesRequest.VoidPostRequest;
import com.worldsoft.ptrentitiesRequest.VoidQuoteRequest;
import com.worldsoft.ptrentitiesResponse.VoidPostResponse;
import com.worldsoft.ptrentitiesResponse.VoidQuoteResponse;

@CrossOrigin("*")
@RequestMapping("/api/ptr")
@RestController
public class PostVoidController {
	@Autowired
	private PostvoidService postvoidService;

	@PostMapping("/postvoid")
	public VoidPostResponse ajoutervdquote(@RequestBody VoidPostRequest voidPostRequest) {
		return postvoidService.getdetaails(voidPostRequest);

	}

}
