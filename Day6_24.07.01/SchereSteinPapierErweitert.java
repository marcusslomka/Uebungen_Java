import java.util.Scanner;

public class SchereSteinPapierErweitert {
    //*Vorwarnung: der Bot ist gehässig, konnte ich nicht beeinflussen */

    public static final int SCHERE = 0;
    public static final int STEIN = 1;
    public static final int PAPIER = 2;
    public static final int BEENDEN = 3;
    public static final int SPIELER = 4;
    public static final int BOT = 5;
    public static final int UNENTSCHIEDEN = 6;
    public static final int FEHLER = 99;
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hallo und Willkommen beim Schere Stein Papier Spiel!");
        int countSpieler = 0;
        int countBot = 0;
        int countUnentschieden = 0;
        while (true) {
            System.out.println("Deine Wahl: 0: Schere , 1: Stein , 2: Papier oder 3: Beenden");
            int zugInput = scanner.nextInt(); //Input wird eingelesen

            //Falls beendet werden soll, wird dies hier abgefragt und eingeleitet
            if (zugInput == BEENDEN) {
                System.out.println("Das Spiel wurde beendet! Tschüsseldorf");
                break;
            }
            int zeichenSpieler = zugSpieler(zugInput); //Input wird in String umgewandelt
            if (zeichenSpieler == FEHLER) {
                System.out.println("Fehler, bitte erneut deinen Zug eingeben");
            }
            int zeichenBot = zugBot(); 
            int ergebnis = spielentscheidung(zeichenSpieler, zeichenBot);
            ausgabeErgebnis(ergebnis);

            if (ergebnis == SPIELER)
                return countSpieler++;
            if (ergebnis == BOT)
                return countBot++;
            if (ergebnis == UNENTSCHIEDEN)
                return countUnentschieden++;
        }
        scanner.close();
        System.out.println("Danke fürs Mitspielen!");
        System.out.println("Das Endergebnis liegt bei: "/n);
    }
    //Erstellen der Methode ZugSpieler, bei der die Eingabe des Spielers verarbeitet wird
    public static int zugSpieler(int input) {
        if (input == SCHERE) {
            return SCHERE;

        } else if (input == STEIN) {
            return STEIN;

        } else if (input == PAPIER) {
            return PAPIER;
        
        }   else return FEHLER;
        
    }
    //Erstellen der Methode ZugBot, bei der der Zug des Bots erstellt wird
    public static int zugBot() {
        int botZahl = (int) Math.floor(Math.random() * 3); //Random Zahl für den Bot wird generiert
        int outputBot = zugSpieler(botZahl);
        return outputBot;
    }
    //Erstellen der Methode Spielentscheidung, bei der die Zeichen von Spieler und bot verglichen werden
    public static int spielentscheidung(int spieler, int bot) {
        if (spieler == bot){
            return UNENTSCHIEDEN;
        }
        
         else if (
            spieler == STEIN    && bot == PAPIER ||
            spieler == PAPIER   && bot == SCHERE ||
            spieler == SCHERE   && bot == STEIN) {
            
            return SPIELER;

        } else return BOT;
    }
    //
    public static void ausgabeErgebnis(int winner) {

        if (winner == UNENTSCHIEDEN) {
            System.out.println();
            System.out.println("Unentschieden! Neuer Versuch!!");
            System.out.println();

        } else if (winner == SPIELER) {
            System.out.println();
            System.out.println(
                    "Du Gewinnst! Naja ein blindes Huhn findet auch mal ein Korn. Beim nächsten mal gewinne ich wieder!!");
            System.out.println();

        } else if (winner == BOT) {
            System.out.println();
            System.out.println("Ich gewinne!! You suck hard.. lol");
            System.out.println();
        }
    }
}
