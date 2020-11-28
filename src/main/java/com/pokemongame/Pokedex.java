package com.pokemongame;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

@Getter
public class Pokedex {

    private int pokemonSeen;
    private int pokemonCaught;
    private Map<String, Pokemon> pokemonList = new HashMap<>();
    private Pokemon emptyPokemon;

    Pokedex() {
        pokemonSeen = 0;
        pokemonCaught = 0;
        createPokedexEntries();
    }

    public void addPokemon(Pokemon pokemon) {
        String number =  String.format("%03d", pokemon.getId());

        pokemonList.put(number, pokemon);
        pokemonSeen++;
        pokemonCaught++;
    }

    public TreeMap<String, Pokemon> convertListToSortedTreeMap() {
        return new TreeMap<String, Pokemon>(pokemonList);
    }

    public void printPokedex() {
        TreeMap<String, Pokemon> sortedList = convertListToSortedTreeMap();
        sortedList.forEach((key, value) -> System.out.println(key + ": " + value.getName()));
    }

    private void createPokedexEntries() {
        emptyPokemon = new Pokemon();
        for (long i = 1; i < 152; i++) {
            String number =  String.format("%03d", i);
            pokemonList.put(number, emptyPokemon);
        }
    }
}
