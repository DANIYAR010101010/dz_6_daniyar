package com.company;

public class Sceleton extends Boss{
    private int Strely;

    public void print_info(){

        System.out.println("Health: "+this.getHealth()+"; "+"Damage: "+this.getDamage());
    }

    public int getStrely() {
        return Strely;
    }

    public void setStrely(int strely) {
        Strely = strely;
    }
}
