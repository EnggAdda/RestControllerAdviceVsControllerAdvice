package com.example.restcontrolleradvicevscontrolleradvice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {

    private Integer id;
    private String name;
    private Double price;
    private Integer qty;
}
