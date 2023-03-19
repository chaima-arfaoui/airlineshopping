package com.worldsoft.ptrControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.worldsoft.ptrServices.GetExchangeQuoteService;
import com.worldsoft.ptrServices.VoidQuoteService;
import com.worldsoft.ptrentitiesRequest.GetExchangeQuoteRequest;
import com.worldsoft.ptrentitiesRequest.VoidQuoteRequest;
import com.worldsoft.ptrentitiesResponse.GetExchangeQuoteResponse;
import com.worldsoft.ptrentitiesResponse.VoidQuoteResponse;

@CrossOrigin("*")
@RequestMapping("/api/ptr")
@RestController
public class GetExchangeQuoteController {
	@Autowired
	private GetExchangeQuoteService getExchangeQuoteService;

	@PostMapping("/getexchange")
	public GetExchangeQuoteResponse ajoutervdquote(@RequestBody GetExchangeQuoteRequest getExchangeQuoteRequest) {
		return getExchangeQuoteService.getdetaails(getExchangeQuoteRequest);

	}

	

}
