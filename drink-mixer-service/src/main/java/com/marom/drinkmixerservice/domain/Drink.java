package com.marom.drinkmixerservice.domain;

import java.util.List;

public class Drink {

    private String spiritBase;
    private List<String> nonSpiritIngredients;



    public Drink(String spiritBase, List<String> nonSpiritIngredients) {
        this.spiritBase = spiritBase;
        this.nonSpiritIngredients = nonSpiritIngredients;
    }


    public List<String> getNonSpiritIngredients() {
        return nonSpiritIngredients;
    }

    public void setNonSpiritIngredients(List<String> nonSpiritIngredients) {
        this.nonSpiritIngredients = nonSpiritIngredients;
    }

    public String getSpiritBase() {
        return spiritBase;
    }

    public void setSpiritBase(String spiritBase) {
        this.spiritBase = spiritBase;
    }
}
