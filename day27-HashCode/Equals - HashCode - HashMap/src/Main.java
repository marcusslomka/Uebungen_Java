import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Buch buch1 = new Buch("Frodo und der Stein der Weisen", "J.K.Schmoling","01234");
        Buch buch5 = new Buch("Frodo und der Stein der Weisen", "J.K.Schmoling","01238");
        Buch buch2 = new Buch("Harry Potter und ein Ring", "J.K.Trolling","01235");
        Buch buch3 = new Buch("Harry Otter und die Kammer des Fisches", "J.K.Moling","01236");
        Buch buch4 = new Buch("Wieso bin ich so?", "J.K.Ling","01237");

        System.out.println(buch1.equals(buch2)); //alle false
        System.out.println(buch2.equals(buch4));
        System.out.println(buch2.equals(buch4));

        HashMap<Buch,Integer> buchverwaltung= new HashMap<>();

        addBuch(buch1, buchverwaltung);
        addBuch(buch5,buchverwaltung);
        addBuch(buch3,buchverwaltung);
        addBuch(buch2,buchverwaltung);
        addBuch(buch4,buchverwaltung);

        System.out.println(buchverwaltung.get(buch5));
        removeBuch(buch5,buchverwaltung);

        System.out.println(buchverwaltung.get(buch5));
        //removeBuch(buch5,buchverwaltung);
        System.out.println(buchverwaltung.get(buch5));

        System.out.println(buch1);

        System.out.println(buchverwaltung.containsValue(1));

        for(Map.Entry<Buch,Integer> entry : buchverwaltung.entrySet()){
            System.out.println(entry.getKey() + " || Exemplare : " + entry.getValue());
        }

        System.out.println("---------------------------");
        HashMap<String,Integer> istEgal = new HashMap<>();
        istEgal.put("Andreas",38);
        istEgal.put("Christian",37);

        System.out.println(istEgal.get("Andreas"));
        istEgal.put("Andreas",28);
        System.out.println(istEgal.get("Andreas"));
    }

    public static void addBuch(Buch buch, HashMap<Buch,Integer> buchverwaltung){
        if(buchverwaltung.get(buch) == null){
            buchverwaltung.put(buch,1);
        } else {
                buchverwaltung.put(buch,buchverwaltung.get(buch)+1);
            }
    }
    public static void removeBuch(Buch buch, HashMap<Buch,Integer> map){
        if(map.get(buch) > 1) {
            map.put(buch,map.get(buch)-1);
        } else{
            map.remove(buch);
        }
    }
}
