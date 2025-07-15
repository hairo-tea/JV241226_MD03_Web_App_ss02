package com.data.service;

import com.data.entity.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements IproductService {
    private static List<Product> products;
    static {
        products = new ArrayList<>();
        products.add(new Product(1, "Gạo lứt", "Gạo lứt rang", 20000.0, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSTRoTGJkL38j93VlmYSPO8Qdod6HpGzd2b6A&s"));
        products.add(new Product(2, "Lạc rang", "Lạc rang", 5000.0, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQrgqG6sqcb8OrIkHMwF2sUboGsaPr4MWpe_Q&s"));
        products.add(new Product(3, "Muối vừng", "Muối vừng rang", 50000.0, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTtAG7tdpGX3zg4QXQmC92PUK_yiy2tNWV-Jg&s"));
    }
    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void add(Product product) {
        products.add(product);
    }

    @Override
    public void delete(int id) {
    products.removeIf(product -> product.getId() == id);
    }
}
