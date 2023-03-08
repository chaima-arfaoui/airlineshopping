package com.worldsoft.Services;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.worldsoft.entitiesRequest.SessionRequest;
import com.worldsoft.entitiesResponse.SessionResponse;

@Service
public class SessionService {

	/*SessionResponse sessionresponse = new SessionResponse();
	 public SessionResponse addNewSession(SessionRequest sessionRequest) {
	 sessionRequest.setAccountNumber(sessionRequest.getAccountNumber());
	 sessionRequest.setPassword(sessionRequest.getPassword());
	 sessionRequest.setUserName(sessionRequest.getUserName()); 
	 return sessionresponse; }*/
	
	
     public SessionResponse sessionjds(SessionRequest sq) {
    	
       try {
			System.out.println(sq.toString());
			RestTemplate restTemplate = new RestTemplate();

//		SessionResponse sessionResponse = new SessionResponse();

			URI url = new URI("https://restapidemo.myfarebox.com/api/CreateSession");
			SessionResponse sessionResponse = restTemplate.postForObject(url, sq,
					SessionResponse.class);
			System.out.println("!!");
			return sessionResponse;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/*
	 * public static String executePost(String targetURL, String urlParameters) {
	 * HttpURLConnection connection = null;
	 * 
	 * try { //Create connection URL url = new
	 * URL("https://restapidemo.myfarebox.com/index.html//api/CreateSession");
	 * connection = (HttpURLConnection) url.openConnection();
	 * connection.setRequestMethod("POST");
	 * connection.setRequestProperty("Content-Type",
	 * "application/x-www-form-urlencoded");
	 * 
	 * connection.setRequestProperty("Content-Length",
	 * Integer.toString(urlParameters.getBytes().length));
	 * connection.setRequestProperty("Content-Language", "en-US");
	 * 
	 * connection.setUseCaches(false); connection.setDoOutput(true);
	 * 
	 * //Send request DataOutputStream wr = new DataOutputStream (
	 * connection.getOutputStream()); wr.writeBytes(urlParameters); wr.close();
	 * 
	 * //Get Response InputStream is = connection.getInputStream(); BufferedReader
	 * rd = new BufferedReader(new InputStreamReader(is)); StringBuilder response =
	 * new StringBuilder(); // or StringBuffer if Java version 5+ String line; while
	 * ((line = rd.readLine()) != null) { response.append(line);
	 * response.append('\r'); } rd.close(); return response.toString(); } catch
	 * (Exception e) { e.printStackTrace(); return null; } finally { if (connection
	 * != null) { connection.disconnect(); } } }
	 */

}
