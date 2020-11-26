package com.pokemongame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PokemonConverterTest {

    @Test
    void blah() {
        Pokemon charmander = new Pokemon(Gender.MALE, "Charmander", 4, Type.FIRE, 1, 6.5, 100);
        PokemonConverter converter = new PokemonConverter();

        PokedexEntry result = converter.toPokedexEntry(charmander);

        assertEquals("004", result.getId());
    }
}
