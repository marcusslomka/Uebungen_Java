public class Summe {
    public static void main(String[] args) {
        System.out.println(sumFirstNumbers(20));
    }

    public static int sumFirstNumbers(int n) {
        if (n == 1)
            return 1;
        return n + sumFirstNumbers(n - 1);
    }
}
