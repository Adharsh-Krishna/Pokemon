# Pokemon-OOP

## An Object Oriented Approach to the Pokemon World to demonstrate the OOP concepts and SOLID principles in action.

## Models
### Pokemon :

- represents a real world Pokemon.
- has Name, Ability, Level, Attacks, Maximum and Current Health as its attributes.

### Ability :

- represents an ability that a Pokemon possess.
- has Name and Attack Unlocker as its attributes.

### Attack :

- represents an Attack a Pokemon has in its arsenal.
- has Name, Message and Intensity as its attributes.

### Potion :

- represents a Potion a Pokemon can use to heal itself.
- has Name and Multiplier as its attributes.

### Breeder :

- represents a Breeder who collects Pokemons.
- has Name, Pokemons and Potions as its attributes.

## Factories
### Attack Factory :

- has a repository of Attacks of all abilities.
- uses a singleton pattern.
- returns the appropriate Attack when its name is provided.

### Potion Factory :

- has a repository of Potions of all abilities.
- uses a singleton pattern.
- returns the appropriate Potion when its name is provided.