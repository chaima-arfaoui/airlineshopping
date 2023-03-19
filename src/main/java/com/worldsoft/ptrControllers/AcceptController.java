package com.worldsoft.ptrControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.worldsoft.ptrServices.AcceptService;
import com.worldsoft.ptrServices.VoidQuoteService;
import com.worldsoft.ptrentitiesRequest.AcceptReissueQuoteRequest;
import com.worldsoft.ptrentitiesRequest.VoidQuoteRequest;
import com.worldsoft.ptrentitiesResponse.AcceptReissueQuoteResponse;
import com.worldsoft.ptrentitiesResponse.VoidQuoteResponse;

@CrossOrigin("*")
@RequestMapping("/api/ptr")
@RestController
public class AcceptController {
	@Autowired
	private AcceptService acceptService;

	@PostMapping("/AcceptReissueQuote")
	public AcceptReissueQuoteResponse ajoutervdquote(@RequestBody AcceptReissueQuoteRequest AcceptReissueQuoteRequest) {
		return acceptService.getdetaails(AcceptReissueQuoteRequest);

	}

}
