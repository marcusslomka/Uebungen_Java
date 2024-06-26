public class Sale {
    public static void main(String[] args) {
        double preis = Integer.parseInt(args[0]);
        double salepreis = preis * 0.66;
        
        

        System.out.println("Rabattierter Preis: " + salepreis + "€");
        System.out.println("Value: %.2f",salepreis);
    
    }
}
