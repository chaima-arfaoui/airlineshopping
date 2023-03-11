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

import com.worldsoft.entitiesRequest.OrderticketRequest;
import com.worldsoft.entitiesRequest.SessionRequest;
import com.worldsoft.entitiesResponse.OrderticketResponse;
import com.worldsoft.entitiesResponse.SessionResponse;

@Service
public class OrderticketService {
	@Autowired
	private SessionService sessionService;
	public OrderticketResponse addticket (OrderticketRequest orderticketRequest) {
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
		HttpEntity<OrderticketRequest> entity = new HttpEntity<>(orderticketRequest, headers);
		URI url = new URI("https://restapidemo.myfarebox.com/api/v1/OrderTicket");
		ResponseEntity<OrderticketResponse> orderticketResponse = restTemplate.exchange(url, HttpMethod.POST, entity,
				OrderticketResponse.class);
		return orderticketResponse.getBody() ;

		}catch (Exception e) {
			   return null;
				}
				}
		}

