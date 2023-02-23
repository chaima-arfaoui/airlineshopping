package com.worldsoft.Services;

import java.io.File;
import java.net.URI;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.worldsoft.entities.response.FlightResponse;
import com.worldsoft.entities.response.SessionResponse;
import com.worldsoft.entitiesRequest.FlightRequest;
import com.worldsoft.entitiesRequest.SessionRequest;

@Service
public class FlightService {
	@Autowired
	private SessionService sessionService;

	public FlightResponse searchflight(FlightRequest fr) {
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
		try {
			RestTemplate restTemplate = new RestTemplate();
			HttpEntity<FlightRequest> entity = new HttpEntity<>(fr, headers);
			URI url = new URI("https://restapidemo.myfarebox.com/api/v1/Search/Flight");

			ResponseEntity<FlightResponse> flightResponse = restTemplate.exchange(url, HttpMethod.POST, entity,
					FlightResponse.class);

//			FlightResponse flightResponse = restTemplate.postForObject(url,fr,FlightResponse.class);
			System.out.println("!!");
			return flightResponse.getBody();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
        public void CreateFile(FlightRequest fr) {
        File d = new File("user.dir"); 
		File f = new File("file1.txt");
		System.out.println("File created: " + f.getName());
		if (f.mkdir() == true) { 
			System.out.println("Directory has been created successfully"); 
		} 
		else { 
			System.out.println("Directory cannot be created"); 
		 }
		System.out.println(FlightRequest.class.getName());
}
}

