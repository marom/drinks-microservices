package com.marom.drinkmixerservice.domain;

public class Ingredient {

    private String name;



    public Ingredient(String name) {
        this.name = name;
    }

    public Ingredient() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
