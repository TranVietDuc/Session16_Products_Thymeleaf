package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private  static  Map<Integer, Product> products;

    static {

        products = new HashMap<>();
        products.put(1, new Product(1, "Iphone6", 5.8, "Apple"));
        products.put(2, new Product(2, "Nokia5", 5.5, "CN"));
        products.put(3, new Product(3, "XioaMi8x", 6.1, "CN"));
        products.put(4,new Product(4, "HuaWei3i", 6.2, "CN"));
        products.put(5, new Product(5, "Active1", 4.5, "VN"));
        products.put(6, new Product(6, "Bphome", 6.8, "VN"));
    }

    @Override
    public List<Product> findAll(){
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product){

        products.put(product.getId(),product);
    }

    @Override
    public Product findById(int id){
        return products.get(id);
    }

    @Override
    public  void update(int id, Product product){
        products.put(id, product);

    }

    @Override
    public void remove(int id){
        products.remove(id);
    }
}