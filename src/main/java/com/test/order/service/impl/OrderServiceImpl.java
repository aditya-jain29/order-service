package com.test.order.service.impl;

import com.test.order.entity.Order;
import com.test.order.repository.OrderRepository;
import com.test.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository repo;

    @Override
    public void save(Order order) {
        repo.save(order);
    }

    @Override
    public Order fetch(Long id) {
        return repo.getOne(id);
    }

    @Override
    public List<Order> fetchAll() {
        return repo.findAll();
    }
}
