public class Fakultaet {
    public static void main(String[] args) {
        System.out.println(fakulteat1(5, 1, 1));
        System.out.println(fakultaet2(5));
    }

    public static int fakulteat1(int n, int index, int ergebnis) {
        if (index > n) {
            return ergebnis;
        }
        ergebnis = ergebnis * index; // 0|0|
        return fakulteat1(n, index + 1, ergebnis);
    }

    public static int fakultaet2(int n) {
        if (n == 0)
            return 1;
        //5*4*3*2*1
        //4*3*2*1
        return fakultaet2(n - 1) * n;
    }
}
