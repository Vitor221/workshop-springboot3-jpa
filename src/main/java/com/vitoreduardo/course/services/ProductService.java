package com.vitoreduardo.course.services;

import com.vitoreduardo.course.entities.Product;
import com.vitoreduardo.course.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findByid(Long id) {
        Optional<Product> Product = repository.findById(id);
        return Product.get();
    }
}
