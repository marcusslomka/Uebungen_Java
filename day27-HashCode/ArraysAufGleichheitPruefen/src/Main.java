import java.sql.Array;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1,2,2,3,4,5,6,7,8,9,10};
        int[] array2 = {1,2,3,4,5,6,7,8,9,2,10};

        System.out.println(addArraysToHashmap(array1, array2));

        /*
        - Arrays auf länge vergleichen!
        - 1. Array der Hashmap hinzufügen
        - 2. der selben HashMap abziehen
            --> ist die HashMap danach leer, sind die Arrays gleich
            - .isEmpty()
        */
    }
    public static boolean addArraysToHashmap(int[] array1, int [] array2) {
        if(array1.length != array2.length) return false;

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < array1.length; i++) {
            if (map.get(array1[i]) == null) {
                map.put(array1[i], 1);
            } else {
                map.put(array1[i], map.get(array1[i]) + 1);
            }
        }
        for (int i = 0; i < array2.length; i++) {
            if (map.get(array2[i]) == null) {
                return false;
            } else {
                map.put(array2[i], map.get(array2[i]) - 1);
                if (map.get(array2[i]) == 0) map.remove(array2[i]);
            }
        }
        return map.isEmpty();
    }
    /*public static boolean compareArrays(HashMap<Integer,Integer> map1,HashMap<Integer,Integer> map2){
        boolean check = false;
        for(Map.Entry<Integer,Integer> entryMap1 : map1.entrySet()){
            check = false;
            for(Map.Entry<Integer,Integer> entryMap2 : map1.entrySet()){
                if(     entryMap1.getKey() == entryMap2.getKey() &&
                        entryMap1.getValue() == entryMap2.getValue()){
                    check = true;
                    continue;
                }
            }
            if (!check) return false;
        }
        return true;
    }*/
}
