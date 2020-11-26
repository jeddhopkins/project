package com.pokemongame;

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
}
