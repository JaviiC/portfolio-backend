package com.javiercerro.portfolio.patterns.strategy;

public interface CharacterFactory {
    Character crearPersonaje();
}

class WizardFactory implements CharacterFactory {
    @Override
    public Character crearPersonaje() {
        return new Wizard();
    }
}

class ArcherFactory implements CharacterFactory {
    @Override
    public Character crearPersonaje() {
        return new Archer();
    }
}

class WarriorFactory implements CharacterFactory {
    @Override
    public Character crearPersonaje() {
        return new Warrior();
    }
}

class SniperFactory implements CharacterFactory {
    @Override
    public Character crearPersonaje() {
        return new Sniper();
    }
}