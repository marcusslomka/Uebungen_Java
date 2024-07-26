import java.sql.Array;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6,7,8,9,10};
        int[] array2 = {1,2,3,4,5,6,7,8,10};

        HashMap<Integer,Integer> zahlen1 = new HashMap<>();
        HashMap<Integer,Integer> zahlen2 = new HashMap<>();

        addArraysToHashmap(zahlen1,array1);
        addArraysToHashmap(zahlen2,array2);

        System.out.println(compareArrays(zahlen1,zahlen2));


    }
    public static void addArraysToHashmap(HashMap<Integer,Integer> map, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (map.get(array[i]) == null) {
                map.put(array[i], 1);
            } else {
                map.put(array[i], map.get(array[i]) + 1);
            }
        }
    }
    public static boolean compareArrays(HashMap<Integer,Integer> map1,HashMap<Integer,Integer> map2){
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
    }
}
