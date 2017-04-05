package com.livenation.client;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.livenation.domains.Order;

@Component
public class OrderClient {
	
	@Autowired
	RestTemplate rt;

	@Value("${livenation.url}")
	private String uri;
	
	public List<Order> getAll(){		
		//RestTemplate restTemplate  = new RestTemplate();
//		Order order = restTemplate.getForObject("https://tm-service.herokuapp.com/orders", Order.class);
//		String url = "https://tm-service.herokuapp.com/orders";
		
//		System.out.println("before rest");
		
		
		ResponseEntity<Order[]> responseEntity = rt.getForEntity(uri+"orders", Order[].class);
		
		Order[] orders = responseEntity.getBody();
		


		
//		List<Order> orders = restTemplate.getForObject("https://tm-service.herokuapp.com/orders", List<Order>.class);
//		List<Order> orders = (List<Order>)list;

//		System.out.println(order);

//		
//		for(Order order: orders){
//			System.out.println(order);
//			
//		}
		
		return Arrays.asList(orders); //orderService.getOrders();
	}
	
	public Order getOrder(int id){
		
		RestTemplate restTemplate  = new RestTemplate();
		Order order = restTemplate.getForObject(uri+"/1", Order.class);
		return order;
	
		
	}
	
	
	
}
