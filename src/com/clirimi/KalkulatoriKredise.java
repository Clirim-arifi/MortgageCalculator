package com.clirimi;

public class KalkulatoriKredise {
    private final static byte MUAJTNEVITE = 12;
    private final static byte PERQINDJA = 100;

    private int shumaKredise;
    private float interesiVjetor;
    private byte vitet;

    public KalkulatoriKredise(int shumaKredise, float interesiVjetor, byte vitet) {
        this.shumaKredise = shumaKredise;
        this.interesiVjetor = interesiVjetor;
        this.vitet = vitet;
    }

    public double kalkulimiBalancit(short numriPagesaveDone) {
        float interesiMujor = getInteresiVjetor();
        float numriPagesave = getNumriPagesave();

        double balance = shumaKredise
                * (Math.pow(1 + interesiMujor, numriPagesave) - Math.pow(1 + interesiMujor, numriPagesaveDone)) / (Math.pow(1 + interesiMujor, numriPagesave) - 1);
        return balance;
    }

    public double kalkulimiKredise() {
        float interesiMujor = getInteresiVjetor();
        float numriPagesave = getNumriPagesave();

        double kredia = shumaKredise
                * (interesiMujor * Math.pow(1 + interesiMujor, numriPagesave)) / (Math.pow(1 + interesiMujor, numriPagesave) - 1);
        return kredia;
    }

    public double[] getBilanciMbetur() {
        var balanci = new double[getNumriPagesave()];
        for (short muaji = 1; muaji <= balanci.length; muaji++)
            balanci[muaji - 1] = kalkulimiBalancit(muaji);
        return balanci;
    }

    private float getInteresiVjetor() {
        return interesiVjetor / PERQINDJA / MUAJTNEVITE;
    }

    private int getNumriPagesave() {
        return vitet * MUAJTNEVITE;
    }
}

