package com.bsejawal.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
//org.hibernate.dialect.SQLServer2012Dialect

import com.bsejawal.entities.Message;
import com.bsejawal.services.MessageService;
import com.bsejawal.exception.MessageNotFoundException;

@RestController
@RequestMapping(value = "/messages")
public class MessageController {

	@Autowired
	MessageService messageService;
	

	@RequestMapping(value = "/{messageId}", method = RequestMethod.GET)
	public Message getMessage(@PathVariable("messageId") int id) throws MessageNotFoundException {
		return messageService.getMessage(id);
	}


	@RequestMapping(method = RequestMethod.GET)
	public List<Message> getAllMessages() {
		return messageService.getAllMessages();
	}

	@RequestMapping(value = "/{messageId}", method = RequestMethod.PUT)
	public Message updateMessage(@RequestBody Message message, @PathVariable("messageId") int id) {
		message.setId(id);
		return messageService.updateMessage(message);
	}

	@RequestMapping(method = RequestMethod.POST)
	public Message addMessage(@RequestBody Message message) {
		messageService.addMessage(message);
		return message;
	}

	@RequestMapping(value = "/{messageId}", method = RequestMethod.DELETE)
	public Message deleteMessage(@PathVariable("messageId") int id) {
		Message message = messageService.getMessage(id);
		messageService.delete(id);
		return message;
	}
	
}
