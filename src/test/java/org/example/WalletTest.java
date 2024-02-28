package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WalletTest {
    @Test
    public void testOwner(){
        Wallet wallet = new Wallet(new Owner("Nama", 17), null, 0.0);
        wallet.setOwner(new Owner("Owner"));
        assertEquals("Owner", wallet.getOwner().getNama());
    }

    @Test
    public void testSufficientWithdraw(){
        Wallet wallet = new Wallet(new Owner("Owner"), null, 200.0);
        double withdrawnAmount = wallet.withdraw(50.0);
        assertEquals(150.0, withdrawnAmount);
        assertEquals(150.0, wallet.getCash());
    }

    @Test
    public void testInsufficientWithdraw(){
        Wallet wallet = new Wallet(new Owner("Owner"), null, 30.0);
        double withdrawnAmount = wallet.withdraw(50.0);
        assertEquals(0.0, withdrawnAmount);
        assertEquals(30.0, wallet.getCash());
    }

    @Test
    public void testDeposit() {
        Wallet wallet = new Wallet(new Owner("Owner"), null, 50.0);
        double depositedAmount = wallet.deposit(30.0);
        assertEquals(80.0, depositedAmount);
        assertEquals(80.0, wallet.getCash());
    }

    @Test
    public void testAddCard() {
        Wallet wallet = new Wallet(new Owner("Owner"), null, 0.0);
        wallet.addCards("TestBank", 123456789);
        assertEquals(1, wallet.getCards().size());
    }

    @Test
    public void testRemoveAllCards() {
        Wallet wallet = new Wallet(new Owner("Owner"), null, 0.0);
        wallet.removeAllCards();
        assertEquals(0, wallet.getCards().size());
    }

    @Test
    public void testRemoveCard() {
        Wallet wallet = new Wallet(new Owner("Owner"), null, 0.0);
        wallet.addCards("TestBank", 123456789);
        wallet.addCards("AnotherBank", 987654321);
        int initialSize = wallet.getCards().size();

        wallet.removeCard(123456789);
        assertEquals(initialSize - 1, wallet.getCards().size());
    }

    @Test
    public void testSetCash() {
        Wallet wallet = new Wallet(new Owner("Owner"), null, 0.0);
        wallet.setCash(500000);
        assertEquals(500000, wallet.getCash());
    }

    @Test
    public void testAll(){
        Wallet wallet = new Wallet(new Owner("Owner"), null, 0.0);
        wallet.addCards("Bank A", 123789456);
        wallet.setCash(150000);
        wallet.withdraw(50000);
        wallet.deposit(100000);
        assertEquals(200000, wallet.getCash());
    }
}