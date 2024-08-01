import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> names = new HashSet<>();
        while (true){
            System.out.println("------------------------");
            System.out.println("Bitte gib einen -Namen- ein, " );
            System.out.println("-Ende- für das beenden oder " );
            System.out.println("-Liste- zum ausgeben der Liste: " );
            String input = scanner.next();
            if (input.equals("Ende")) {
                System.out.println("Das Programm wird beendet, bis Baldrian");
                break;
            } else if (input.equals("Liste")) {
            System.out.println(names);
            } else if (!names.add(input)) {
                System.out.println("Name ist bereits in der Liste!");
            }
        }
    }
}