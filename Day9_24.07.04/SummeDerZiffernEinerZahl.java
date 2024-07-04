public class SummeDerZiffernEinerZahl {
    public static void main(String[] args) {
        System.out.println(sum(456789));
    }

    public static int sum(int zahl) {
        if (zahl < 10)
            return zahl;
        return zahl % 10 + sum(zahl / 10);  // 3+sum(123/10) = 3+sum(12)
                                            // 2+sum(12/10) = 2+1
    }
}
