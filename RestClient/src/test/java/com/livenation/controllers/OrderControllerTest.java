package com.livenation.controllers;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.validation.constraints.AssertTrue;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import com.livenation.domains.Order;

import net.minidev.json.JSONArray;

public class OrderControllerTest {
	private MockMvc mockMvc;
	
	@Test
	public void testGetOneOrder(){
		// setup
		OrderController orderController = new OrderController();
		List array = new ArrayList<>();
		
		array.add("{id:1,confirmation_number:TSX/7-64260,order_type:RESALE,delivery_id:4,event_id:1}");
		array.add("{id:2,confirmation_number:ROF/5-17918,order_type:LEGACY,delivery_id:2,event_id:1}");
		Order expectedOrder = new Order();
		
		
//		expectedOrder = (Order) array[0];
		
		// when
//		when(orderController.orders()).thenReturn(expectedOrder);
//		Order order = orderController.orders();
		
		// then
//		assertEquals(order.getId(),1);
	}
}
