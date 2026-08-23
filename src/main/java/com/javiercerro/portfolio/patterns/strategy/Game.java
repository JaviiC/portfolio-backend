package com.javiercerro.portfolio.patterns.strategy;

public class Game {

    public static void main(String[] args) {

        CharacterFactory factory = new SniperFactory();
        Character character = factory.createCharacter();

        character.ejecutarAtaque();

    }

}
