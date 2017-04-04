package com.bsejawal.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;


import com.bsejawal.exception.MessageNotFoundException;


@ControllerAdvice
public class RestErrorHandler {

	private static final Logger LOGGER = LoggerFactory.getLogger(RestErrorHandler.class);
	
	
	@ExceptionHandler(MessageNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public void handleMessageNotFoundException(MessageNotFoundException ex){
		LOGGER.debug("handling 404 error on a Message entry");
	}
	

}
