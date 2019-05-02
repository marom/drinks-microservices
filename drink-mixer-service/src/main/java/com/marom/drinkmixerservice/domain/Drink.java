package com.marom.drinkmixerservice.domain;

public class Drink {

    private String spiritBase;
    private String nonSpiritIngredient;

    public Drink() {
    }

    public Drink(String spiritBase, String nonSpiritIngredient) {
        this.spiritBase = spiritBase;
        this.nonSpiritIngredient = nonSpiritIngredient;
    }


    public String getNonSpiritIngredient() {
        return nonSpiritIngredient;
    }

    public void setNonSpiritIngredient(String nonSpiritIngredient) {
        this.nonSpiritIngredient = nonSpiritIngredient;
    }

    public String getSpiritBase() {
        return spiritBase;
    }

    public void setSpiritBase(String spiritBase) {
        this.spiritBase = spiritBase;
    }
}
