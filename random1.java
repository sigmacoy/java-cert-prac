import java.util.*;

public class random1 {
    public static void main(String[] args) {
        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // 1. Initializes a 2x2 arraylist
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        
        for (int i = 0; i < 2; i++) {
            list.add(new ArrayList<>());
            for (int j = 0; j < 2; j++) {
                list.get(i).add(0); 
            }
        }
        
        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // 2. 2x2 Array modify the arr[0][0] to be -1
        list.get(0).set(0, -1);
        

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        // 3.
    }
}