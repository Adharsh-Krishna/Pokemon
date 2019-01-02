package game.models.Ability;

import game.AttackUnlocker.FireAttackUnlocker;
import game.Constants;

public class FireAbility extends Ability {

    public FireAbility() {
        this.name = Constants.FIRE;
        this.unlocker = new FireAttackUnlocker();
    }

}
