package com.vitoreduardo.course.repositories;

import com.vitoreduardo.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
