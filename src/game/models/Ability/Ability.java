package game.models.Ability;

import game.AttackUnlocker.AttackUnlocker;
import game.models.Pokemon.Pokemon;

public abstract class Ability {
    protected String name;
    AttackUnlocker unlocker;

    public String getName() {
        return name;
    }

    public void unlockAttacksFor(Pokemon pokemon) {
        this.unlocker.unlock(pokemon);
    }
}
