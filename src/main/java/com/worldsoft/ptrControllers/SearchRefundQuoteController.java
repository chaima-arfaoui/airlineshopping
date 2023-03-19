package com.worldsoft.ptrControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.worldsoft.ptrServices.SearchRefundQuoteService;
import com.worldsoft.ptrServices.SearchRefundService;
import com.worldsoft.ptrentitiesRequest.SearchRefundQuoteRequest;
import com.worldsoft.ptrentitiesRequest.SearchRefundRequest;
import com.worldsoft.ptrentitiesResponse.SearchRefundQuoteResponse;
import com.worldsoft.ptrentitiesResponse.SearchRefundResponse;

@CrossOrigin("*")
@RequestMapping("/api/ptr")
@RestController
public class SearchRefundQuoteController {
	@Autowired
	private SearchRefundQuoteService searchRefundQuoteService;

	@PostMapping("/searchref")
	public SearchRefundQuoteResponse ajoutquote(@RequestBody SearchRefundQuoteRequest searchRefundQuoteRequest) {
		return searchRefundQuoteService.chercherquote(searchRefundQuoteRequest);

	}
	

}
