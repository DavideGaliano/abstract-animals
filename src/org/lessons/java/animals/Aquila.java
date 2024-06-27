package org.lessons.java.animals;

class Aquila extends Animale implements IVolante {
    @Override
    public void verso() {
        System.out.println("Screee");
    }

    @Override
    public void mangia() {
        System.out.println("Carne");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }
    
    public void faiVolare() {
        vola();
    }
}