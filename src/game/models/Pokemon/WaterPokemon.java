package game.models.Pokemon;

import game.Constants;
import game.models.Ability.WaterAbility;

public class WaterPokemon extends Pokemon {

    public WaterPokemon(String name, int level) {
        this.name = name;
        this.ability = new WaterAbility();
        this.level = level;
        this.ability.unlockAttacksFor(this);
        this.setCurrentHealth(Constants.HEALTH_MULTIPLIER);
        this.setMaximumHealth(Constants.HEALTH_MULTIPLIER);
    }
}
