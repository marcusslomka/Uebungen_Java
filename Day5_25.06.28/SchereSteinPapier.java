import java.util.Scanner;

public class SchereSteinPapier {
    //*Vorwarnung: der Bot ist gehässig, konnte ich nicht beeinflussen */
    public static void main(String[] args) {
        //implementieren des Scanners
        Scanner scanner = new Scanner(System.in);

        //Spielschleife
        System.out.println("Hallo und Willkommen beim Schere Stein Papier Spiel!");
        while (true) {
            System.out.println("Deine Wahl: 0: Schere , 1: Stein , 2: Papier oder 3: Beenden");
            int zugInput = scanner.nextInt(); //Input wird eingelesen

            //Falls beendet werden soll, wird dies hier abgefragt und eingeleitet
            if (zugInput == 3) {
                System.out.println("Das Spiel wurde beendet! Tschüsseldorf");
                break;
            }
            String zeichenSpieler = zugSpieler(zugInput); //Input wird in String umgewandelt
            if (zeichenSpieler == "004") {
                System.out.println("Fehler, bitte erneut deinen Zug eingeben");
            }
            String zeichenBot = zugBot(); //Zahl für den Bot wird generiert, umgewandelt und kommt als String zurück
            spielentscheidung(zeichenSpieler, zeichenBot);
        }
        scanner.close();
        System.out.println("Danke fürs Mitspielen!");
    }
    //Erstellen der Methode ZugSpieler, bei der die Eingabe des Spielers verarbeitet wird
    public static String zugSpieler(int input) {
        if (input == 0) {
            String outputZugSpieler = "Schere";
            return outputZugSpieler;

        } else if (input == 1) {
            String outputZugSpieler = "Stein";
            return outputZugSpieler;

        } else if (input == 2) {
            String outputZugSpieler = "Papier";
            return outputZugSpieler;

        } else if (input == 3) {
            String outputZugSpieler = "Beenden";
            return outputZugSpieler;
            
        }  else { return "004"; }
        
    }
    //Erstellen der Methode ZugBot, bei der der Zug des Bots erstellt wird
    public static String zugBot() {
        int botZahl = (int) Math.floor(Math.random() * 3); //Random Zahl für den Bot wird generiert
        String outputBot = zugSpieler(botZahl);
        return outputBot;
    }
    //Erstellen der Methode Spielentscheidung, bei der die Zeichen von Spieler und bot verglichen werden
    public static void spielentscheidung(String spieler, String bot) {
        if (spieler == bot) {
            System.out.println();
            System.out.println("Unentschieden!! Nächste Runde zählt doppelt!");
            System.out.println();

        } else if (spieler == "Stein" && bot == "Papier" ||
                    spieler =="Papier" && bot == "Schere" ||
                spieler == "Schere" && bot == "Stein") {
            System.out.println();
            System.out.println("Ich gewinne!! You suck hard.. lol");
            System.out.println();
        } else {
            System.out.println();
            System.out.println("Du Gewinnst! Naja ein blindes Huhn findet auch mal ein Korn. Beim nächsten mal gewinne ich wieder!!");
            System.out.println();
        }
        return;
        
    }
}
