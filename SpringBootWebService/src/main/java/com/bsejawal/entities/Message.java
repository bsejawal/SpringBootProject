package com.bsejawal.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Message {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String message;
	private String author;
	private Date created = new Date();

	public Message() {
	}

	public Message(String message, String author) {
		this.message = message;
		this.author = author;
	}

	public Message(int id, String message, String author) {
		this.id = id;
		this.message = message;
		this.author = author;
	}
	
	

	public Message(int id, String message, String author, Date created) {
		this.id = id;
		this.message = message;
		this.author = author;
		this.created = created;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@JsonFormat(pattern = "yyyy-MM-dd")
	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@Override
	public String toString() {
		return "Message [id=" + id + ", message=" + message + ", author=" + author + ", created=" + created + "]";
	}

}
