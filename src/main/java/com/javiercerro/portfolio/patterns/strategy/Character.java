package com.javiercerro.portfolio.patterns.strategy;

public abstract class Character {
    private final Double vida;
    private final Integer energy;
    private AttackStrategy attackStrategy;

    public Character(Double vida, Integer energy, AttackStrategy ataque){
        this.vida = vida;
        this.energy = energy;
        attackStrategy = ataque;
    }

    public void cambiarEstrategia(AttackStrategy nuevaEstrategia){
        this.attackStrategy = nuevaEstrategia;
    }

    public void ejecutarAtaque(){
        System.out.print(this.getClass().getName() + " ejecuta ");
        attackStrategy.atacar();
    }

}

class Archer extends Character {
    private static final Double VIDA = 1500.0;
    private static final Integer ENERGY = 800;
    public Archer(){
        super(VIDA, ENERGY, new LightningAttack());
    }
}

class Wizard extends Character {
    private static final Double VIDA = 3500.0;
    private static final Integer ENERGY = 800;
    public Wizard(){
        super(VIDA, ENERGY, new MagicAttack());
    }
}

class Warrior extends Character {
    private static final Double VIDA = 7800.0;
    private static final Integer ENERGY = 1000;
    public Warrior(){
        super(VIDA, ENERGY, new ShortAttack());
    }
}

class Sniper extends Character {
    private static final Double VIDA = 200.0;
    private static final Integer ENERGY = 4000;
    public Sniper(){
        super(VIDA, ENERGY, new LargeRangeAttack());
    }
}