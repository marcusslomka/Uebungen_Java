package Hangman;
import java.util.ArrayList;
import java.util.Scanner;

public class HangmanMain {
    public static final int VERSUCH = 3;

    public static void main(String[] args) {
        Suchwoerter suchwort = new Suchwoerter();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Herzlich Willkommen zu einer neuen Runde Hangman!!");
            System.out.println("Das zu erratende Wort wird soeben generiert.");

            suchwort.addSuchwort("Hallo");
            // System.out.println(suchwort.getSuchwort(0));
            System.out.println(suchwort.suchwoerter.size());
            break;
        }

    }

}