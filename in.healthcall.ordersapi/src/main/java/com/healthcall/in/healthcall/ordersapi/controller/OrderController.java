package com.healthcall.in.healthcall.ordersapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthcall.in.healthcall.ordersapi.entity.BookingOrder;
import com.healthcall.in.healthcall.ordersapi.service.OrderService;

@RestController
@RequestMapping("/order/")
public class OrderController {
	@Autowired
	private OrderService orderService;
	@GetMapping("get")
	public List<BookingOrder> getall(){
		return orderService.list();
	}
	@PostMapping("post")
	public BookingOrder insert(@RequestBody BookingOrder bookingOrder) {
		return orderService.insert(bookingOrder);
	}

}
