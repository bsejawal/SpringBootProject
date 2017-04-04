package com.bsejawal.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.bsejawal.AbstractTest;

public class EmployeeControllerTest extends AbstractTest {

	@Autowired
	private WebApplicationContext applicationContext;

	private MockMvc mockMvc;

	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(applicationContext).build();
	}
	
	@Test
	public void testGetEmployee() throws Exception{
		mockMvc.perform(get("/employee"))
		.andExpect(status().isOk())
		.andExpect(content().contentType("application/json;charset=UTF-8"))
		.andExpect(jsonPath("$.name").value("emp1"))
		.andExpect(jsonPath("$.empId").value(1))
		.andExpect(jsonPath("$.designation").value("Java Developer"))
		.andExpect(jsonPath("$.salary").value(800));
		
		
		// for list of Json object
		/*MvcResult result = mockMvc.perform(post("/api/users").header("Authorization", base64ForTestUser).contentType(MediaType.APPLICATION_JSON)
	            .content("{\"userName\":\"testUserDetails\",\"firstName\":\"xxx\",\"lastName\":\"xxx\",\"password\":\"xxx\"}"))
	            .andDo(print())
	            .andExpect(status().isBadRequest())
	            .andReturn();

	String content = result.getResponse().getContentAsString();*/
		
		
		
	}
	
}
