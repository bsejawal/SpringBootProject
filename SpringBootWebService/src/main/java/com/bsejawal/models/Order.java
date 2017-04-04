package com.bsejawal.models;


public class Order {
	
	private int id;
	private String confirmationNumber;
	private String orderType;
	private String ipAddress;
	private int deliveryId;
	private int eventId;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getConfirmationNumber() {
		return confirmationNumber;
	}
	public void setConfirmationNumber(String confirmationNumber) {
		this.confirmationNumber = confirmationNumber;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public int getDeliveryId() {
		return deliveryId;
	}
	public void setDeliveryId(int deliveryId) {
		this.deliveryId = deliveryId;
	}
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	
	

}
