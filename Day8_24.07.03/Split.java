public class Split{
    public static void main(String[] args){
        System.out.print(splitter("Hallo i bims der maggus", "i"));

    }

    public static String[] splitter(String input, Char dislimiter) {
        String output[] = new String[input.length()];
        for (int i = 0; i < input.length(); i++) {
            int StelleArray = 0;
            if (input.charAt(i)!= dislimiter){
                output[StelleArray] += input.charAt(i);
            } else {
                StelleArray ++;
            }
        }return output[]
    }

    public static void ausgabe(String output[]) {
        for (int i = 0; i < output.length(); i++) {
            System.out.println(output[i]);
        }
    }
}