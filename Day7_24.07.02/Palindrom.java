public class Palindrom {
    public static void main(String[] args) {
        System.out.println(checkPalindrom("Amok oma"));
    }

    public static boolean checkPalindrom(String input) {
        input = input.toLowerCase();
        for (int i = 0; i < (input.length() / 2); i++) {
            if (input.charAt(i) == ' ') {
                i++;
            }
            if (input.charAt(i) != input.charAt(input.length() - (i+1))) {
                return false;
            }
        }
        return true;
    }
}
