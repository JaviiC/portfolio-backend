package com.javiercerro.portfolio.patterns.strategy;

public interface CharacterFactory {
    Character createCharacter();
}

class WizardFactory implements CharacterFactory {
    @Override
    public Character createCharacter() {
        return new Wizard();
    }
}

class ArcherFactory implements CharacterFactory {
    @Override
    public Character createCharacter() {
        return new Archer();
    }
}

class WarriorFactory implements CharacterFactory {
    @Override
    public Character createCharacter() {
        return new Warrior();
    }
}

class SniperFactory implements CharacterFactory {
    @Override
    public Character createCharacter() {
        return new Sniper();
    }
}