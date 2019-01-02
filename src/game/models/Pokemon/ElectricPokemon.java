package game.models.Pokemon;

import game.Constants;
import game.models.Ability.ElectricAbility;

public class ElectricPokemon extends Pokemon {

    public ElectricPokemon(String name, int level) {
        this.name = name;
        this.ability = new ElectricAbility();
        this.level = level;
        this.ability.unlockAttacksFor(this);
        this.setCurrentHealth(Constants.HEALTH_MULTIPLIER);
        this.setMaximumHealth(Constants.HEALTH_MULTIPLIER);
    }
}
