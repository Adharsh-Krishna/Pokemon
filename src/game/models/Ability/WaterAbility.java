package game.models.Ability;

import game.AttackUnlocker.WaterAttackUnlocker;
import game.Constants;

public class WaterAbility extends Ability {

    public WaterAbility() {
        this.name = Constants.WATER;
        this.unlocker = new WaterAttackUnlocker();
    }

}
