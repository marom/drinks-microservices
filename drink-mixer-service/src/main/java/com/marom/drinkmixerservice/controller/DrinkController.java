package com.marom.drinkmixerservice.controller;

import com.marom.drinkmixerservice.domain.Drink;
import com.marom.drinkmixerservice.domain.Ingredients;
import com.marom.drinkmixerservice.domain.Spirits;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

@RestController
@RequestMapping("/mixer")
public class DrinkController {

     private RestTemplate restTemplate;

    public DrinkController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping
    public Drink mixMyDrink() {

        Spirits spirits = restTemplate.getForObject("http://spirit-service/spirits/api/all", Spirits.class);
        Ingredients ingredients = restTemplate.getForObject("http://ingredient-service/ingredients/api/all", Ingredients.class);

        Random random = new Random();
        String randomSpirit =  spirits.getSpirits().get(random.nextInt(spirits.getSpirits().size())).getName();
        String randomNonSpirit =  ingredients.getIngredients().get(random.nextInt(ingredients.getIngredients().size())).getName();


        return new Drink(randomSpirit, randomNonSpirit);

    }
}
