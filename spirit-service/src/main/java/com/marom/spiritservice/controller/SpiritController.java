package com.marom.spiritservice.controller;

import com.marom.spiritservice.domain.Spirit;
import com.marom.spiritservice.domain.Spirits;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/spirits/api")
public class SpiritController {

    Spirits spirits = new Spirits(Arrays.asList(
            new Spirit("Vodka"),
            new Spirit("Gin"),
            new Spirit("Tequila"),
            new Spirit("Ginger beer"),
            new Spirit("Red wine"),
            new Spirit("Brandy"),
            new Spirit("Bourbon"),
            new Spirit("Tequila")
            ));

    @GetMapping("/all")
    public Spirits getAllSpirits() {

        return spirits;
    }

}
