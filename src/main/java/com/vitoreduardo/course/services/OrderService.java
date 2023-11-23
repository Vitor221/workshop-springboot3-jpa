package com.vitoreduardo.course.services;

import com.vitoreduardo.course.entities.Order;
import com.vitoreduardo.course.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findByid(Long id) {
        Optional<Order> Order = repository.findById(id);
        return Order.get();
    }
}
