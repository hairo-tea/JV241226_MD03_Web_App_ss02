package com.data.service;

import com.data.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IproductService {
    List<Product> findAll();
    void add(Product product);
    void delete(int id);

}
