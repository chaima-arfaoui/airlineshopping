package com.worldsoft.ptrControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.worldsoft.ptrServices.ReissueQuoteService;
import com.worldsoft.ptrentitiesRequest.ReissueQuoteRequest;
import com.worldsoft.ptrentitiesResponse.ReissueQuoteResponse;

@CrossOrigin("*")
@RequestMapping("/api/ptr")
@RestController
public class ReissueQuoteController {
	@Autowired
	private ReissueQuoteService reissueQuoteService ;
	@PostMapping("/reissuecontroller")
	public ReissueQuoteResponse postreissuequote (@RequestBody ReissueQuoteRequest ReissueQuoteRequest) {
		return reissueQuoteService.getdetaails(ReissueQuoteRequest);
	}

	
}
