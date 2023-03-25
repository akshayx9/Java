package Collection.Collections_Arrays;

import java.util.Arrays;

public class Arrays1 {
    public static void main(String[] args) {
        int[] x={100,30,300};
        System.out.println("Before Sorting");
        for(int y:x){
            System.out.println(y);
        }
        Arrays.sort(x);
        System.out.println("After Sorting");
        for(int y:x){
            System.out.println(y);
        }
        System.out.println(Arrays.binarySearch(x, 300));
    }
}
