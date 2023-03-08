package com.worldsoft.Services;

import java.net.URI;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.worldsoft.entitiesRequest.FareRulesRequest;
import com.worldsoft.entitiesResponse.FareRulesResponse;

@Service
public class FarerulespostService {
	public FareRulesResponse addpostfarerules (FareRulesRequest frules) {
		try {
		RestTemplate restTemplate = new RestTemplate();
		
		URI url = new URI("https://restapidemo.myfarebox.com/api/v1/FlightFareRules");
		
		
		return null;	
	 }catch (Exception e) {
		// TODO: handle exception
		   return null;
		}
		

	}

}
