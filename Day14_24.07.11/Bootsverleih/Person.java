import java.util.ArrayList;

public class Person {
    private String name;
    private boolean hasLicence;
    private ArrayList<Reservation> reservierungen;
    private int id;

    public Person(String name, boolean hasLicence, int newId) {
        this.name = name;
        this.hasLicence = hasLicence;
        this.id = newId;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }
    public boolean hasLicence() {
        return this.hasLicence;
    }

    //Array von reservierungen abfragen
    //
    public Boot favBoot(Bootsverleih bootsverleih) {
        Boot favBoot = bootsverleih.getBoote().get(0);
        int counterFavBoot = 0;
        //System.out.println(bootsverleih.getBoote().size());
        for (Boot b : bootsverleih.getBoote()) {
            int bootCount = 0;
            for (Reservation r : b.getReservations()) {
                if (this.id == r.getPerson().getId()) {
                    bootCount++;
                }
            }
            if (bootCount > counterFavBoot) {
                favBoot = b;
                counterFavBoot = bootCount;
            }
        }
        return favBoot;
    }
}
