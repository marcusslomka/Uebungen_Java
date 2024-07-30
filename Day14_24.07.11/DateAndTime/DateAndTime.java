import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateAndTime {
    public static void main(String[] args) {

        //1.Akutelles Datum und Uhrzeit
        LocalDateTime todayTime = LocalDateTime.now();

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd | MM | yyyy | - HH |mm");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("HH:mm - dd.MM.yyyy");

        System.out.println(todayTime.format(format1));
        System.out.println(todayTime.format(format2));

        //2.verschieben in Vergangenheit/Zukunft
        LocalDateTime firstDate = LocalDateTime.now().plusDays(5);
        System.out.println(firstDate.format(format1));

        LocalDateTime secondDate = LocalDateTime.now().minusDays(5);
        System.out.println(secondDate.format(format1));

        //3.Alter berechnen
        LocalDateTime todayDate = LocalDateTime.now();
        LocalDateTime birthday = LocalDateTime.of(1997, 1, 17, 18, 0, 0);
        System.out.println(birthday);

        Period alter = Period.between(birthday.toLocalDate(), todayDate.toLocalDate());
        System.out.println(alter.getDays()); //??????
        
        
    }
}