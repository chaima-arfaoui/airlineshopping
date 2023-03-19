package com.worldsoft.ptrControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.worldsoft.ptrServices.VoidQuoteService;
import com.worldsoft.ptrentitiesRequest.VoidQuoteRequest;
import com.worldsoft.ptrentitiesResponse.VoidQuoteResponse;

@CrossOrigin("*")
@RequestMapping("/api/ptr")
@RestController
public class VoidQuoteController {
	@Autowired
	private VoidQuoteService voidQuoteService;

	@PostMapping("/voidquote")
	public VoidQuoteResponse ajoutervdquote(@RequestBody VoidQuoteRequest voidQuoteRequest) {
		return voidQuoteService.getvoidquote(voidQuoteRequest);

	}
}
