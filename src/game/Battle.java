package game;

import game.models.Pokemon.FirePokemon;
import game.models.Pokemon.Pokemon;
import game.models.Pokemon.WaterPokemon;

public class Battle {
    public static void main(String args[]) {
        Pokemon Fire = new FirePokemon("Charmander", 1);
        Pokemon Water = new WaterPokemon("Squirtle", 1);
        Water.attack(Constants.DASH, Fire);
    }
}
