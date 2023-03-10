package com.healthcall.in.healthcall.ordersapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.healthcall.in.healthcall.ordersapi.entity.BookingOrder;
import com.healthcall.in.healthcall.ordersapi.repository.OrderRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository orderRepository;
	
	public List<BookingOrder> list(){
		return orderRepository.findAll();
	}
  public BookingOrder insert(@RequestBody BookingOrder bookingOrder) {
	  return orderRepository.save(bookingOrder);
  }
}
