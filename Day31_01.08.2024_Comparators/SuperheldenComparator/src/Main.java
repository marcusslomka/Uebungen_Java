import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Superheld> heldenListe = new ArrayList<>();
        heldenListe.add( new Superheld("Hulk",10,1,Kategorie.HERO));
        heldenListe.add( new Superheld("Superman",9,7,Kategorie.HERO));
        heldenListe.add( new Superheld("Catwoman",9,3,Kategorie.HERO));
        heldenListe.add( new Superheld("Ironman",6,10,Kategorie.HERO));
        heldenListe.add( new Superheld("Zana",10,10,Kategorie.HERO));
        heldenListe.add( new Superheld("Christian",10,10,Kategorie.HERO));

        heldenListe.sort(ComparatorHero.powerLevelComparator.thenComparing(ComparatorHero.speedComparator).thenComparing(ComparatorHero.nameComparator));
        for(Superheld h : heldenListe){
            System.out.println(h);
        }
            System.out.println("-----------------------");
        heldenListe.forEach(System.out::println);
    }

}