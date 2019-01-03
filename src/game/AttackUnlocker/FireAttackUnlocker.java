package game.AttackUnlocker;

import game.Constants;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class FireAttackUnlocker extends AttackUnlocker {

    private static HashMap<Integer, List<String>> attackList = new HashMap<Integer, List<String>>() {{
        put(1, Collections.singletonList(Constants.DASH));
        put(2, Arrays.asList(Constants.DASH, Constants.BLAZE));
    }};
}

