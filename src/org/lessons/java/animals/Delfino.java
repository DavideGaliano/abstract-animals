package org.lessons.java.animals;

class Delfino extends Animale implements INuotante {
    @Override
    public void verso() {
        System.out.println("Creee Creee");
    }

    @Override
    public void mangia() {
        System.out.println("Pesce");
    }

    @Override
    public void nuota() {
        System.out.println("Sto nuotando!!!");
    }
    
    public void faiNuotare() {
        nuota();
    }
}