package com.example;

import java.util.List;

public class Cat {

    Predator predator;

    public Cat(Feline feline) {
        this.predator = feline;
    }

    public String getSound(String мяу) {
        return "Мяу";
    }

    public List<String> getFood(List<String> strings) throws Exception {
        return predator.eatMeat();
    }

}