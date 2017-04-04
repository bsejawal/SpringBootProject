package com.bsejawal.databases;



import java.util.HashMap;
import java.util.Map;

import com.bsejawal.entities.Message;

public class DB {
	private static Map<Integer, Message> messages = new HashMap<>();

	public static Map<Integer, Message> getMessages() {
		return messages;
	}
	
	
	

}
