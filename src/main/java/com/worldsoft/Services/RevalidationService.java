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

import com.worldsoft.entitiesRequest.RevalidationRequest;
import com.worldsoft.entitiesRequest.SessionRequest;
import com.worldsoft.entitiesResponse.RevalidationResponse;
import com.worldsoft.entitiesResponse.SessionResponse;


@Service
public class RevalidationService {
	@Autowired
	private SessionService sessionService;
	public RevalidationResponse addrevalidation (RevalidationRequest revalidationrequest) {
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
		HttpEntity<RevalidationRequest> entity = new HttpEntity<>(revalidationrequest, headers);
		URI url = new URI("https://restapidemo.myfarebox.com/api/v1/Revalidate/Flight");
		ResponseEntity<RevalidationResponse> revalidationResponse = restTemplate.exchange(url, HttpMethod.POST, entity,
				RevalidationResponse.class);
		return revalidationResponse.getBody() ;

		}catch (Exception e) {
			   return null;
				}
				}
		}
