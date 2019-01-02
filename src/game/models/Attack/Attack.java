package game.models.Attack;

import game.models.Pokemon.Pokemon;

public abstract class Attack {
    String name;
    String message;
    protected double intensity;

    public void attack(Pokemon pokemon, boolean hasAdvantage){
        int currentHealth = pokemon.getHealth();
        int newHealth = (int)(hasAdvantage ? (this.intensity * currentHealth) * 2 : (this.intensity * currentHealth));
        pokemon.setHealth(currentHealth - newHealth);
        System.out.println(pokemon.toString());
        if (pokemon.isDead()) {
            System.out.println(pokemon.getName() + "is Dead.");
        }
    }
}
