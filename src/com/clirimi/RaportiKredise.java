package com.clirimi;

import java.text.NumberFormat;

public class RaportiKredise {

    private final NumberFormat currency;
    private KalkulatoriKredise kalkulator;

    public RaportiKredise(KalkulatoriKredise kalkulator) {
        this.kalkulator = kalkulator;
        currency = NumberFormat.getCurrencyInstance();
    }

    public void printBilanciMbetur() {
        System.out.println();
        System.out.println("Pagesat e planifikuara \n----------------------");
        for (double balance : kalkulator.getBilanciMbetur())
            System.out.println(currency.format(balance));
    }

    public void printHipoteken() {
        double mortgage = kalkulator.kalkulimiKredise();
        String hipotekaFormatted = currency.format(mortgage);
        System.out.println();
        System.out.println("Pagesa Mujore: \n" + hipotekaFormatted);
    }
}
