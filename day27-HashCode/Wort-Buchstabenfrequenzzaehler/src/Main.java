import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
    //1. Aufgabe - Wort in Buchstaben aufteilen:
        String zielwort = "SuperCode";
        HashMap<String, Integer> buchstabe = new HashMap<>();
        addZielwort(zielwort,buchstabe);
        printCountChar(buchstabe,"c");
        printCountChar(buchstabe,"s");
        printAllChars(buchstabe);

        //2.Aufgabe - häufigkeit eines Wortes in einem String
        HashMap<String,Integer> wordsFromText = new HashMap<>();
        String zielText =
                "Ich sitz im Zug, mein Arsch tut weh, ich fahr noch lang, ohje ohje. Paar Worte mehr zum Testen: weh, lang, lang, Ohje";
        addTextToHashmap(zielText,wordsFromText);
        printAllWordsWithCount(wordsFromText);
    }
    public static void addZielwort(String zielwort,HashMap<String,Integer>map){
        for(int i = 0; i < zielwort.length(); i++){
            String b = String.valueOf(zielwort.toLowerCase().charAt(i));
            if (map.get(b) == null){
                map.put(b,1);
            }else {
                map.put(b,map.get(b)+1);
            }
        }
    }
    public static void printCountChar(HashMap<String,Integer>map,String buchstabe){
        System.out.println(map.get(buchstabe));
    }
    public static void printAllChars(HashMap<String,Integer>map){
        for(Map.Entry<String,Integer> entry : map.entrySet()) {
            System.out.println("Buchstabe  " + entry.getKey() + ": " + entry.getValue());
        }
    }
    public static void addTextToHashmap(String text, HashMap<String,Integer> map){
        String newText = text.replaceAll("[-+.^:,?!]", "");
        String[]words = newText.toLowerCase().split(" ");
        for(String w : words){
            if(map.get(w) == null) map.put(w,1);
                else {
                    map.put(w,map.get(w)+1);
            }
        }
    }
    public static void printAllWordsWithCount(HashMap<String,Integer> map){
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}