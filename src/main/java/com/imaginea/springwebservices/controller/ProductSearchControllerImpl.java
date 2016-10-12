package com.imaginea.springwebservices.controller;

import com.imaginea.springwebservices.beans.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

/**
 * Created by shruthip on 8/31/16.
 */
@Controller
@RequestMapping("/products")
public class ProductSearchControllerImpl {

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody ArrayList<Product> getProducts(@RequestParam(value="name", required=false, defaultValue="Stranger") String name){
        Product prod1 = new Product();
        prod1.setDescription("test");
        prod1.setId("1");
        prod1.setName("test_name");
        ArrayList<Product> list = new ArrayList<Product>();
        list.add(prod1);
        return list;

    }
}
