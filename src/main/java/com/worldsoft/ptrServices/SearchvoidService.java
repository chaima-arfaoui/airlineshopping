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
import com.worldsoft.ptrentitiesRequest.Searchptrequest;
import com.worldsoft.ptrentitiesRequest.VoidPostRequest;
import com.worldsoft.ptrentitiesResponse.Searchptresponse;
import com.worldsoft.ptrentitiesResponse.VoidPostResponse;
@Service
public class SearchvoidService {
	@Autowired
	private SessionService sessionService;

	public Searchptresponse getdetaails(Searchptrequest searchptrequest) {
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
			HttpEntity<Searchptrequest> entity = new HttpEntity<>(searchptrequest, headers);
			URI url = new URI("https://restapidemo.myfarebox.com/api/Search/PostTicketingRequest");
			ResponseEntity<Searchptresponse> searchptresponse = restTemplate.exchange(url, HttpMethod.POST, entity,
					Searchptresponse.class);

			return searchptresponse.getBody();
		} catch (Exception e) {
			return null;
		}
	}

}
