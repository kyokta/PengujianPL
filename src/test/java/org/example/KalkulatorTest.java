package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class KalkulatorTest {
    int nilai1, nilai2;
    Kalkulator kalk;

    @BeforeAll
    void initClass() {
        nilai1 = 2;
        nilai2 = 3;
    }

    @BeforeEach
    void initMethod() {
        kalk = new Kalkulator(nilai1,nilai2);
    }

    @Test
    void testPenjumlahanNilai() {
        nilai1 += nilai2;
        assertEquals(2, kalk.penjumlahan());
    }

    @Test
    void testPenguranganNilai(){
        nilai1 -= nilai2;
        assertEquals(-1, kalk.pengurangan());
    }

    @AfterEach
    void cleanMethod() {
        kalk = null;
    }

    @AfterAll
    void cleanClass() {
        //
    }
}