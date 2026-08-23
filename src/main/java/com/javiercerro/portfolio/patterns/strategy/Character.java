package com.javiercerro.portfolio.patterns.strategy;

public abstract class Character {
    private final Double life;
    private final Integer energy;
    private AttackStrategy attackStrategy;

    public Character(Double life, Integer energy, AttackStrategy ataque){
        this.life = life;
        this.energy = energy;
        attackStrategy = ataque;
    }

    public void cambiarEstrategia(AttackStrategy nuevaEstrategia){
        this.attackStrategy = nuevaEstrategia;
    }

    public void ejecutarAtaque(){
        System.out.print(this.getClass().getName() + " ejecuta ");
        attackStrategy.attack();
    }

}

class Archer extends Character {
    private static final Double life = 1500.0;
    private static final Integer ENERGY = 800;
    public Archer(){
        super(life, ENERGY, new LightningAttack());
    }
}

class Wizard extends Character {
    private static final Double life = 3500.0;
    private static final Integer ENERGY = 800;
    public Wizard(){
        super(life, ENERGY, new MagicAttack());
    }
}

class Warrior extends Character {
    private static final Double life = 7800.0;
    private static final Integer ENERGY = 1000;
    public Warrior(){
        super(life, ENERGY, new ShortAttack());
    }
}

class Sniper extends Character {
    private static final Double life = 550.0;
    private static final Integer ENERGY = 4000;
    public Sniper(){
        super(life, ENERGY, new LargeRangeAttack());
    }
}