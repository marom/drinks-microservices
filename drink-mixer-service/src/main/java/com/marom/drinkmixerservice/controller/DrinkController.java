package com.marom.drinkmixerservice.controller;

import com.marom.drinkmixerservice.domain.Drink;
import com.marom.drinkmixerservice.domain.Ingredients;
import com.marom.drinkmixerservice.domain.Spirits;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/mixer")
public class DrinkController {

     private RestTemplate restTemplate;

    public DrinkController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping
    @ResponseBody
    public Drink mixMyDrink(HttpServletResponse response) {

        response.addHeader("DrinkHeader", "some text");

        Spirits spirits = restTemplate.getForObject("http://spirit-service/spirits/api/all", Spirits.class);
        Ingredients ingredients = restTemplate.getForObject("http://ingredient-service/ingredients/api/all", Ingredients.class);

        Random random = new Random();
        String randomSpirit =  spirits.getSpirits().get(random.nextInt(spirits.getSpirits().size())).getName();
        String randomNonSpirit =  ingredients.getIngredients().get(random.nextInt(ingredients.getIngredients().size())).getName();
        String secondNonSpirit =  ingredients.getIngredients().get(random.nextInt(ingredients.getIngredients().size())).getName();
        String thirdNonSpirit =  ingredients.getIngredients().get(random.nextInt(ingredients.getIngredients().size())).getName();

        List<String> nonSpiritIngredients = Arrays.asList(randomNonSpirit, secondNonSpirit, thirdNonSpirit);

        return new Drink(randomSpirit, nonSpiritIngredients);

    }
}
