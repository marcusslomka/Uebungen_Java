package org.example;

import java.awt.*;
import java.util.Comparator;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // 1. Liste von Listen zu einer einzigen Liste "flach machen"
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1,2),
                Arrays.asList(3,4),
                Arrays.asList(5,6)
        );
        List<Integer>ergebnisListe = listOfLists
                .stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(ergebnisListe);

    }
}