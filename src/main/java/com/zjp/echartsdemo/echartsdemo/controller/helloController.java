package com.zjp.echartsdemo.echartsdemo.controller;
 import com.zjp.echartsdemo.echartsdemo.entity.Product;
 import com.zjp.echartsdemo.echartsdemo.service.ProductService;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

 import java.util.List;


@Controller
public class helloController{
    @Autowired
    ProductService productService;

    @RequestMapping("/demo")
    public String myDemo(Model model){
        return "demo";
    }
    @RequestMapping("/echarts")
    public String myECharts(Model model) {
        List<Product> list = productService.SelectAll();
        String skirt = "";
        double nums ;
        if(list.size()>0) {
            skirt = list.get(0).getProductName();
            // String skirt = "袜子";
            nums = list.get(0).getNums();
            model.addAttribute("skirt", skirt);
            model.addAttribute("nums", nums);
        }
        return "echarts";
    }
    @RequestMapping("/")
    public String myView(){
        return "view";
    }

}