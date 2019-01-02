package game.models.Ability;

import game.AttackUnlocker.ElectricAttackUnlocker;
import game.Constants;

public class ElectricAbility extends Ability {

    public ElectricAbility() {
        this.name = Constants.FIRE;
        this.unlocker = new ElectricAttackUnlocker();
    }
}
