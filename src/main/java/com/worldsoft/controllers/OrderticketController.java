package com.worldsoft.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.worldsoft.Services.OrderticketService;
import com.worldsoft.entitiesRequest.OrderticketRequest;
import com.worldsoft.entitiesResponse.OrderticketResponse;

@CrossOrigin("*")
@RequestMapping("/api/Orderticket")
@RestController
public class OrderticketController {
	@Autowired
	private OrderticketService orderticketService ;
	@PostMapping("/orderticketflight")
	public OrderticketResponse addtickets (@RequestBody OrderticketRequest orderticketRequest) {
		return orderticketService.addticket(orderticketRequest);

}
}