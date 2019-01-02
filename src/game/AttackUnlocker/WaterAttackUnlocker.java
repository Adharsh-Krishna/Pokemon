package game.AttackUnlocker;

import com.sun.tools.javac.util.List;

import java.util.HashMap;

public class WaterAttackUnlocker extends AttackUnlocker{

    private static HashMap<Integer, List<String>> attackList = new HashMap<Integer, List<String>>() {{
        put(1, List.of("Dash"));
        put(2, List.of("Dash", "WaterGun"));
    }};

}
