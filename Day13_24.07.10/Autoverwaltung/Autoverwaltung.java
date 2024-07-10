import javax.swing.text.View;

public class Autoverwaltung {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Vw", 2010, 14001);

        Fahrer fahrer1 = new Fahrer("Marcus", "Slomka", 27);

        auto1.tanken(50);
        System.out.println(auto1.getDetails());
        
        
        fahrer1.fahren(auto1, 100);
        System.out.println(auto1.getDetails());

        System.out.println(auto1.reichweiteBerechnen());

    }
}
