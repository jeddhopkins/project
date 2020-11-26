package com.pokemongame;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public class Pokedex {

    private int pokemonSeen;
    private int pokemonCaught;
    private Map<String, String> pokemonList = new HashMap<>();

    Pokedex() {
        pokemonSeen = 0;
        pokemonCaught = 0;
        addPokedexEntries();
    }

    private void addPokedexEntries() {
        for (long i = 1; i < 152; i++) {
            String number =  String.format("%03d", i);
            System.out.println(number);
            pokemonList.put(number, "");
        }
    }
}
