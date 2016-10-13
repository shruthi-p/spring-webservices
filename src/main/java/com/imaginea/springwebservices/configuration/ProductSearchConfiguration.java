package com.imaginea.springwebservices.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by shruthip on 10/12/16.
 */
@SpringBootApplication
@EnableAutoConfiguration()
//@ComponentScan(basePackageClasses = ProductSearchControllerImpl.class)
@ComponentScan(basePackages = "com.imaginea.springwebservices")
public class ProductSearchConfiguration extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(ProductSearchConfiguration.class, args);
    }
}
