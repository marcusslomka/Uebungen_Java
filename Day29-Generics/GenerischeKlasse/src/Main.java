public class Main {
    public static void main(String[] args) {
    Integer[] array = {1,2,3,4,5,6,7,8,9,10};
    Box box1 = new Box<Integer>();
    printArray(array);
    box1.swap(array,1,5);
    printArray(array);
    }
    public static void printArray(Integer[] array){
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }
}