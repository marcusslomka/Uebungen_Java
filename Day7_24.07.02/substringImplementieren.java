public class substringImplementieren {
    public static void main(String[] args) {
        String s = "Programmieren";
        String sub = substring(s, 1, 5);
        System.out.println(sub);
    }

    public static String substring(String s, int firstTouch, int lastTouch) {
        String ausgabe = "";
        for (int i = firstTouch; i < lastTouch; i++) {
            char sub = s.charAt(i);
            ausgabe += sub;
        }
        return ausgabe;
    }
}
