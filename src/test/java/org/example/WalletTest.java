package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class WalletTest {
    private Wallet wallet;

    @BeforeAll
    void setUp() {
        wallet = new Wallet(new Owner("Owner"), null, 0.0);
    }

    @Test
    public void testOwner(){
        wallet.setOwner(new Owner("Owner"));
        assertNotNull(wallet.getOwner());
        assertEquals("Owner", wallet.getOwner().getNama());
    }

    @Test
    public void testSufficientWithdraw(){
        wallet.setCash(200);
        double withdrawnAmount = wallet.withdraw(50.0);
        assertEquals(150.0, withdrawnAmount);
        assertEquals(150.0, wallet.getCash());
    }

    @Test
    public void testInsufficientWithdraw(){
        wallet.setCash(30);
        double withdrawnAmount = wallet.withdraw(50.0);
        assertEquals(0.0, withdrawnAmount);
        assertEquals(30.0, wallet.getCash());
    }

    @Test
    public void testDeposit() {
        wallet.setCash(50);
        double depositedAmount = wallet.deposit(30.0);
        assertEquals(80.0, depositedAmount);
        assertEquals(80.0, wallet.getCash());
    }

    @Test
    public void testAddCard() {
        wallet.addCards("TestBank", 123456789);
        assertNotNull(wallet.getCards());
        assertEquals(1, wallet.getCards().size());
    }

    @Test
    public void testRemoveAllCards() {
        assertNull(wallet.removeAllCards());
        assertEquals(0, wallet.getCards().size());
    }

    @Test
    public void testRemoveCard() {
        wallet.addCards("TestBank", 123456789);
        wallet.addCards("AnotherBank", 987654321);
        int initialSize = wallet.getCards().size();

        wallet.removeCard(123456789);
        assertNotNull(wallet.getCards());
        assertEquals(initialSize - 1, wallet.getCards().size());
    }

    @Test
    public void testSetCash() {
        wallet.setCash(500000);
        assertEquals(500000, wallet.getCash());
        assertNotNull(wallet.getCash());
    }

    @Test
    public void testAll(){
        wallet.addCards("Bank A", 123789456);
        wallet.setCash(150000);
        wallet.withdraw(50000);
        wallet.deposit(100000);
        assertEquals(200000, wallet.getCash());
        assertNotNull(wallet.getCards());
    }
}