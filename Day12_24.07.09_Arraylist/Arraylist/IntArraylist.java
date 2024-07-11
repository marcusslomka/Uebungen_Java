import javax.imageio.IIOException;

public class IntArraylist {
    private int list[10];
    private int countElements = 0;

    public boolean remove(int index) {
        if(0 < index || index > countElements) return false;
            else {
                for(int i =index; i<countElements-1;i++){
                    list[index] = list[index +1]
                }
            }
        countElements --;
        return true;
    }

    public int indexOf(int element) {
        for (int i = 0; i < countElements; i++) {
            if (element == list[i]) {
                return i;
            }
        }
        return -1;
    }

    public IntArrayList slice(int startIndex) {
        for (int i = startIndex + 1; i <= countElements; i++) {
            int j = 0;
            if (startIndex > countElements) {
                return "Empty";
            } else {
                list[j] = list[i];
            }
             j++;
        }
    }

    public IntArraylist slice(int startIndex, int endindex) {
        for (int i = startIndex + 1; i <= endindex; i++) {
            int j = 0;
            if (startIndex > endindex) {
                return throw new IllegalArgumentException();
            } else if (countElements>(startIndex+???)){

            } else {
                list[j] = list[i];
            }
            j++;
        }
    }
}