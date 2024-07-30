import java.time.LocalDateTime;
import java.time.Month;

public class Main {
    
    public static void main(String[] args) {
        Bootsverleih marcusBootsverleih = new Bootsverleih();

        Boot boot1 = new Boot("Segelboot", 4, false, 20);
        Boot boot2 = new Boot("Motorboot", 4, false, 36);
        Boot boot3 = new Boot("Motorboot", 2, true, 28);
        Boot boot4 = new Boot("Segelboot", 16, true, 92);
        Boot boot5 = new Boot("Segelboot", 2, false, 16);

        marcusBootsverleih.addBoot(boot1);
        marcusBootsverleih.addBoot(boot2);
        marcusBootsverleih.addBoot(boot3);
        marcusBootsverleih.addBoot(boot4);
        marcusBootsverleih.addBoot(boot5);

        Person andreas = new Person("Andreas", true, 1);
        Person anton = new Person("Anton", true, 2);
        Person peter = new Person("Peter", false, 3);

        LocalDateTime sonnabend12 = LocalDateTime.of(2024, Month.JULY, 13, 12, 0);
        LocalDateTime sonntag11 = LocalDateTime.of(2024, Month.JULY, 14, 11, 0);
        LocalDateTime sonntagNach11 = LocalDateTime.of(2024, Month.JULY, 14, 11, 1);
        LocalDateTime montag12 = LocalDateTime.of(2024, Month.JULY, 15, 12, 0);
        
        // boot3.addReservation(sonnabend12, sonntag11, peter); // Licence required!

        boot3.addReservation(sonnabend12, sonntag11, andreas);

        boot3.addReservation(sonntagNach11, montag12, anton);

        boot3.printReservations();

        System.out.println(boot1.getRentCount());

        System.out.println("------------------------------------------");

        //favboot einer Person ermitteln
        System.out.println(peter.favBoot(marcusBootsverleih));

        System.out.println("------------------------------------------");
    }
}
