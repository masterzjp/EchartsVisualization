package com.zjp.echartsdemo.echartsdemo.controller;

import com.zjp.echartsdemo.echartsdemo.dao.ProductMapper;
import com.zjp.echartsdemo.echartsdemo.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController2 {
    @Autowired
    ProductMapper productMapper;
    @RequestMapping("/project")
    @ResponseBody
    public List<Product> myProject() {

        List<Product> productArrayList = new ArrayList<Product>();
        //Product product = new Product();
        //product.setNums(18);
        //product.setProductName("皮裤");
        productArrayList = productMapper.SelectAll();
        //productArrayList.add(product);
        return productArrayList;
    }
}
