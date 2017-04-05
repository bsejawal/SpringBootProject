package com.livenation.domains;

public class Ticket {
	
	private String section;
	private int row;
	private int seat;
	private String price;
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Ticket [section=" + section + ", row=" + row + ", seat=" + seat + ", price=" + price + "]";
	}
	
	
	
	

}
