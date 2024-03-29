package org.example;

import java.util.ArrayList;
import java.util.List;

public class Wallet {
    private Owner owner;
    private List<Card> cards = new ArrayList<>();

    private double cash;

    public Wallet(){}

    public Wallet(Owner owner, List<Card> cards,double cash) {
        this.owner = owner;
        this.cards = cards;
        this.cash = cash;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(Integer cash) {
        this.cash = cash;
    }

    public double withdraw(double amount) {
        if (this.cash < amount) {
            System.out.println("Saldo kurang");
            return 0;
        } else {
            this.cash -= amount;
            return amount;
        }
    }

    public double deposit(double amount) {
        this.cash += amount;
        return this.cash;
    }

    public void addCards(String bank, int accountNumber){
        Card card = new Card();
        card.setNamaPemilik(this.owner.getNama());
        card.setBank(bank);
        card.setNoRek(String.valueOf(accountNumber));
        this.cards.add(new Card());
    }

    public void removeCard(int accountNumber){
        this.cards.forEach(card -> {
            if (card.getNoRek().equals(String.valueOf(accountNumber)))
                this.cards.remove(card);
        });
    }
}
