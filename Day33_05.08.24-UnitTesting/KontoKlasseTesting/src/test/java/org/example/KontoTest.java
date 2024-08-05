package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KontoTest {

    @Test
    void einzahlenUndSaldoAbfragen() {
        Konto k1 = new Konto("DE12334", 100);
        k1.einzahlen(20);
        assertEquals(120, k1.getSaldo());
    }
    @Test
    void abhebenUndFehlerwurfSaldoUeberschreitung() {
        Konto k1 = new Konto("DE12334", 100);
        k1.abheben(20);
        assertEquals(80, k1.getSaldo());
        assertThrows(IllegalArgumentException.class,()->{
            k1.abheben(200);
        });
    }
    @Test
    void ueberweisenUndThrowBeiSaldoUeberzugMitWeitererUeberweisung(){
        Konto k1 = new Konto("DE123445",100);
        Konto k2 = new Konto("DE123645",100);
        k1.ueberweisen(k2,50);
        assertEquals(50,k1.getSaldo());
        assertEquals(150,k2.getSaldo());
        assertThrows(IllegalArgumentException.class,()->{
            k1.ueberweisen(k2,51);
        });
    }
    @Test
    void pruefeNegativeUeberweiungSollScheitern(){
        Konto k1 = new Konto("DE123445",100);
        Konto k2 = new Konto("DE123645",100);
        assertThrows(IllegalArgumentException.class,()->{
            k1.ueberweisen(k2,-20);
        });
    }
}