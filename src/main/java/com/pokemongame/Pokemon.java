package com.pokemongame;

import lombok.Getter;

@Getter
public class Pokemon {

    private Gender gender;
    private String name;
    private int id;
    private Type type;
    private double height;
    private double weight;
    private double combatPower;

    public Pokemon(Gender gender, String name, int id, Type type, double height, double weight, double combatPower) {
        this.gender = gender;
        this.name = name;
        this.id = id;
        this.type = type;
        this.height = height;
        this.weight = weight;
        this.combatPower = combatPower;
    }
}
