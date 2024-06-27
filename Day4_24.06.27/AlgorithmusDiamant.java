public class AlgorithmusDiamant {
    public static void main(String[] args) {
        int hight = Integer.parseInt(args[0]);
        int offset = hight -1;
        int character = 1;
        // Pyramide aufrecht
        while (offset >= 0) {
            //For-Schleife für den Abstand
            for (int o = 0; o < offset; o++) {
                System.out.print(" ");
            }
            //For-Schleife für die Zeichen
            for (int c = 0; c < character; c++) {
                System.out.print("#");
            }
            System.out.println();
            offset -= 1;
            character += 2;
        }
        offset = 1;
        // berechnung der characters + direktes abziehen der ersten Zeile, da maximale breite schon im oberen Teil ausgeführt wird
        character = (hight * 2) - 3;
        // Pyramide auf dem Kopf --> selbe funktion wie oben nur herunterzählend
        while (offset <= hight - 1) {
            for (int o = 0; o < offset; o++) {
                System.out.print(" ");
            }
            for (int c = 0; c < character; c++) {
                System.out.print("#");
            }
            System.out.println();
            offset += 1; 
            character -= 2;
        }
    }
}
