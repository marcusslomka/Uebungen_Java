public class Wald {
    
    public int waldSize(boolean isNadelbaum) {
        int count =0;
        if (isNadelbaum) {
            for (int i = 0; i < this.trees.length; i++) {
                if (getIsNadelbaum()) {
                    int count++;
                }
            }
        }
        else{
            for (int i = 0; i < this.trees.length; i++) {
                if (getIsNadelbaum() == false ){
                    int count++;
                }
            }
        }
        return count;
    }
}
