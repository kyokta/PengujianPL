package org.example;

public class Owner {
    private String nama;

    public String getNama() {
        return nama;
    }

    public Owner(String nama, Integer usia) {
        this.nama = nama;
        this.usia = usia;
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
