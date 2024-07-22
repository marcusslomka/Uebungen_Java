package Hangman;
import java.util.ArrayList;

public class Suchwoerter {
    ArrayList<String> suchwoerter;
    
    
    public void addSuchwort(String suchwort) {
        suchwoerter.add(suchwort);
    }
    
    public String getSuchwort(int i) {
        return suchwoerter.get(i);
    }
}
