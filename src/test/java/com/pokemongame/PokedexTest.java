package com.pokemongame;

import com.pokemongame.constants.Gender;
import com.pokemongame.constants.Type;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PokedexTest {

    @Test
    void pokedexInitialisesWithDefaultFields() {
        Pokedex pokedex = new Pokedex();

        assertEquals(0, pokedex.getPokemonSeen());
        assertEquals(0, pokedex.getPokemonCaught());
        assertEquals(151, pokedex.getPokemonList().size());
    }

    @Test
    void addFirstPokemon() {
        Pokedex pokedex = new Pokedex();
        Pokemon bulbasaur = new Pokemon(Gender.FEMALE,"Bulbasaur", 1, Type.WATER, 1.00, 5.00, 99);
        
        pokedex.addPokemon(bulbasaur);

        //asserting the pokemon has been added
        assertEquals(1, pokedex.getPokemonSeen());
        assertEquals(1, pokedex.getPokemonCaught());
        assertEquals("Bulbasaur", pokedex.getPokemonList().get("001").getName());

        //asserting that it has only been added once
        long entryCount = pokedex.getPokemonList().entrySet().stream()
                .filter(e -> "Bulbasaur".equals(e.getValue().getName()))
                .count();

        assertEquals(1, entryCount);
    }

    @Test
    void addCharmanderEvolutionLine() {
        Pokedex pokedex = new Pokedex();
        Pokemon charmander = new Pokemon(Gender.MALE,"Charmander", 4, Type.FIRE, 1, 12, 99);
        Pokemon charmeleon = new Pokemon(Gender.MALE,"Charmeleon", 5, Type.FIRE, 2, 55.8, 210);
        Pokemon charizard = new Pokemon(Gender.MALE,"Charizard", 6, Type.FIRE, 1, 625, 750);

        pokedex.addPokemon(charmander);
        pokedex.addPokemon(charmeleon);
        pokedex.addPokemon(charizard);

        //asserting the pokemon has been added
        assertEquals(3, pokedex.getPokemonSeen());
        assertEquals(3, pokedex.getPokemonCaught());
        assertEquals("Charmander", pokedex.getPokemonList().get("004").getName());
        assertEquals("Charmeleon", pokedex.getPokemonList().get("005").getName());
        assertEquals("Charizard", pokedex.getPokemonList().get("006").getName());

        pokedex.printPokedex();
    }
}
