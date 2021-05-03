package com.test.order.service;

import com.test.order.entity.Order;

import java.util.List;

public interface OrderService {

    void save(Order order);
    Order fetch(Long id);
    List<Order> fetchAll();
}
