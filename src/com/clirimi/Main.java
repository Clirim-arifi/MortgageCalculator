package com.clirimi;

public class Main {

    public static void main(String[] args) {
        int shumaKredise = (int) Console.lexesi("Shuma Kredise: ", 1000, 1_000_000);
        float interesiVjetor = (float) Console.lexesi("Interesi: ", 1, 30);
        byte vitet = (byte) Console.lexesi("Periudha Kohore ne Vite : ", 1, 30);

        var kalkulator = new KalkulatoriKredise(shumaKredise, interesiVjetor, vitet);

        var raporti = new RaportiKredise(kalkulator);
        raporti.printHipoteken();
        raporti.printBilanciMbetur();
    }

}
