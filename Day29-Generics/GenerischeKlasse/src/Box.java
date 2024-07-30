public class Box<E>{
    private E generic;

    public void swap (E []array,int index1, int index2){
        E puffer = array[index1];
        array[index1] = array[index2];
        array[index2] = puffer;
    }
}
