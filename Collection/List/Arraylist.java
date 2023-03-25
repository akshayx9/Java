package Collection.List;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(65);
        list.add(300);
        list.add(200);
        list.add(null);
        list.add(200);
        System.out.println(list);//[A,300,200,null,200]

        list.remove(0);//to remove an entry
        System.out.println(list);//[300,200,null,200]
        System.out.println(list.get(2));

        list.set(3, 400);//to replace an element
        System.out.println(list);

    }
}
