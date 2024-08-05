package org.example;

import java.lang.reflect.Type;

public class StringCompressor {
    public static String compressWithFor(String string){
        for (int i = 0; i < string.length()-1; i++){
            if (Character.isDigit(string.charAt(i))) {
                if(string.charAt(i+1) == string.charAt(i+2)){
                    string.replace(string.charAt(i),string.charAt(string.charAt(i)+1));
                }
            }
        }
        return
    }
    public static String compress(String string){
        int index = 0;
        int counter = 1;
        if (index >= (string.length()-1)) {
            return string;
        }else {
            if (string.charAt(index) == string.charAt(index + counter)) {
                counter++;
                string.replace(string.charAt(index), (char)counter);
            } else {
                index++;
            }
                return compress(string,index,counter);
        }
    }
    public static String compress (String string, int index, int counter){
        if (index >= (string.length()-1)) {
            return string;
        }else {
            if (string.charAt(index) == string.charAt(index + counter)){
                counter++;
                string.replace(string.charAt(index), (char)counter);
            }else{
                index++;
                counter = 1;
            }
                return compress(string,index,counter);
        }
    }
}
