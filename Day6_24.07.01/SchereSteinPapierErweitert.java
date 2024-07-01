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

    public static int countSpieler = 0;
    public static int countBot = 0;
    public static int countUnentschieden = 0;
    public static int counterRounds = 0;
    public static int winStreakSpieler = 0;
    public static int winStreakBot = 0;
        
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n");
        System.out.println("Hallo und Willkommen beim Schere Stein Papier Spiel!");
        
        
        while (true) {
            System.out.println("Deine Wahl: 0: Schere , 1: Stein , 2: Papier oder 3: Beenden");
            int zugInput = scanner.nextInt(); //Input wird eingelesen

            //Falls beendet werden soll, wird dies hier abgefragt und eingeleitet
            if (zugInput == BEENDEN) {
                System.out.print("\n \n \n");
                System.out.println("Das Spiel wurde beendet!");
                break;
            }
            int zeichenSpieler = zugSpieler(zugInput); //Input wird in String umgewandelt
            if (zeichenSpieler == FEHLER) {
                System.out.println("Fehler, bitte erneut deinen Zug eingeben");
            }
            int zeichenBot = zugBot(); 
            int ergebnis = spielentscheidung(zeichenSpieler, zeichenBot);
            ausgabeGewinner(ergebnis);
            counter(ergebnis);
            counterRounds++;
            abfrageWinStreak();
            ausgabeCounter();
        }
        scanner.close();
        ausgabeEndsieger();
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
    public static void ausgabeGewinner(int winner) {

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
    
    public static void ausgabeCounter() {
        System.out.println("Zwischenstand: Spieler: " + countSpieler);
        System.out.println("Bot: " + countBot);
        System.out.println("Unentschieden: " + countUnentschieden);
        System.out.println("Gesamtrundenanzahl: " + counterRounds);
        System.out.print("\n \n");
    }
    
    public static void ausgabeEndsieger() {
        System.out.println("Endstand:");
        System.out.println("Spieler: " + countSpieler);
        System.out.println("Bot: " + countBot);
        System.out.println("Unentschieden: " + countUnentschieden);
        System.out.println("Gesamtrundenanzahl: " + counterRounds);
        System.out.println();
        if (countSpieler > countBot) {
            System.out.println("Gesamtgewinner bist ..?! du! Herzlichen Glückwunsch.. *klatscht sarkastisch langsam*");
        } else if (countSpieler < countBot) {
            System.out.println("Gesamtgewinner bin wohl mal wieder ich? UNERWARTET! *hängt sich Medaille selbst um*");
        } else {
            System.out.println("UNENTSCHIEDEN??! Nach sovielen Spielen?! *Bot disconnected*");
        }
        System.out.print("\n \n \n");
    }

    public static void abfrageWinStreak() {
        if (winStreakSpieler == 3) {
            countSpieler++;
            winStreakSpieler = 0;
            System.out.println("OMG WHAT A STREAK !! !!! !! !!!!! 3 IN A ROWWWW !!!!! THREEEEEEEEE !!!! ");
            System.out.println();
        } else if (winStreakBot == 3) {
            countBot++;
            winStreakBot = 0;
            System.out.println("OMG WHAT A STREAK !! !!! !! !!!!! 3 IN A ROWWWW !!!!! THREEEEEEEEE !!!! ");
            System.out.println();
        } 
    }

    public static void counter(int ergebnis) {
        if (ergebnis == SPIELER) {      //Counter werden hochegezählt und möglicher Win-Streak erfasst
            countSpieler++;
            winStreakSpieler ++;
            winStreakBot = 0;
        }else if (ergebnis == BOT) {
            countBot++;
            winStreakBot++;
            winStreakSpieler = 0;
        } else if (ergebnis == UNENTSCHIEDEN) {
            countUnentschieden++;
            winStreakBot = 0;
            winStreakSpieler = 0;
        }
    }
}
