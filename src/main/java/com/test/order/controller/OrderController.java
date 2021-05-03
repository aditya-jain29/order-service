package com.test.order.controller;

import com.test.order.entity.Order;
import com.test.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order-service")
public class OrderController {

    @Autowired
    private OrderService service;

    @PostMapping("/save-order")
    public ResponseEntity save(@RequestBody Order order) {
        service.save(order);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Order> fetch(@PathVariable("id") Long id) {
        Order order = service.fetch(id);

        return new ResponseEntity<>(order, HttpStatus.OK);
    }
    @GetMapping("/")
    public ResponseEntity<List<Order>> fetchAll() {
        List<Order> orders = service.fetchAll();
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }
}
