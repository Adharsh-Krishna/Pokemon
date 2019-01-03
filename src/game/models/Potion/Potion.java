package game.models.Potion;

import game.models.Pokemon.Pokemon;

public class Potion {
    String name;
    protected int multiplier;

    public String getName() {
        return name;
    }

    public void heal(Pokemon pokemon) {
        int currentHealth = pokemon.getCurrentHealth();
        int increasedHealth = currentHealth * multiplier;
        if (increasedHealth > pokemon.getMaximumHealth()) {
            increasedHealth = pokemon.getMaximumHealth();
        }
        pokemon.setCurrentHealth(increasedHealth);
    }
}
