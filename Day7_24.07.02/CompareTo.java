public class CompareTo {
    public static void main(String[] args) {
        System.out.println(compareToNachbau("Hallo", "Hall"));
        System.out.println(.CompareTo("Hallo", "Welt"));
    }

    public static int compareToNachbau(String s1, String s2) {
        int lengthSchleife = 0;
        if (s1.length() <= s2.length()) {
            lengthSchleife = s1.length();
        } else
            lengthSchleife = s2.length();

        for (int i = 0; i < lengthSchleife; i++) {
            if (s1.charAt(i) < s2.charAt(i)) {
                return -1;
            } else if (s1.charAt(i) > s2.charAt(i)) {
                return 1;
            }
        }
        return 0;
    }
}
