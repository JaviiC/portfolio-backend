package com.javiercerro.portfolio.patterns.strategy;

public interface AttackStrategy {
    void atacar();
}

class ShortAttack implements AttackStrategy {
    @Override
    public void atacar(){
        System.out.println("Ataque Cuerpo a Cuerpo");
    }
}

class MagicAttack implements AttackStrategy {
    @Override
    public void atacar(){
        System.out.println("Ataque Mágico");
    }
}

class LargeRangeAttack implements AttackStrategy {
    @Override
    public void atacar(){
        System.out.println("Ataque Lejano");
    }
}

class LightningAttack implements AttackStrategy {
    @Override
    public void atacar() {
        System.out.println("Ataque Rayo");
    }
}
