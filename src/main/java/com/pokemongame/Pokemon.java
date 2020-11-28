package com.pokemongame;

import com.pokemongame.constants.Gender;
import com.pokemongame.constants.Type;
import lombok.Getter;

@Getter
public class Pokemon {

    private Gender gender;
    private String name;
    private int id;
    private Type type;
    private double height;
    private double weight;
    private int combatPower;

    public Pokemon() {
        this.gender = Gender.NULL;
        this.name = "?";
        this.id = 0;
        this.type = Type.NULL;
        this.height = 0;
        this.weight = 0;
        this.combatPower = 0;
    }

    public Pokemon(Gender gender, String name, int id, Type type, double height, double weight, int combatPower) {
        this.gender = gender;
        this.name = name;
        this.id = id;
        this.type = type;
        this.height = height;
        this.weight = weight;
        this.combatPower = combatPower;
    }
}
