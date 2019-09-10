package com.pamco.demo.controller;

import com.pamco.demo.model.ProductModel;
import com.pamco.demo.repository.ProductRepository;
import com.pamco.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ProductController {

   @Autowired
    private ProductService productService;

    @GetMapping("/products")
    @ResponseBody
    public List<ProductModel> homePage(Model model) {
        return productService.findProducts();
    }
}
