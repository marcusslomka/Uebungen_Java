public class Fahrer {
    private String vorname;
    private String nachname;
    private int alter;

    public Fahrer(String vorname, String nachname, int alter) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
    }
    //Getter für vorname
    public String getVorname() {
        return vorname;
    }

    // Setter für vorname
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    // Getter für nachname
    public String getNachname() {
        return nachname;
    }

    // Setter für nachname
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    // Getter für alter
    public int getAlter() {
        return alter;
    }

    // Setter für alter
    public void setAlter(int alter) {
        this.alter = alter;
    }

    public void fahren(Auto auto, int kilometer) {
        if (this.alter < 18)
            throw new IllegalStateException("Fahrer zu jung!");
        if (kilometer < 0)
            throw new IllegalArgumentException("gefahrene Kilometer unter 0 - unzulässig!");
        double tankverbrauch = kilometer * (auto.getVerbrauch() / 100);
        if (tankverbrauch > auto.getTankinhalt())
            throw new IllegalStateException("Gehe mal Tanken, Kollegeeee!");
        if (auto.pruefservice(kilometer) == true)
            throw new IllegalStateException("im laufe dieser strecke muss das auto geprüft werden!");

        auto.setKilometerstand(auto.getKilometerstand() + kilometer);
        auto.setTankinhalt(auto.getTankinhalt() - tankverbrauch);
    }
}
