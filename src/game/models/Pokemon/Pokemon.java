package game.models.Pokemon;

import game.AdvantageMapper.AdvantageMapper;
import game.models.Ability.Ability;
import game.factories.AttackFactory;

import java.util.List;

public abstract class Pokemon {
    protected String name;
    protected Ability ability;
    protected int level;
    protected int maximumHealth;
    protected int currentHealth;
    private List<String> attacks;

    public void setMaximumHealth(int maximumHealth) {
        this.maximumHealth = maximumHealth;
    }

    public int getMaximumHealth() {
        return maximumHealth;
    }

    public String getName() {
        return this.name;
    }

    public Ability getAbility() {
        return ability;
    }

    public int getLevel() {
        return level;
    }

    public void setAttacks(List<String> attacks) {
        this.attacks = attacks;
    }


    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public void attack(String name, Pokemon pokemon) {
        if (pokemon.isDead()) {
            System.out.println(this.name + " is Dead.");
            return;
        }
        AdvantageMapper advantageMapper = new AdvantageMapper().getSingletonInstance();
        boolean hasAdvantage = advantageMapper.hasAdvantageOver(this, pokemon);

        AttackFactory attackFactory = new AttackFactory().getSingletonInstance();
        attackFactory.getAttackByName(name).attack(pokemon, hasAdvantage);
    }

    public void listAttacks() {
        for(String attackName: this.attacks) {
            System.out.println(attackName);
        }
    }

    public boolean isDead() {
        return this.currentHealth <= 0;
    }

    @Override
    public String toString() {
        return "Pokemon Name : " + this.name + ", Health : " + this.currentHealth;
    }
}