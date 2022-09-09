package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription(){
        String yn = this.hasFur ? "a" : "no";
        String p = this.numberOfPaws == 1 ? "paw" : "paws";
        return  "This animal is mostly "+ this.color  +
                ". It has " + this.numberOfPaws + " " + p + " and " + yn + " fur.";
    }

}
