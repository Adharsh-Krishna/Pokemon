package game.factories;

import game.models.Attack.Attack;
import game.models.Attack.CommonAttacks.Dash;
import game.models.Attack.ElectricAttacks.ThunderShock;
import game.models.Attack.FireAttacks.Blaze;
import game.Constants;

import java.util.HashMap;

public class AttackFactory {

    private static AttackFactory instance = null;

    private static HashMap<String, Attack> attackMapper = new HashMap<String, Attack>() {{
        put(Constants.DASH, new Dash());
        put(Constants.THUNDER_SHOCK, new ThunderShock());
        put(Constants.BLAZE, new Blaze());
    }};

    public AttackFactory getSingletonInstance() {
        if (instance == null) {
            instance = new AttackFactory();
            return instance;
        } else {
            return instance;
        }
    }

    public Attack getAttackByName(String attackName) {
        return attackMapper.get(attackName);
    }
}
