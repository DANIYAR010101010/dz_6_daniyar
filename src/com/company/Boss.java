package com.company;

public class Boss extends GameEntity {

    Weapon AXE;

    public void print_info(){

        System.out.println("Health: "+this.getHealth()+"; "+"Damage: "+this.getDamage());
    }

    public Weapon getAXE() {
        return AXE;
    }

    public void setAXE(Weapon AXE) {
        this.AXE = AXE;
    }

}

