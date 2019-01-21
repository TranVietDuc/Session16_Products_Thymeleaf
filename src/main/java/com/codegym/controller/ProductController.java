package com.codegym.controller;

import com.codegym.service.ProductService;
import com.codegym.service.ProductServiceImpl;
import com.codegym.model.Product;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ProductController {
    private ProductService productService = new ProductServiceImpl();

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("products", productService.findAll());
        return "index";
    }

}