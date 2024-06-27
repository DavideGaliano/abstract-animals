package org.lessons.java.animals;

public class Main {
    public static void main(String[] args) {
        // Istanziare gli animali
        Cane cane = new Cane();
        Passerotto passerotto = new Passerotto();
        Aquila aquila = new Aquila();
        Delfino delfino = new Delfino();

        cane.dormi();
        cane.verso();
        cane.mangia();

        passerotto.dormi();
        passerotto.verso();
        passerotto.mangia();

        aquila.dormi();
        aquila.verso();
        aquila.mangia();

        delfino.dormi();
        delfino.verso();
        delfino.mangia();

        //Metodi di volo e nuoto
        passerotto.faiVolare();
        aquila.faiVolare();
        delfino.faiNuotare();
    }
}