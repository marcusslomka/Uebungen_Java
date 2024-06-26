public class SchleifenUmwandeln {
    //  1.Teil der Aufgabe
    public static void main(String[] args) {
        // gegebene For-Schleife
    
        int summe = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Durchlauf: " + i);
            summe +=i;
        }
        System.out.println(summe);
        
        // umgewandelte While-Schleife 
        
        summe = 0;
        int u = 0;
        while (u < 10) {
            summe += u;
            System.out.println("Durchlauf: " + u);
            u++;
        }
        System.out.println(summe);
        
    }
    
}