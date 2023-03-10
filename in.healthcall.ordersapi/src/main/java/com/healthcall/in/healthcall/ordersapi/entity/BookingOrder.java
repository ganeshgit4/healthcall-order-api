package com.healthcall.in.healthcall.ordersapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="test_booking")
public class BookingOrder {
	@Id
	@Column(name="book_id")
	private int book_id;
	@Column(name="book_user_id")
	private  int book_user_id;
	@Column(name="book_price")
	private int book_price;
	@Column(name="book_hospital_code")
	private String book_hospital_code;
	@Column(name="book_address")
	private String book_address;
	@Column(name="book_city")
	private String book_city;
	@Column(name="book_payment_id")
	private String book_payment_id;
	@Column(name="book_test_id")
	private int book_test_id;
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public int getBook_user_id() {
		return book_user_id;
	}
	public void setBook_user_id(int book_user_id) {
		this.book_user_id = book_user_id;
	}
	public int getBook_price() {
		return book_price;
	}
	public void setBook_price(int book_price) {
		this.book_price = book_price;
	}
	public String getBook_hospital_code() {
		return book_hospital_code;
	}
	public void setBook_hospital_code(String book_hospital_code) {
		this.book_hospital_code = book_hospital_code;
	}
	public String getBook_address() {
		return book_address;
	}
	public void setBook_address(String book_address) {
		this.book_address = book_address;
	}
	public String getBook_city() {
		return book_city;
	}
	public void setBook_city(String book_city) {
		this.book_city = book_city;
	}
	public String getBook_payment_id() {
		return book_payment_id;
	}
	public void setBook_payment_id(String book_payment_id) {
		this.book_payment_id = book_payment_id;
	}
	public int getBook_test_id() {
		return book_test_id;
	}
	public void setBook_test_id(int book_test_id) {
		this.book_test_id = book_test_id;
	}
	public BookingOrder(int book_id, int book_user_id, int book_price, String book_hospital_code, String book_address,
			String book_city, String book_payment_id, int book_test_id) {
		super();
		this.book_id = book_id;
		this.book_user_id = book_user_id;
		this.book_price = book_price;
		this.book_hospital_code = book_hospital_code;
		this.book_address = book_address;
		this.book_city = book_city;
		this.book_payment_id = book_payment_id;
		this.book_test_id = book_test_id;
	}
	public BookingOrder() {
		super();
		
	}
	

}
