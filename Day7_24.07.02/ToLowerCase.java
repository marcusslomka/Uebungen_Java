public class ToLowerCase {
    public static void main(String[] args) {
        int lengthArgs = args.length;

        for (int i = 0; i < lengthArgs;i++){
            String input = args[i];
            String changedString = ToLowerCase(input);
            System.out.print(changedString + " ");
        }
    }
    public static String ToLowerCase(String input) {
        String output = input.toLowerCase();
        return output;
    }
}
