package com.example.shop.Service;


import com.example.shop.Entity.Product;
import com.example.shop.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdService {
    @Autowired
    private ProductRepo productrepo;



}
