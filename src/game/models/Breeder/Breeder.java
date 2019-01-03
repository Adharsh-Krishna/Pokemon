package game.models.Breeder;

import game.factories.PotionFactory;
import game.models.Pokemon.Pokemon;

import java.util.ArrayList;
import java.util.HashMap;

public class Breeder {
    private String name;
    private HashMap<String, Pokemon> pokemons;
    private ArrayList<String> potions;

    public Breeder(String name) {
        this.name = name;
    }

    public void collect(Pokemon pokemon) {
        this.pokemons.put(pokemon.getName(), pokemon);
    }

    public Pokemon summon(String pokemonName) {
        return this.pokemons.get(pokemonName);
    }

    public void addPotion(String potionName) {
        this.potions.add(potionName);
    }

    public void listPotions() {
        for(String potionName: this.potions){
            System.out.println(potionName);
        }
    }

    public void listPokemons() {
        for(Pokemon pokemon: this.pokemons.values()) {
            System.out.println(pokemon.getName());
        }
    }

    public boolean checkIfPotionExists(String potionName) {
        return this.potions.contains(potionName);
    }

    public void heal(String pokemonName, String potionName) {
        if (this.checkIfPotionExists(potionName)) {
            Pokemon pokemon = this.pokemons.get(pokemonName);
            PotionFactory potionFactory = new PotionFactory().getSingletonInstance();
            potionFactory.getPotionByName(potionName).heal(pokemon);
        }
    }
}
