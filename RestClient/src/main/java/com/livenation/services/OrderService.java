package com.livenation.services;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.livenation.domains.Order;

@Service
public class OrderService {
	
	List<Order> orders;
	
	@PostConstruct
	public void init(){
		orders = new ArrayList<>();
		
		
		
	}
	
	public List<Order> getOrders(){
		return orders;
	}
	
	
	

}
