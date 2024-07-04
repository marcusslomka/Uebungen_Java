public class SumRecursion {
    public static void main(String[] args) {
        int[] zahlen = { 3, 5, 6, 120, 29, -23, 3 };
        int summe = sum(zahlen,0,0);
        System.out.println(summe);
    }

    public static int sum(int[] number, int index, int summe) {
        if (index >= number.length)
            return summe;
        summe += number[index];
        return sum(number, index + 1, summe);
    }
}
