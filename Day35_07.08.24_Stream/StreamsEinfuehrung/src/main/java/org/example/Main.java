package org.example;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // 1. gerade Zahlen filtern
        List<Integer> zahlen = List.of(1,1,2,3,4,4,5,6,7,8,9);
        zahlen
                .stream()
                .filter((z) -> z % 2 == 0)
                .forEach(System.out::println
                );
        System.out.println("-----------");

        // 2. Zeichenkette in Großbcuhstaben umwandeln
        List<String> listString = List.of(
                "halloo ", "zana ", "oder ", "ahmed ", "oder ", "wer ", "auch ","immer ", "das ", "liest!");
        listString
                .stream()
                .map(String::toUpperCase)
                .forEach(System.out::print);
        System.out.println();

        System.out.println("-----------");

        // 3.Summe einer Liste aus Zahlen
        int sum = zahlen
                .stream()
                .mapToInt(i -> i)
                .sum();

        System.out.println(sum);
        System.out.println("-----------");

        //4. Duplikate entfernen
        zahlen
                .stream()
                .distinct()
                .forEach(System.out::print);
        ;
        System.out.println();
        System.out.println("-----------");

        // 5.Durchschnitt der Liste
        double avgZahlen = zahlen
                .stream()
                .mapToInt(i ->i)
                .average()
                .getAsDouble();
        System.out.println(avgZahlen);
        System.out.println("-----------");

        //6. Zeichenkette der Länge sortieren
        listString
                .stream()
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.toList())
                .forEach(System.out::print);
        System.out.println();
    }
}