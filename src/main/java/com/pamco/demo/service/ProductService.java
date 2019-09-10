package com.pamco.demo.service;

import com.pamco.demo.model.ProductModel;
import com.pamco.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<ProductModel> findProducts() {
        return productRepository.findAll();
    }

}
