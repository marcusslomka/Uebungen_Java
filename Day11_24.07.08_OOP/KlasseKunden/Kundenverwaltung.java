public class Kundenverwaltung {
    public static void main(String[] args) {
        Kunde kunde0 = new Kunde(0, "Peter", "peter@email.com",12345678);
        Kunde kunde1 = new Kunde(1, "Elizabeth", "elizabeth@email.com", 4123123);
        Kunde kunde2 = new Kunde(2, "Puala");
        Kunde kunde3 = new Kunde(3, "Ingo", "ingo@email.com");
        
        System.out.println(kunde0.toString());
        System.out.println(kunde1.toString());
        System.out.println(kunde2.toString());
        System.out.println(kunde3.toString());
        
    }
}
