package com.pokemongame;

import lombok.Getter;

@Getter
public class PokemonConverter {

    PokedexEntry pokedexEntry;

    public PokedexEntry toPokedexEntry(Pokemon pokemon) {
        pokedexEntry = new PokedexEntry();

        pokedexEntry.setGender(pokemon.getGender());
        pokedexEntry.setName(pokemon.getName());
        pokedexEntry.setId(String.format("%03d", pokemon.getId()));
        pokedexEntry.setType(pokemon.getType());
        pokedexEntry.setHeight(pokemon.getHeight());
        pokedexEntry.setWeight(pokemon.getWeight());
        pokedexEntry.setCombatPower(pokemon.getCombatPower());

        return pokedexEntry;
    }
}
