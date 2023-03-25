package Collection.List;

import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
    LinkedList<Integer> list=new LinkedList<>();
        list.add(50);
        list.add(100);
        list.add(null);
        list.add(200);
        list.set(0,10);
        System.out.println(list);
        list.removeLast();
        list.addFirst(600);
        System.out.println(list);
}
}
