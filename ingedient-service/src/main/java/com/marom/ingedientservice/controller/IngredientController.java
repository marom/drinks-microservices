package com.marom.ingedientservice.controller;

import com.marom.ingedientservice.domain.Ingredient;
import com.marom.ingedientservice.domain.Ingredients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RequestMapping("/ingredients/api")
@RestController
public class IngredientController {

    Ingredients ingredients = new Ingredients(Arrays.asList(new Ingredient("Orange juice"), new Ingredient("Lemon juice")));

    @GetMapping("/all")
    public Ingredients getAllIngredients() {
        return ingredients;
    }
}
