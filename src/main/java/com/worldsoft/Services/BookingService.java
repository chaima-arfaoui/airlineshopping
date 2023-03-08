package com.worldsoft.Services;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.text.FieldPosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.google.gson.Gson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.worldsoft.entitiesRequest.BookingRequest;
import com.worldsoft.entitiesRequest.SessionRequest;
import com.worldsoft.entitiesResponse.BookingResponse;
import com.worldsoft.entitiesResponse.SessionResponse;

@Service
public class BookingService {
	@Autowired
	private SessionService sessionService;
	public BookingResponse addbookflight (BookingRequest breq) {
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
		                          
				File folderBr = new File(System.getProperty("user.dir") +File.separator + "BR");
			    if (!folderBr.exists()) {
			    folderBr.mkdir(); }
			    		
			    
			    try (FileWriter writer = new FileWriter(System.getProperty("user.dir") + File.separator  + "BR" + File.separator
	                    + format.format(now, stringBuffer, new FieldPosition(0)) + breq.getClass().getName() + ".json")) {
		            gson.toJson(breq, writer);
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
			
			

		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<BookingRequest> entity = new HttpEntity<>(breq, headers);
		URI url = new URI("https://restapidemo.myfarebox.com/api/v1/Book/Flight");
		ResponseEntity<BookingResponse> bookingResponse = restTemplate.exchange(url, HttpMethod.POST, entity,
				BookingResponse.class);
		
		
	File folderBs = new File(System.getProperty("user.dir") +File.separator + "BRS");
    if (!folderBs.exists()) {
    folderBs.mkdir(); }
    
	  try (FileWriter writer = new FileWriter(System.getProperty("user.dir") + File.separator  + "BRS" + File.separator
                + format.format(now, stringBuffer, new FieldPosition(0)) + bookingResponse.getBody().getClass().getName() + ".json")) {
            gson.toJson(bookingResponse.getBody(), writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
	  return bookingResponse.getBody();	
		 }catch (Exception e) {
		   return null;
		 }
}}
