package com.worldsoft.ptrControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.worldsoft.ptrServices.AcceptService;
import com.worldsoft.ptrServices.PostRefundQuoteService;
import com.worldsoft.ptrentitiesRequest.AcceptReissueQuoteRequest;
import com.worldsoft.ptrentitiesRequest.PostRefundQuoteRequest;
import com.worldsoft.ptrentitiesResponse.AcceptReissueQuoteResponse;
import com.worldsoft.ptrentitiesResponse.PostRefundQuoteResponse;

@CrossOrigin("*")
@RequestMapping("/api/ptr")
@RestController
public class PostRefundQuoteController {
	@Autowired
	private PostRefundQuoteService postRefundQuoteService;

	@PostMapping("/refundQuote")
	public PostRefundQuoteResponse ajoutervdquote(@RequestBody PostRefundQuoteRequest postRefundQuoteRequest) {
		return postRefundQuoteService.getdetaails(postRefundQuoteRequest);

	}

}
