package com.worldsoft.ptrControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.worldsoft.ptrServices.AcceptService;
import com.worldsoft.ptrServices.SearchgetExchangeService;
import com.worldsoft.ptrentitiesRequest.AcceptReissueQuoteRequest;
import com.worldsoft.ptrentitiesRequest.SearchGetExchangeRequest;
import com.worldsoft.ptrentitiesResponse.AcceptReissueQuoteResponse;
import com.worldsoft.ptrentitiesResponse.SearchGetExchangeResponse;

@CrossOrigin("*")
@RequestMapping("/api/ptr")
@RestController
public class SearchGetExchangeController {
	@Autowired
	private SearchgetExchangeService searchgetExchangeService;

	@PostMapping("/searchgetExchange")
	public SearchGetExchangeResponse searchexchange(@RequestBody SearchGetExchangeRequest searchGetExchangeRequest) {
		return searchgetExchangeService.getdetaails(searchGetExchangeRequest);

	}

}
