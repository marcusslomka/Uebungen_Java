public class DrawPyramide {
/*
h=4
   #
  ###
 #####
#######
*/
    public static void main(String[] args) {
        int hight = Integer.parseInt(args[0]);
        int offset = hight - 1;
        int character = 1;

        while (offset >= 0) {

            for (int o = 0; o < offset; o++) {
                System.out.print(" ");
            }
            for (int c = 0; c < character; c++) {
                System.out.print("#");
            }
            System.out.println();
            offset -= 1;
            character += 2;
        }
    }
}
