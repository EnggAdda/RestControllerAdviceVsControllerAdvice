package com.example.restcontrolleradvicevscontrolleradvice.service;

import com.example.restcontrolleradvicevscontrolleradvice.entity.Product;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    public static final List<Product> products = new ArrayList<Product>();

    @PostConstruct
    private void init(){
        Product product =  new Product(1,"Mobile",20000.0,1);
      this.products.add(product);
    }

    public List<Product>  getProducts(){
       return this.products;
    }

    public Product  insertProduct(Product product) throws NullPointerException{
        if(product.getName()  == null)
        {
            throw new NullPointerException("Product name cannot be null");
        }
        this.products.add(product);
        return product;
    }
}
