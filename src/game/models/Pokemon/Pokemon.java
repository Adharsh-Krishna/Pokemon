package game.models.Pokemon;

import game.models.Ability.Ability;
import game.factories.AttackFactory;

import java.util.List;

public abstract class Pokemon {
    String name;
    Ability ability;
    int level;
    private List<String> attacks;
    int health;

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


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void attack(String name, Pokemon pokemon) {
        boolean hasAdvantage = this.ability.advantageMapper.hasAdvantageOver(this, pokemon);
        AttackFactory attackFactory = new AttackFactory().getSingletonInstance();
        attackFactory.getAttackByName(name).attack(pokemon, hasAdvantage);
    }

    public boolean isDead() {
        return this.health < 0;
    }

    @Override
    public String toString() {
        return "Pokemon Name : " + this.name + ", Health : " + this.health;
    }
}