package com.zjp.echartsdemo.echartsdemo.service;

import com.zjp.echartsdemo.echartsdemo.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    public List<Product> SelectAll();
}
