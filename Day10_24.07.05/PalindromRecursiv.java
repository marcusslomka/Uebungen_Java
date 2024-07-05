public class PalindromRecursiv {
    public static void main(String[] args) {
        System.out.println(isPalindrom("lagerregal"));
    }

    public static boolean isPalindrom(String input) {
        int länge = input.length();
        
        if ((länge) <= 1) return true;
        if (input.charAt(0) != input.charAt(länge - 1))
            return false;
            String nextInput = input.substring(1, länge-1);
        return isPalindrom(nextInput);
    }
}
