public class Potenz {
    public static void main(String[] args) {
        System.out.println(potenz(3, 5));
    }

    public static int potenz(int basis, int exponent) {
        if (exponent == 0)
            return 1;
        return basis * potenz(basis, exponent - 1);
    }
}
