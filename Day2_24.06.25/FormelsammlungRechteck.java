public class FormelsammlungRechteck {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int umfang_u = 2 * a + 2 * b;
        int flächeninhalt_A = a * b;
        double diagonallänge_d = Math.sqrt((a * a )+ (b * b));
        double umkreisradius_r = diagonallänge_d / 2;
        
        System.out.println("Umfang: " + umfang_u);
        System.out.println("Flächeninhalt: " + flächeninhalt_A);
        System.out.println("Diagonallänge: " + diagonallänge_d);
        System.out.println("Radius: " + umkreisradius_r);

    }
}
