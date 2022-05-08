package com.pokemon;

public class Pokebot {

    public static Pokemon choice() {
        int random = (int) (Math.random() * 3) + 1;

        if (random == 1) {
            return new Charmander();
        } else if (random == 2) {
            return new Bulbasaur();
        } else {
            return new Pikachu();
        }
    }

}
