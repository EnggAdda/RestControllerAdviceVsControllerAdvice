package com.example.restcontrolleradvicevscontrolleradvice.controller;

import com.example.restcontrolleradvicevscontrolleradvice.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.restcontrolleradvicevscontrolleradvice.service.ProductService;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    List<Product> getAllProducts(){
      return   productService.getProducts();
    }

    @PostMapping("/insert")
    Product insert(@RequestBody Product  product) throws NullPointerException{
        return   productService.insertProduct(product);
    }

}
