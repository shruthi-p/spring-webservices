package com.imaginea.springwebservices.beans;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by shruthip on 8/31/16.
 */
@XmlRootElement
public class Product {
    private String id;
    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



}
