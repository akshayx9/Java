package Collection.Set;

import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(10);
        set.add(200);
        set.add(100);
        set.add(160);
        set.add(300);
        set.add(null);
        System.out.println(set.add(100));//false
        System.out.println(set);
    }
}
