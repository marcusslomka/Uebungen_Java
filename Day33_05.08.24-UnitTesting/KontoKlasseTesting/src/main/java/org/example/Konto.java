package org.example;

public class Konto {
    private String kontonummer;
    private double saldo;

    public Konto(String kontonummer, double anfangssaldo){
        this.kontonummer = kontonummer;
        this.saldo = anfangssaldo;
    }

    public void einzahlen(double betrag){
        if(betrag < 0) throw new IllegalArgumentException("Betrag muss positiv sein!");
        this.saldo += betrag;
    }
    public void abheben(double betrag){
        if (betrag < 0) throw new IllegalArgumentException("Betrag muss positiv sein!");
        if (this.saldo - betrag < 0) throw new IllegalArgumentException("Das Konto darf nicht überzogen werden!");
        this.saldo -= betrag;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public String getKontonummer(){
        return this.kontonummer;
    }
    public void ueberweisen(Konto zielkonto, double betrag){
        if(betrag < 0) throw new IllegalArgumentException("Betrag muss positiv sein!");
        if ((this.saldo - betrag) < 0) throw new IllegalArgumentException("Das Konto hat nicht genügend Geld um die Überweisung zu tätigen!");
        this.saldo -= betrag;
        zielkonto.einzahlen(betrag);
    }
}
