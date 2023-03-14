package com.worldsoft.multicityServices;

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
import com.worldsoft.multicityRequest.BookRequest;
import com.worldsoft.multicityResponse.BookResponse;

@Service
public class BookService {
	@Autowired
	private SessionService sessionService;

	public BookResponse bookaflight(BookRequest bookRequest) {
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
			HttpEntity<BookRequest> entity = new HttpEntity<>(bookRequest, headers);
			URI url = new URI("https://restapidemo.myfarebox.com/api/v1/multiCityFaresBETA/Book/Flight");
			ResponseEntity<BookResponse> bookResponse = restTemplate.exchange(url, HttpMethod.POST, entity,
					BookResponse.class);

			return bookResponse.getBody();
		} catch (Exception e) {
			return null;
		}
	}

}
