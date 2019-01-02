package game.AdvantageMapper;

import game.Constants;
import game.models.Pokemon.Pokemon;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


public class AdvantageMapper {

    private static AdvantageMapper instance = null;

    private static HashMap<String, List<String>> abilityAdvantageMapper = new HashMap<String, List<String>>() {{
        put(Constants.FIRE, Collections.emptyList());
        put(Constants.WATER, Collections.singletonList(Constants.FIRE));
        put(Constants.ELECTRIC, Collections.singletonList(Constants.WATER));
    }};

    public boolean hasAdvantageOver(Pokemon attacker, Pokemon defender) {
        String attackerAbility = attacker.getAbility().getName();
        String defenderAbility = defender.getAbility().getName();
        return abilityAdvantageMapper
                .get(attackerAbility)
                .contains(defenderAbility);
    }

    public AdvantageMapper getSingletonInstance() {
        if ( instance == null) {
            instance = new AdvantageMapper();
            return instance;
        } else {
            return instance;
        }
    }
}
