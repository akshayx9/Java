package Collection.Cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterators {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1; i<=10;i++){
            list.add(i);
        }
        System.out.println(list);
        System.out.println("*********");

        Iterator<Integer> itr=list.iterator();
        while(itr.hasNext()){
            Integer i1=(Integer)itr.next();
            System.out.println(i1);
            if(i1%2==0){
                System.out.println(i1);
            }else{
                itr.remove();
            }
            System.out.println("Final List:"+list);
        }
    }
}
