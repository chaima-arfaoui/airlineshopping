package com.worldsoft.ptrControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.worldsoft.ptrServices.AcceptService;
import com.worldsoft.ptrServices.PostRefundService;
import com.worldsoft.ptrentitiesRequest.AcceptReissueQuoteRequest;
import com.worldsoft.ptrentitiesRequest.PostRefundRequest;
import com.worldsoft.ptrentitiesResponse.AcceptReissueQuoteResponse;
import com.worldsoft.ptrentitiesResponse.PostRefundResponse;

@CrossOrigin("*")
@RequestMapping("/api/ptr")
@RestController
public class PostRefundController {
	@Autowired
	private PostRefundService postRefundService;

	@PostMapping("/postRefund")
	public PostRefundResponse ajoutervdquote(@RequestBody PostRefundRequest postRefundRequest) {
		return postRefundService.postrefund(postRefundRequest);

	}


}
