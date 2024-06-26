public class MathBibliothek {
    public static void main(String[] args) {
        //java.lang.Math
        //Quadratwurzel
        double wert1 = Integer.parseInt(args[0]);
        double quadratwurzel = Math.sqrt(wert1);
        System.out.println("die Quadratwurzel aus " + wert1 + " ist " + quadratwurzel);

        //Potenzieren
        double wert2 = Integer.parseInt(args[1]);
        double potenz = Math.pow(wert2, 5);
        System.out.println("5 mit " + wert2 + " potenziert ergibt " + potenz);

        //Absolute Zahl berechnen
        double wert3 = Integer.parseInt(args[2]);
        double absoluteZahl = Math.abs(wert3);
        System.out.println("Der absolute Wert von " + wert3 + " ist " + absoluteZahl);

        //runden
        double wert4 = Integer.parseInt(args[3]);
        double runden = Math.round(wert4);
        System.out.println( wert4 + " ist gerundet " + runden);

        //zufällige Zahl
        double zufälligeZahl = Math.random();
        System.out.println("Die zufällig Generierte Zahl ist " + zufälligeZahl);

        //Log
        double wert5 = Integer.parseInt(args[4]);
        double logarithmus = Math.log(wert5);
        System.out.println("Der Logarithmus von " + wert5 + " ist " + logarithmus);
    }
}
