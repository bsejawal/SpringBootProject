package com.bsejawal.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bsejawal.dao.IMessage;
import com.bsejawal.databases.DB;
import com.bsejawal.entities.Message;

@Service
public class MessageService {

	Map<Integer, Message> messages = DB.getMessages();

	@Autowired
	IMessage iMessage;

	@PostConstruct
	private void init() {
//		Message m1 = 
		new Message("Hellow Spring Boot!!", "Bhesh");
//		Message m2 = 
		new Message("Hellow World!!", "Rajiv");
//		addMessage(m1);
//		addMessage(m2);
	}

	public Message addMessage(Message message) {
		// message.setId(newId());
		// messages.put(message.getId(), message);
		return iMessage.save(message);

	}

	public Message getMessage(Integer id) {
		// return iMessage.getOne(id);
		// return messages.get(id);
		return iMessage.findOne(id);
	}

	public List<Message> getAllMessages() {
		return iMessage.findAll();
		// return new ArrayList<Message>(messages.values());
	}

	public Message updateMessage(Message message) {
		if (message.getId() < 0)
			return null;
		return iMessage.save(message);
		// messages.put(message.getId(), message);
		// return message;
	}

	public void delete(Integer id) {
		if (id < 0)
			return;
		iMessage.delete(id);
		// return messages.remove(id);
	}
	public void delete(Message message) {
		if (message.getId() < 0)
			return;
		iMessage.delete(message);
		// return messages.remove(id);
	}

	private int newId() {
		if (messages.size() < 1)
			return 1;
		List<Integer> keySet = new ArrayList<>(messages.keySet());
		Collections.sort(keySet);
		return keySet.get(keySet.size() - 1) + 1;
	}

}
