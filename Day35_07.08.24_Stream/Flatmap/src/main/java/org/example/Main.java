package org.example;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Liste von Listen zu einer einzigen Liste "flach machen"
        ArrayList<ArrayList> großeListe = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> l3 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l2.add(3);
        l2.add(4);
        l3.add(5);
        l3.add(6);
        großeListe.add(l1);
        großeListe.add(l2);
        großeListe.add(l3);
        //Wie kriegt man das kürzer hin?!?

        großeListe
                .stream()
                .;

    }
}