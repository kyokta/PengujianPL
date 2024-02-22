package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WalletTest {
    @Test
    public void testOwner(){
        Wallet wallet = new Wallet(new Owner("Nama", 17), null, 0.0);
        assertEquals("Nama", wallet.getOwner().getNama());
    }

}