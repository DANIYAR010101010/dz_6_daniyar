package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss1 = new Boss();
        boss1.setHealth(1000);
        boss1.setDamage(100);
        boss1.print_info();
        Sceleton Sceleon1 = new Sceleton();
        Sceleon1.setHealth(900);
        Sceleon1.setDamage(150);
        Sceleon1.print_info();
        Sceleton Sceleon2 = new Sceleton();
        Sceleon2.setHealth(900);
        Sceleon2.setDamage(150);
        Sceleon2.print_info();
    }
}
