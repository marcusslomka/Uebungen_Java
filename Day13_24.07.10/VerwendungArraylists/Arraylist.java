import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> zahlen = new ArrayList<>();

        zahlen.add(1);
        zahlen.add(2);
        zahlen.add(-333);
        zahlen.add(44);
        zahlen.add(5000);

        zahlen.remove(1);

        System.out.println(zahlen.size()); //größe ausgeben
        System.out.println(zahlen.get(1)); //2. position ausgeben
        for (Integer zahl : zahlen) { //alle Elemente ausgeben

            System.out.print(zahl);
        }
        System.out.println("-------------------------------------------------------------------------");
        zahlen.sort(Comparator.reverseOrder()); //
        for (Integer zahl : zahlen) {

            System.out.println(zahl);
        }

        System.out.println(zahlen.contains(1));
        System.out.println("-------------------------------------------------------------------------");
        List<Integer> neueArrayList = zahlen.subList(1, 3);
        printMyList(zahlen);
        printMyList(neueArrayList);

        int[] data = {1, 5, 6, 11, 3, 15, 7, 8, 12, 21, 9, 1038};
        ArrayList<Integer> geradeZahlen = new ArrayList<>();
        ArrayList<Integer> ungeradeZahlen = new ArrayList<>();
        for (Integer zahl : data) {
            if (zahl % 2 == 0) {
                geradeZahlen.add(zahl);
            } else {
                ungeradeZahlen.add(zahl);
            }
        }
        printMyList(geradeZahlen);
        printMyList(ungeradeZahlen);

        
    }
    public static void printMyList(List<Integer> myList) {
        for (Integer zahl : myList) {

            System.out.println(zahl);
        }
        System.out.println("-------------------------------------------------------------------------");
    }
    
}
