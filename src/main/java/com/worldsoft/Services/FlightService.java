package com.worldsoft.Services;

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
import com.worldsoft.entitiesRequest.FlightRequest;
import com.worldsoft.entitiesRequest.SessionRequest;
import com.worldsoft.entitiesResponse.FlightResponse;
import com.worldsoft.entitiesResponse.SessionResponse;

@Service
public class FlightService {
	@Autowired
	private SessionService sessionService;

	public FlightResponse  searchflight(FlightRequest fr) {
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
		                          
				File folderRq = new File(System.getProperty("user.dir") +File.separator + "FRQ");
			    if (!folderRq.exists()) {
			    folderRq.mkdir(); }
			    		
			    
			    try (FileWriter writer = new FileWriter(System.getProperty("user.dir") + File.separator  + "FRQ" + File.separator
	                    + format.format(now, stringBuffer, new FieldPosition(0)) + fr.getClass().getName() + ".json")) {
		            gson.toJson(fr, writer);
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		
			RestTemplate restTemplate = new RestTemplate();
			HttpEntity<FlightRequest> entity = new HttpEntity<>(fr, headers);
			URI url = new URI("https://restapidemo.myfarebox.com/api/v1/Search/Flight");
            ResponseEntity<FlightResponse> flightResponse = restTemplate.exchange(url, HttpMethod.POST, entity,
					FlightResponse.class);
	
			
			File folderRs = new File(System.getProperty("user.dir") +File.separator + "FRS");
		    if (!folderRs.exists()) {
		    folderRs.mkdir(); }
		    
			  try (FileWriter writer = new FileWriter(System.getProperty("user.dir") + File.separator  + "FRS" + File.separator
	                    + format.format(now, stringBuffer, new FieldPosition(0)) + flightResponse.getBody().getClass().getName() + ".json")) {
		            gson.toJson(flightResponse.getBody(), writer);
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		
		    
		    
		                        
		         
		
		   return flightResponse.getBody() ;                   
		
		   }catch (Exception e) {
			// TODO: handle exception
		   return null;
		}
		
	}

}


