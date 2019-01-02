package game.models.Pokemon;

import game.models.Ability.FireAbility;

public class FirePokemon extends Pokemon {

    public FirePokemon(String name, int level) {
        this.name = name;
        this.ability = new FireAbility();
        this.level = level;
        this.ability.unlockAttacksFor(this);
        this.currentHealth = this.level * 10;
    }

}
