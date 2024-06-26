public class Temperaturumwandler {
    public static void main(String[] args) {
        float wert = Integer.parseInt(args[0]);
        float wandler = (wert * 9 / 5) + 32;
        System.out.println(wert + " Grad sind umgerechnet " + wandler + " Fahrenheit");
    }
}
