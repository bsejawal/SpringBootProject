package com.bsejawal.controllers;

import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.bsejawal.AppTests;
import com.bsejawal.entities.Message;
import com.bsejawal.exception.MessageNotFoundException;
import com.bsejawal.services.MessageService;
import com.bsejawal.utils.TestUtil;

public class MessageControllerTest extends AppTests {

	@Mock
	private MessageService messageService;

	@InjectMocks
	private MessageController messageController;

	MockMvc mockMvc;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
		mockMvc = MockMvcBuilders.standaloneSetup(messageController).build();
	}

	@Test
	public void testList() throws Exception {

		
		List<Message> messages = new ArrayList<>();
		Calendar cal = Calendar.getInstance();
		cal.set(2017, Calendar.MARCH, 31);
		Date date = cal.getTime();
		messages.add(new Message(1, "test message", "bsejawal", date));
		messages.add(new Message(2, "test message1", "bsejawal", date));

		when(messageService.getAllMessages()).thenReturn(messages);

		mockMvc.perform(get("/messages")).andExpect(status().isOk())
				.andExpect(content().contentType(TestUtil.APPLICATION_JSON_UTF8)).andExpect(jsonPath("$", hasSize(2)))
				.andExpect(jsonPath("$[0].id", is(1))).andExpect(jsonPath("$[0].message", is("test message")))
				.andExpect(jsonPath("$[0].author", is("bsejawal")))
				.andExpect(jsonPath("$[0].created", is("2017-03-31"))).andExpect(jsonPath("$[1].id", is(2)))
				.andExpect(jsonPath("$[1].message", is("test message1")))
				.andExpect(jsonPath("$[1].author", is("bsejawal")))
				.andExpect(jsonPath("$[1].created", is("2017-03-31")));

		verify(messageService, times(1)).getAllMessages();
		verifyNoMoreInteractions(messageService);

		// if it is view instead of REST
		/*
		 * mockMvc.perform(get("/messages")) .andExpect(status().isOk())
		 * .andExpect(content().contentType(TestUtil.APPLICATION_JSON_UTF8))
		 * .andExpect(view().name("message/list"))
		 * .andExpect(model().attribute("messages", hasSize(2)));
		 */

	}
	
	
	@Test
	public void getMessageNotFound_ShouldReturnHttpStatusCode404() throws Exception{
		int messageId = 1000000000;
		when(messageService.getMessage(messageId)).thenThrow(new MessageNotFoundException(""));
			
		mockMvc.perform(get("/messages/{messageId}", messageId))
			.andExpect(status().isNotFound());
		
		verify(messageService, times(1)).getMessage(messageId);
		verifyNoMoreInteractions(messageService);
			
			
			
		
	}

}
