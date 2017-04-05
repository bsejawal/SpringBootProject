package com.livenation.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.livenation.client.OrderClient;
import com.livenation.domains.Order;

@Controller
@RequestMapping(value = "/orders")
public class OrderController {

	@Autowired
	OrderClient orderClient;
	// OrderService orderService;
	//

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<Order> orders() {

		// RestTemplate restTemplate = new RestTemplate();
		// Order order =
		// restTemplate.getForObject("https://tm-service.herokuapp.com/orders",
		// Order.class);
		// String url = "https://tm-service.herokuapp.com/orders";

		System.out.println("before rest");

		// ResponseEntity<Order[]> responseEntity =
		// restTemplate.getForEntity(url, Order[].class);
		// System.out.println("after rest");
		// Order[] orders = responseEntity.getBody();

		// List<Order> orders =
		// restTemplate.getForObject("https://tm-service.herokuapp.com/orders",
		// List<Order>.class);
		// List<Order> orders = (List<Order>)list;

		// System.out.println(order);

		//
		// for(Order order: orders){
		// System.out.println(order);
		//
		// }

		// return Arrays.asList(orders); //orderService.getOrders();

		return orderClient.getAll();

	}
	
	public Order getOrder(int id){
		
		return new Order();
		
	}
	
}
