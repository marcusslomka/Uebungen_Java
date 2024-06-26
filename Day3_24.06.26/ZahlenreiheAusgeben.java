public class ZahlenreiheAusgeben {
    public static void main(String[] args) {
        // 1.   Zahlenreihe 1-100 ausgeben
        int i = 1;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        while (i <= 100) {
            sum1 = sum1 + i;
            if ((i%2) == 0) {
                sum2 = sum2 + i;
            } else {
                sum3 = sum3 + i;
            }
            i++;
        }
        System.out.println("Die Summe aller Zaheln 1-100 = " + sum1);
        System.out.println("Die Summe aller geraden Zahlen von 1-100 = " + sum2);
        System.out.println("Die Summe aller ungerade Zahlen von 1-100 = " + sum3);
    }   

}
