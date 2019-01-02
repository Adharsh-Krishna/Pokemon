package game.models.Attack;

import game.models.Pokemon.Pokemon;

public abstract class Attack {
    String name;
    String message;
    protected double intensity;

    public void attack(Pokemon pokemon, boolean hasAdvantage){
        int currentHealth = pokemon.getCurrentHealth();
        int reducedHealth = (int)(hasAdvantage ? Math.ceil(this.intensity * currentHealth) * 2 : Math.ceil(this.intensity * currentHealth));
        pokemon.setCurrentHealth(currentHealth - reducedHealth);
        System.out.println(pokemon.toString());
        if (pokemon.isDead()) {
            System.out.println(pokemon.getName() + " is Dead.");
        }
    }
}
