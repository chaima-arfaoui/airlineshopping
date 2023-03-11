package com.worldsoft.Services;

import java.net.URI;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.worldsoft.entitiesRequest.SessionRequest;
import com.worldsoft.entitiesResponse.SessionResponse;
import com.worldsoft.ptrentitiesRequest.VoidQuoteRequest;
import com.worldsoft.ptrentitiesResponse.VoidQuoteResponse;

@Service
public class VoidquoteService {
	private SessionService sessionService;
	public VoidQuoteResponse getvoidquote (VoidQuoteRequest voidQuoteRequest) {
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
		HttpEntity<VoidQuoteRequest> entity = new HttpEntity<>(voidQuoteRequest, headers);
		URI url = new URI("https://restapidemo.myfarebox.com/api/v1/Booking/Cancel");
		ResponseEntity<VoidQuoteResponse> voidQuoteResponse = restTemplate.exchange(url, HttpMethod.POST, entity,
				VoidQuoteResponse.class);
		return voidQuoteResponse.getBody() ;

		}catch (Exception e) {
			   return null;
				}
				}
		}



