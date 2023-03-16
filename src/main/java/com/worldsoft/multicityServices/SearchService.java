package com.worldsoft.multicityServices;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.text.FieldPosition;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.worldsoft.Services.SessionService;
import com.worldsoft.entitiesRequest.SessionRequest;
import com.worldsoft.entitiesResponse.SessionResponse;
import com.worldsoft.multicityRequest.SearchRequest;
import com.worldsoft.multicityResponse.SearchResponse;

@Service
public class SearchService {
	@Autowired
	private SessionService sessionService;

	public SearchResponse searchfl(SearchRequest searchRequest) {
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
			
			  StringBuffer stringBuffer = new StringBuffer();
				Date now = new Date();

				SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
				Gson gson = new Gson();
		                          
				File folderfRq = new File(System.getProperty("user.dir") +File.separator + "FRQ");
			    if (!folderfRq.exists()) {
			    folderfRq.mkdir(); }
			    		
			    
			    try (FileWriter writer = new FileWriter(System.getProperty("user.dir") + File.separator  + "FRQ" + File.separator
	                    + format.format(now, stringBuffer, new FieldPosition(0)) + searchRequest.getClass().getName() + ".json")) {
		            gson.toJson(searchRequest, writer);
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
			    
			RestTemplate restTemplate = new RestTemplate();
			HttpEntity<SearchRequest> entity = new HttpEntity<>(searchRequest, headers);
			URI url = new URI("https://restapidemo.myfarebox.com/api/v2/multiCityFaresBETA/Search/Flight");
			ResponseEntity<SearchResponse> searchResponse = restTemplate.exchange(url, HttpMethod.POST, entity,
					SearchResponse.class);
			
			File folderRs = new File(System.getProperty("user.dir") +File.separator + "FRS");
		    if (!folderRs.exists()) {
		    folderRs.mkdir(); }
		    
			  try (FileWriter writer = new FileWriter(System.getProperty("user.dir") + File.separator  + "FRS" + File.separator
	                    + format.format(now, stringBuffer, new FieldPosition(0)) + searchResponse.getBody().getClass().getName() + ".json")) {
		            gson.toJson(searchResponse.getBody(), writer);
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		

			System.out.println("msg1" + " " + searchResponse.getBody());

			return searchResponse.getBody();
		} catch (Exception e) {
			System.out.println("sorry");
			e.printStackTrace();
			return null;
		}
	}
}
