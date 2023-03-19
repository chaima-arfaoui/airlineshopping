package com.worldsoft.ptrControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.worldsoft.ptrServices.AcceptService;
import com.worldsoft.ptrServices.SearchRefundService;
import com.worldsoft.ptrentitiesRequest.AcceptReissueQuoteRequest;
import com.worldsoft.ptrentitiesRequest.SearchRefundRequest;
import com.worldsoft.ptrentitiesResponse.AcceptReissueQuoteResponse;
import com.worldsoft.ptrentitiesResponse.SearchRefundResponse;

@CrossOrigin("*")
@RequestMapping("/api/ptr")
@RestController
public class SearchRefundController {
	@Autowired
	private SearchRefundService searchRefundService;

	@PostMapping("/searchrefund")
	public SearchRefundResponse ajoutervdquote(@RequestBody SearchRefundRequest searchRefundRequest) {
		return searchRefundService.getdetaails(searchRefundRequest);

	}
	

}
