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

        Spirits spirits = restTemplate.getForObject("http://localhost:8081/spirits/api/all", Spirits.class);
        Ingredients ingredients = restTemplate.getForObject("http://localhost:8082/ingredients/api/all", Ingredients.class);

        Random randomSpirit = new Random();
        int x =  randomSpirit.nextInt((spirits.getSpirits().size() - 0) + 1) + 0;


        return new Drink("sssss", "dfsdafdafa");

    }
}
