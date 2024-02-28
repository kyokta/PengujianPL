package org.example;

public class Owner {
    private String nama;

    public Owner(String nama, Integer usia) {
        this.nama = nama;
        this.usia = usia;
    }

    public Owner(String nama) {
        this.nama = nama;
    }

    public Owner(){}

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Integer getUsia() {
        return usia;
    }

    public void setUsia(Integer usia) {
        this.usia = usia;
    }

    private Integer usia;
}
