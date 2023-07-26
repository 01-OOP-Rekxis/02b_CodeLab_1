package com.cc.java;

public class Konto {

    private int kontostand;

    public Konto(int initialerKontostand) {
        this.kontostand = initialerKontostand;
    }

    public int getKontostand() {
        return kontostand;
    }

    public void setKontostand(int neuerKontostand) {
        kontostand = neuerKontostand;
    }

}