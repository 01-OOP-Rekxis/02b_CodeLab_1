package com.cc.java;

public class App {

    public static void main(String[] args) {
        Konto konto1 = new Konto();
        Konto konto2 = new Konto();
        Konto konto3 = new Konto();

        output(konto1.getKontostand());
        output(konto2.getKontostand());
        output(konto3.getKontostand());

        System.out.println("------------------------");

        konto1.setKontostand(konto1.getKontostand() * 2);
        konto2.setKontostand(konto2.getKontostand() * 3);
        konto3.setKontostand(konto3.getKontostand() * 10);

        output(konto1.getKontostand());
        output(konto2.getKontostand());
        output(konto3.getKontostand());

    }

    // private static void output(String outputStr) {
    //     System.out.println(outputStr);
    // }

    private static void output(int outputInt) {
        System.out.println(outputInt);
    }

}