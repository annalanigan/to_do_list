package com.example.codeclan.todolist.Category;

import java.io.Serializable;

/**
 * Created by annalanigan on 05/01/2018.
 */

public class Category implements Serializable{

    private String name;
    private Integer logo;

    public Category(String name, Integer logo){
        this.name = name;
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLogo() {
        return logo;
    }

    public void setLogo(Integer logo) {
        this.logo = logo;
    }
}
