package com.worldsoft.Services;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.worldsoft.entitiesRequest.FareRulesRequest;

import com.worldsoft.entitiesRequest.SessionRequest;
import com.worldsoft.entitiesResponse.FareRulesResponse;
import com.worldsoft.entitiesResponse.SessionResponse;

@Service
public class FarerulespreService {
	@Autowired
	private SessionService sessionService;
	public FareRulesResponse addprefarerules (FareRulesRequest frules) {
		try {
			String userName = "WSGXML";
			String accountNumber = "MCN000018";
			String password = "Wsg@2023";
			String sessionId = "";
			SessionRequest req = new SessionRequest(userName, accountNumber, password);
			SessionResponse res = sessionService.sessionjds(req);
			sessionId = res.getData().getSessionId();
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			
			headers.set("Authorization", "Bearer " + sessionId);

		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<FareRulesRequest> entity = new HttpEntity<>(frules, headers);
		URI url = new URI("https://restapidemo.myfarebox.com/api/v1/FlightFareRules");
		//FareRulesResponse farerulesResponse = restTemplate.postForObject(url, frules,
				//FareRulesResponse.class);
		ResponseEntity<FareRulesResponse> farerulesResponse = restTemplate.exchange(url, HttpMethod.POST, entity,
				FareRulesResponse.class);
		
		
		return farerulesResponse.getBody();	
	 }catch (Exception e) {
	   return null;
		}
		}
}
