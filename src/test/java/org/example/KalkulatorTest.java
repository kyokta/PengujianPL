package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KalkulatorTest {

    @Test
    void penjumlahanNilaiPositive() {
        Kalkulator kalk = new Kalkulator(2,3);
        assertEquals(5, kalk.penjumlahan());
        assertNotNull(kalk.penjumlahan());
    }

    @Test
    void penjumlahanNilaiNegative(){
        System.out.println("negative");
    }
}