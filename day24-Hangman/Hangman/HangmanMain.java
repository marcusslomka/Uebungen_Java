package Hangman;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HangmanMain {
    public static final int VERSUCH = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <String> suchwoerter = new ArrayList<>();
        suchwoerter.add("Suchwort1");
        suchwoerter.add("Suchwort2");

        while (true) {
            System.out.println("Herzlich Willkommen zu einer neuen Runde Hangman!!");
            System.out.println("Das zu erratende Wort wird soeben generiert.");
            System.out.println((int) Math.random() * suchwoerter.size()+1);
            String suchwort = suchwoerter.get((int) Math.random() * suchwoerter.size()+1);
        }

    }

}