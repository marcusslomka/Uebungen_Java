public class DrawChars {
public static void main(String[] args) {
    int hight = Integer.parseInt(args[0]);
    for (int i = 0; i < hight; i++) {
        for (int j = 0; j <= i; j++) {
            System.out.print("#");
        }
        System.out.println();
    }
}

    /*public static void main(String[] args) {

        int sideLength = Integer.parseInt(args[0]);
        int i = 0;
        int j = 0;

        while (i < sideLength) {
            while (j < sideLength) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }




        /*
        for (int i = 0; i < sideLength; i++) {
            // draw single line loop
            for (int j = 0; j < sideLength; j++) {
                System.out.print("*");
            }
            System.out.print("\n"); // draw \n = new line
        }
    }*/
} 
