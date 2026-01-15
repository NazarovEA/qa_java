package com.example;
import java.util.List;

public class LionAlex extends Lion{
    public LionAlex(String sex, Feline feline) throws Exception {
        super(sex, feline);
    }
    public List<String> getFriends() {
        return List.of("Марти", "бегемотихи ", "Глории",  "Мелман");
    }
    public String getPlaceOfLiving() {
        return ("Нью-Йоркский зоопарк");
    }
}
