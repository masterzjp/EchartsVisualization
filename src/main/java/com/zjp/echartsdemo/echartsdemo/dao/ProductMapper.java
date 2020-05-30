package com.zjp.echartsdemo.echartsdemo.dao;

import com.zjp.echartsdemo.echartsdemo.entity.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ProductMapper {
   public List<Product> SelectAll();
}
