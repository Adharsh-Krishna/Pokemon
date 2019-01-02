package game.models.Pokemon;

import game.Constants;
import game.models.Ability.FireAbility;

public class FirePokemon extends Pokemon {

    public FirePokemon(String name, int level) {
        this.name = name;
        this.ability = new FireAbility();
        this.level = level;
        this.ability.unlockAttacksFor(this);
        this.setCurrentHealth(Constants.HEALTH_MULTIPLIER);
        this.setMaximumHealth(Constants.HEALTH_MULTIPLIER);
    }

}
