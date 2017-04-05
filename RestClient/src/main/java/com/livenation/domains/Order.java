package com.livenation.domains;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Order {
	
	@JsonProperty("id")
	private int id;
	
	@JsonProperty("confirmation_number")
	private String confirmationNumber;
	
	@JsonProperty("order_type")
	private String orderType;
	
	@JsonProperty("delivery_id")
	private int deliveryId;
	
	
	@JsonProperty("event_id")
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





	@Override
	public String toString() {
		return "Order [id=" + id + ", confirmationNumber=" + confirmationNumber + ", orderType=" + orderType
				+ ", deliveryId=" + deliveryId + "]";
	}
	
	
	
	

}
