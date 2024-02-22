package org.example;

import java.time.LocalDate;

public class Card {
    private String namaPemilik;
    private String noRek;
    private LocalDate masaAkrif;
    private String bank;

    public Card() {
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public void setNamaPemilik(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }

    public String getNoRek() {
        return noRek;
    }

    public void setNoRek(String noRek) {
        this.noRek = noRek;
    }

    public LocalDate getMasaAkrif() {
        return masaAkrif;
    }

    public void setMasaAkrif(LocalDate masaAkrif) {
        this.masaAkrif = masaAkrif;
    }
}
