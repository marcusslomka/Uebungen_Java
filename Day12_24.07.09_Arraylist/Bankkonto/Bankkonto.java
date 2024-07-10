public class Bankkonto {
    private String kontoinhaber;
    private String kontonummer;
    private double kontostand;

    public Bankkonto(String kontoinhaber, String kontonummer, double kontostand) {
        setKontoinhaber(kontoinhaber);
        setKontonummer(kontonummer);
        this.kontostand = 0;
    }
    //einzahlen
    public void einzahlen(double einzahlung) {
        if (einzahlung < 0)
            throw new IllegalArgumentException();
         this.kontostand += einzahlung;
    }
    //auszahlen
    public void auszahlen(double auszahlung) {
        if (auszahlung < 0)
            throw new IllegalArgumentException();
        this.kontostand -= auszahlung;
        
    }
    public String gibKontoinformationen() {
        return 
        "Kontoinhaber: " + this.kontoinhaber +
        " Kontonummer: " + this.kontonummer + 
        " Kontostand: " + this.kontostand;
    }
    
    public String getKontoinhaber() {
        return this.kontoinhaber;
    }
    public String getKontonummer() {
       return this.kontonummer;
    }
    public double getKontostand() {
        return this.kontostand;
    }
    
    public void setKontoinhaber(String newKontoinhaber) {
        this.kontoinhaber = newKontoinhaber;
    }
    public void setKontonummer(String newKontonummer) {
        this.kontonummer = newKontonummer;
    }
    public void setKontostand(double newKontostand) {
        this.kontostand = newKontostand;
    }
}