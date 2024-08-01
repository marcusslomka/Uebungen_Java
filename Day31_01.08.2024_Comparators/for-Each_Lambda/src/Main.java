import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<String> zeichenkette =  Arrays.asList(
                "Was",
                "soll",
                "schon",
                "passieren");
        String zusammengefuehrt = "";
        for(String s : zeichenkette){
            zusammengefuehrt += s;
            zusammengefuehrt += " ";
            System.out.println(zusammengefuehrt);
        }

    }

}