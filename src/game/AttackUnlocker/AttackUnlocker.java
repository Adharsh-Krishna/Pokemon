package game.AttackUnlocker;

import game.models.Pokemon.Pokemon;

import java.util.HashMap;
import java.util.List;

public abstract class AttackUnlocker {

    protected static HashMap<Integer, List<String>> attackList = new HashMap<>();

    public void unlock(Pokemon pokemon) {
        List<String> attacks = attackList.get(pokemon.getLevel());
        pokemon.setAttacks(attacks);
    }
}
