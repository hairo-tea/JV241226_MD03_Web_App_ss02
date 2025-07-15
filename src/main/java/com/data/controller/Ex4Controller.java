package com.data.controller;

import com.data.entity.Product;
import com.data.service.IproductService;
import com.data.service.ProductServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;


@Controller
public class Ex4Controller {
    //khai báo để sử dụng phương thức
    private static final IproductService productService = new ProductServiceImpl();

    @GetMapping("/ex4")
    public String showProduct(Model model) {
        List<Product> products = productService.findAll();
        //thêm danh sách sản phẩm vào
        model.addAttribute("products", products);
        return "ex4";   //gửi ra trang jsp
    }

    //Hiển thị form thêm sp
    @GetMapping("ex4/add")
    public String ShowAddProductForm() {
        return "addProduct";
    }

    //xử lý khi thêm sp
    @PostMapping("ex4/add")
    public String AddProduct(
            @RequestParam String name,
            @RequestParam String description,
            @RequestParam double price,
            @RequestParam String image
    ) {
        List<Product> products = productService.findAll();
        int newId = products.size() + 1;
        Product product = new Product(newId, name, description, price, image);
        productService.add(product);
        return "redirect:/ex4";
    }

    //Xóa sản phẩm
    @GetMapping("/ex4/delete/{id}")
    public String deleteProduct(@PathVariable Integer id) {
        try {
            productService.delete(id);
        } catch (Exception e) {
            System.out.println("Xóa thất bại: " + e.getMessage());
        }
        return "redirect:/ex4";
    }

}
