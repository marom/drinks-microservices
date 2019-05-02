package com.marom.drinkmixerservice.domain;

import java.util.ArrayList;
import java.util.List;

public class Ingredients {

    private List<Ingredient> ingredients = new ArrayList<>();

    public Ingredients() {
    }

    public Ingredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}
