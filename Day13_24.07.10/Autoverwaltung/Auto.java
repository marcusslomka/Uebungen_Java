public class Auto {

    private String marke;
    private int baujahr;
    private int kilometerstand;
    private double tankkapazität;
    private double tankinhalt;
    private double verbrauch;

    public Auto(String marke, int baujahr, int kilometerstand) {
        this.marke = marke;
        this.baujahr = baujahr;
        this.kilometerstand = kilometerstand;
        this.tankkapazität = 50;
        this.tankinhalt = 0;
        this.verbrauch = 7;
    }

    public String getMarke() {
        return this.marke;
    }

    public int getBaujahr() {
        return this.baujahr;
    }

    public int getKilometerstand() {
        return this.kilometerstand;
    }

    public double getTankkapazität() {
        return this.tankkapazität;
    }

    public double getTankinhalt() {
        return this.tankinhalt;
    }

    public double getVerbrauch() {
        return this.verbrauch;
    }

    public void setMarke(String newMarke) {
        this.marke = newMarke;
    }

    public void setBaujahr(int newBaujahr) {
        this.baujahr = newBaujahr;
    }

    public void setKilometerstand(int newKilometerstand) {
        this.kilometerstand = newKilometerstand;
    }

    public void setTankkapazität(double newTankkapazität) {
        this.tankkapazität = newTankkapazität;
    }

    public void setTankinhalt(double newTankinhalt) {
        this.tankinhalt = newTankinhalt;
    }

    public void setVerbrauch(double newVerbrauch) {
        this.verbrauch = newVerbrauch;
    }

    public String getDetails() {
        return "Marke: " + this.marke +
                " Baujahr: " + this.baujahr +
                " KilometerStand: " + this.kilometerstand +
                " Tankinhalt: " + this.tankinhalt;
    }

    public void tanken(double liter) {
        if (liter + this.tankinhalt > this.tankkapazität)
            throw new IllegalArgumentException("zuviel getankt!");
        this.tankinhalt += liter;
    }

    public boolean pruefservice(int kilometer) {
        if (this.kilometerstand + kilometer > 15000)
            return true;
        return false;
    }

    public double reichweiteBerechnen() {
        return (this.tankinhalt / this.verbrauch) * 100;
    }
    
}
