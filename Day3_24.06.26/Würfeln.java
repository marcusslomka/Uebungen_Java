public class Würfeln {
    public static void main(String[] args) {
        //Es soll gewürfelt werden, bis eine 6 kommt!
        int zahl = 0;
        while(zahl != 6){
            zahl = (int) Math.ceil(Math.random() * 6);          //Random Zahl zwischen 0 und 6 wird generiert und aufgerundet
            if (zahl == 6) {
                System.out.println(zahl + " Glückwunsch!");
            } else{
                System.out.println(zahl);
            }
        }
    }
}
