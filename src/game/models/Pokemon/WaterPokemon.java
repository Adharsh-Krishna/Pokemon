package game.models.Pokemon;

import game.models.Ability.WaterAbility;

public class WaterPokemon extends Pokemon {

    public WaterPokemon(String name, int level) {
        this.name = name;
        this.ability = new WaterAbility();
        this.level = level;
        this.ability.unlockAttacksFor(this);
        this.currentHealth = this.level * 10;
    }
}
