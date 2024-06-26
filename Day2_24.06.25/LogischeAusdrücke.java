public class LogischeAusdrücke {
    public static void main(String[] args) {
        // 1.   zwischen 10 und 20
        int a = 8;
        boolean ergebnis = a > 10 && a < 20; 
        //System.out.println(ergebnis);

        // 2.   Person zwischen 18-25 oder älter als 65
        a = 23;
        ergebnis = (a > 18 && a < 25) || a > 65;
        //System.out.println(ergebnis);

        // 3.   min. 2 von 3 Zahlen sind positiv
        a = -2;
        int b = -4;
        int c = -9;
        ergebnis = (a > 0 && b > 0) || (a > 0 && c > 0) || (b > 0 && c > 0);
        //System.out.println(ergebnis);
        //System.out.println(c);

        // 4.   Ausdruck ist wahr, wenn die Zahl weder durch 2 noh 3 teilbar ist
        a = 13;
        ergebnis = !((a % 2 == 0) || (a % 3 == 0));
        int test = a % 2;
        //System.out.println(ergebnis);
        //System.out.println(test);

        // 5.   a,b und c sind alle 0
        a = 0;
        b = 0;
        c = 5;
        ergebnis = a == 0 && b == 0 && c == 0;
        //System.out.println(ergebnis);

        // 6.   a,b und c haben den gleichen Wert
        a = 0;
        b = 0;
        c = 5;
        ergebnis = a == b && a == c;
        //System.out.println(ergebnis);
        
        // 7.   genau eins von a,b und c ist falsch
        boolean d = false;
        boolean e = true;
        boolean f = true;
        ergebnis = (d == false && e == true && f == true) || (d == true && e == false && f == true) || (d == true && e == true && f == false);
        //System.out.println(ergebnis);
        
        // 8.   a ist ein vielfaches von 2 und 7 || ein vielfaches von 7 und 11
        a = 80;
        ergebnis = (a % 2 == 0 && a % 7 == 0) || (a % 7 == 0 && a % 11 == 0);
        //System.out.println(ergebnis);

        // 9.   d,e und f ist alle false oder alle true
        d = true;
        e = true;
        f = true;
        ergebnis = (d == true && e == true && f == true) || (d == false && e == false && f == false);
        System.out.println(ergebnis);
        
    
        
    }
}
