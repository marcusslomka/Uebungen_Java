public class Übungsblatt {
    private int nummer;
    private int maxPunkte;
    private int erreichtePunkte;

    public Übungsblatt(int nummer, int maxPunkte, int erreichtePunkte) {
        setNummer(nummer);
        setMaxPunkte(maxPunkte);
        setErreichtePunkte(erreichtePunkte);
    }

    public int getNummer() {
        return this.nummer;
    }
    public int getMaxPunkte() {
        return this.maxPunkte;
    }
    public int getErreichtePunkte() {
        return this.erreichtePunkte;
    }

    public void setNummer(int newNummer) {
        if (newNummer < 1 || newNummer > 14) {
            this.nummer = 61; // mein Fehlerfall
        }
        this.nummer = newNummer;
    }

    public void setMaxPunkte(int newMaxPunkte) {
        if (newMaxPunkte < 0 || newMaxPunkte > 60) {
            this.maxPunkte = 61; // mein Fehlerfall
        }
        this.maxPunkte = newMaxPunkte;
    }

    public void setErreichtePunkte(int newErreichtePunkte) {
        if (newErreichtePunkte < 0 || newErreichtePunkte > 60) {
            this.erreichtePunkte = 61; // mein Fehlerfall
        }
        this.erreichtePunkte = newErreichtePunkte;
    }
    
    public String wiedergabe(){
        return 
        "Übungsblatt: " + this.nummer +
        ", max.Punkte: " + this.maxPunkte + 
        ", erreichte Punkte: " + this.erreichtePunkte;
    }
}
