package com.healthcall.in.healthcall.ordersapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.healthcall.in.healthcall.ordersapi.entity.BookingOrder;

@Repository
public interface OrderRepository extends JpaRepository<BookingOrder, Integer>{

}
