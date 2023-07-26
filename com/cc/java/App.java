package com.cc.java;


public class App {
    
    public static void main(String[] args) {
        Konto konto = new Konto(100);
        int kontostand = konto.getKontostand();
        String kontoAlsText = Integer.toString(kontostand);

        output(kontoAlsText);

        konto.setKontostand(5000);
        kontostand = konto.getKontostand();
        kontoAlsText = Integer.toString(kontostand);
        
        output(kontoAlsText);
    }


    private static void output(String outputStr) {
        System.out.println(outputStr);
    } 

}