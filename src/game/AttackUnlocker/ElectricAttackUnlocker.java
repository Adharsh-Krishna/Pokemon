package game.AttackUnlocker;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ElectricAttackUnlocker extends AttackUnlocker{

    private static HashMap<Integer, List<String>> attackList = new HashMap<Integer, List<String>>() {{
        put(1, Collections.singletonList("Dash"));
        put(2, Arrays.asList("Dash", "ThunderShock"));
    }};

}
