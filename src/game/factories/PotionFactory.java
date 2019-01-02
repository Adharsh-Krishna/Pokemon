package game.factories;

import game.Constants;
import game.models.Potion.BluePotion;
import game.models.Potion.CrystalPotion;
import game.models.Potion.Potion;
import game.models.Potion.RedPotion;

import java.util.HashMap;

public class PotionFactory {

    private static PotionFactory instance = null;

    private static HashMap<String, Potion> potionMapper  = new HashMap<String, Potion>() {{
        put(Constants.BLUE_POTION, new BluePotion());
        put(Constants.RED_POTION, new RedPotion());
        put(Constants.CRYSTAL_POTION, new CrystalPotion());
    }};

    public PotionFactory getSingletonInstance() {
        if (instance == null) {
            instance = new PotionFactory();
            return  instance;
        } else {
            return instance;
        }
    }

    public Potion getPotionByName(String potionName) {
        return potionMapper.get(potionName);
    }


}
