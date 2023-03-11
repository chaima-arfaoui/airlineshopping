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
import com.worldsoft.ptrentitiesRequest.Searchptrequest;
import com.worldsoft.ptrentitiesResponse.Searchptresponse;

@Service
public class SearchptrService {
	@Autowired
	private SessionService sessionService;

	public Searchptresponse searchptr (Searchptrequest searchptrequest) {
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
			URI url = new URI("https://restapidemo.myfarebox.com/api/v1/Booking/Cancel");
			ResponseEntity<Searchptresponse> Searchptresponse = restTemplate.exchange(url, HttpMethod.POST, entity,
					Searchptresponse.class);
			return Searchptresponse.getBody();

		} catch (Exception e) {
			return null;
		}
	}
}
