public class DrawRect {
    public static void main(String[] args) {

        int height = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        drawRect(width,height);
    }

    public static void drawRect(int width, int height) {
        // drawLine(length, char)
        
        while (height > 0) {
            //drawLine(offset, ' ');
            drawLine(width, '#');
            System.out.print("\n");
            height--;
        }
    }

    public static void drawLine(int length, char lineChar) {

        for (int i = 0; i < length; i++) {
            System.out.print(lineChar);
        }
    }
}
