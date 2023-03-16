package com.worldsoft.ptrServices;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.worldsoft.Services.SessionService;
import com.worldsoft.entitiesRequest.SessionRequest;
import com.worldsoft.entitiesResponse.SessionResponse;
import com.worldsoft.ptrentitiesRequest.VoidPostRequest;
import com.worldsoft.ptrentitiesRequest.VoidQuoteRequest;
import com.worldsoft.ptrentitiesResponse.VoidPostResponse;
import com.worldsoft.ptrentitiesResponse.VoidQuoteResponse;

@Service
public class PostvoidService {
	@Autowired
	private SessionService sessionService;

	public VoidPostResponse getdetaails(VoidPostRequest voidPostRequest) {
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
			HttpEntity<VoidPostRequest> entity = new HttpEntity<>(voidPostRequest, headers);
			URI url = new URI("https://restapidemo.myfarebox.com/api/PostTicketingRequest");
			ResponseEntity<VoidPostResponse> voidPostResponse = restTemplate.exchange(url, HttpMethod.POST, entity,
					VoidPostResponse.class);

			return voidPostResponse.getBody();
		} catch (Exception e) {
			return null;
		}
	}


}
