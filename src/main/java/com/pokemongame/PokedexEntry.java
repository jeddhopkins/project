package com.pokemongame;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PokedexEntry {

    private Gender gender;
    private String name;
    private String id;
    private Type type;
    private double height;
    private double weight;
    private double combatPower;

}
