package com.onlineshopping.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(nullable = false)
    private String name;
    
    private String description;
    
    @Column(nullable = false)
    private double price;
    
    private int stock;
    private String image;
    
    @ManyToMany(mappedBy = "products")
    private List<Category> categories;
    
    // Getters and setters
    // Constructors
}