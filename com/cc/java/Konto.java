package com.cc.java;

public class Konto {

    private int kontostand;

    public Konto() {
        kontostand = 10000;
    }

    public int getKontostand() {
        return kontostand;
    }

    public void setKontostand(int neuerKontostand) {
        kontostand = neuerKontostand;
    }

}