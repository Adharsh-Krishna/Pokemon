package game.models.Potion;

import game.Constants;
import game.models.Pokemon.Pokemon;

public class CrystalPotion extends Potion {

    public CrystalPotion() {
        this.name = Constants.CRYSTAL_POTION;
    }

    @Override
    public void heal(Pokemon pokemon) {
        int maximumHealth = pokemon.getMaximumHealth();
        pokemon.setCurrentHealth(maximumHealth);
    }
}
