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

    Ingredients ingredients = new Ingredients(Arrays.asList(
            new Ingredient("Orange juice"),
            new Ingredient("Lemon juice"),
            new Ingredient("2 large limes"),
            new Ingredient("7 strawberries"),
            new Ingredient("8 cups ice cubes"),
            new Ingredient("4 cups diced rhubarb"),
            new Ingredient("Soda water"),
            new Ingredient("Pineapple juice"),
            new Ingredient("Honey syrup"),
            new Ingredient("Coffee ice cream"),
            new Ingredient("Cold-brew coffee")
    ));

    @GetMapping("/all")
    public Ingredients getAllIngredients() {
        return ingredients;
    }
}
