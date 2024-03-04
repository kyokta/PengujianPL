package org.example;

public class Kalkulator {
    private int nilai1;

    private int nilai2;

    Kalkulator(int nilai1, int nilai2) {
        this.setNilai1(nilai1);
        this.setNilai2(nilai2);
    }

    public int penjumlahan()
    {
        return getNilai1() + getNilai2();
    }

    public int pengurangan() { return  getNilai1() - getNilai2(); }

    public int getNilai2()
    {
        return nilai2;
    }

    private void setNilai2(int nilai2) {
        this.nilai2 = nilai2;
    }

    public int getNilai1() {
        return nilai1;
    }

    public void setNilai1(int nilai1) {
        this.nilai1 = nilai1;
    }
}
