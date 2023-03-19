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
import com.worldsoft.ptrentitiesRequest.AcceptReissueQuoteRequest;
import com.worldsoft.ptrentitiesRequest.SearchGetExchangeRequest;
import com.worldsoft.ptrentitiesResponse.AcceptReissueQuoteResponse;
import com.worldsoft.ptrentitiesResponse.SearchGetExchangeResponse;

@Service
public class SearchgetExchangeService {
	@Autowired
	private SessionService sessionService;

	public SearchGetExchangeResponse getdetaails(SearchGetExchangeRequest searchGetExchangeRequest) {
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
			HttpEntity<SearchGetExchangeRequest> entity = new HttpEntity<>(searchGetExchangeRequest, headers);
			URI url = new URI("https://restapidemo.myfarebox.com/api/Search/PostTicketingRequest");
			ResponseEntity<SearchGetExchangeResponse> searchGetExchangeResponse = restTemplate.exchange(url, HttpMethod.POST, entity,
					SearchGetExchangeResponse.class);

			return searchGetExchangeResponse.getBody();
		} catch (Exception e) {
			return null;
		}
	}
	

}
