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

import com.worldsoft.entitiesRequest.SessionRequest;
import com.worldsoft.entitiesResponse.SessionResponse;
import com.worldsoft.ptrentitiesRequest.Createptrequest;
import com.worldsoft.ptrentitiesRequest.MarkasheadRequest;
import com.worldsoft.ptrentitiesResponse.Createptresponse;
import com.worldsoft.ptrentitiesResponse.MarkasheadResponse;

@Service
public class MarkasheadService {
	@Autowired
	private SessionService sessionService;
	public MarkasheadResponse addpt (MarkasheadRequest  markasheadRequest) {
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
		HttpEntity<MarkasheadRequest> entity = new HttpEntity<>(markasheadRequest, headers);
		URI url = new URI("https://restapidemo.myfarebox.com/api/PostTicketingRequest");
		ResponseEntity<MarkasheadResponse> markasheadResponse = restTemplate.exchange(url, HttpMethod.POST, entity,
				MarkasheadResponse.class);
		return markasheadResponse.getBody() ;

		}catch (Exception e) {
			   return null;
				}
				}
		}



