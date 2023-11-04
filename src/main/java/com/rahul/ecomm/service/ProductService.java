package com.rahul.ecomm.service;

import com.rahul.ecomm.model.Product;
import com.rahul.ecomm.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<Product> getAllProducts(){return productRepository.findAll();}
}
