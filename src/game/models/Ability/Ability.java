package game.models.Ability;

import game.AdvantageMapper.AdvantageMapper;
import game.AttackUnlocker.AttackUnlocker;
import game.models.Pokemon.Pokemon;

public abstract class Ability {
    protected String name;
    AttackUnlocker unlocker;
    public AdvantageMapper advantageMapper = new AdvantageMapper().getSingletonInstance();

    public String getName() {
        return name;
    }

    public void unlockAttacksFor(Pokemon pokemon) {
        this.unlocker.unlock(pokemon);
    }
}
