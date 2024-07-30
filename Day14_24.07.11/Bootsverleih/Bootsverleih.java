import java.util.ArrayList;

public class Bootsverleih {
    private ArrayList<Boot> boote;
    private ArrayList<Person> kunden;
    private double umsatz;

    //STANDART-KONSTRUKTOR
    public Bootsverleih() {
        this.boote = new ArrayList<>();
        this.kunden = new ArrayList<>();
    }

    public ArrayList<Boot> getBoote() {
        return this.boote;
    }
    // the customer with the most reservation (count)
    public Person topCustomer() {
        return null;
    }

    public void addBoot(Boot newBoot) {
        boote.add(newBoot);
    }
}
