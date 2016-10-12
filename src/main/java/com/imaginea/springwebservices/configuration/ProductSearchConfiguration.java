package com.imaginea.springwebservices.configuration;

import com.imaginea.springwebservices.controller.ProductSearchControllerImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by shruthip on 10/12/16.
 */
@SpringBootApplication
@ComponentScan(basePackageClasses = ProductSearchControllerImpl.class)
public class ProductSearchConfiguration {

    public static void main(String[] args) {
        SpringApplication.run(ProductSearchConfiguration.class, args);
    }
}
