package com.worldsoft.multicitycontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.worldsoft.multicityRequest.SearchRequest;
import com.worldsoft.multicityResponse.SearchResponse;
import com.worldsoft.multicityServices.SearchService;

@CrossOrigin("*")
@RequestMapping("/api/multicity")
@RestController
public class SearchController {
	@Autowired
	private SearchService  searchService;
	@PostMapping("/flight")
	 public SearchResponse  searchflight(@RequestBody SearchRequest searchRequest ){
	       return searchService.searchfl(searchRequest);
	    }
	

}
