package com.vitoreduardo.course.repositories;

import com.vitoreduardo.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
