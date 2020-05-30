package com.zjp.echartsdemo.echartsdemo.service.impl;

import com.zjp.echartsdemo.echartsdemo.dao.ProductMapper;
import com.zjp.echartsdemo.echartsdemo.entity.Product;
import com.zjp.echartsdemo.echartsdemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductMapper productMapper;
    @Override
    public List<Product> SelectAll() {
        List<Product> list = productMapper.SelectAll();
        return list;
    }
}
