package game.AttackUnlocker;

//import com.sun.tools.javac.util.List;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ElectricAttackUnlocker extends AttackUnlocker{

    private static HashMap<Integer, List<String>> attackList = new HashMap<Integer, List<String>>() {{
        put(1, Arrays.asList("Dash"));
        put(2, Arrays.asList("Dash", "ThunderShock"));
    }};

}
