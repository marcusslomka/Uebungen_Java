package org.example;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Greet> greetList = List.of(
                new Greet("Anna Bauer", 11, true),
                new Greet("Vittorio De-Marzi", 34, false),
                new Greet("Zana Prka", 18, true),
                new Greet("Bob Baumeister", 55, false),
                new Greet("Hugo Maier", 10, false),
                new Greet("Beate Strohmeier", 7, true)
        );

        // Vornamen aller volljährigen Personen in einer Liste
        // Grußformel für alle weiblichen Personen in die Konsole ausgeben
        // Grußformel der Ältesten Person in einer String-Variable speichern
        // Durchschnittliche Alter in einem Double
        // Liste der Nachnamen aller Personen

         greetList
                 .stream()
                 .filter((g) -> g.getAlter() > 17)
                    .forEach((g) -> g.greetMe());
    }
}