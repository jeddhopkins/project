package com.pokemongame;

import org.junit.jupiter.api.Test;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PokedexTest {

    @Test
    void pokedexInitialisesWithNullFields() {
        Pokedex pokedex = new Pokedex();

        assertEquals(0, pokedex.pokemonSeen);
        assertEquals(0, pokedex.pokemonCaught);
        assertEquals(Collections.emptyList(), pokedex.pokemonList);
    }
}
