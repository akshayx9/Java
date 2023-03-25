package Collection.Cursors;

import java.util.ArrayList;
import java.util.ListIterator;

public class List_Iterator {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1; i<=10;i++){
            list.add(i);
        }
        
        ListIterator<Integer> itr=list.listIterator();
        while(itr.hasNext()){
            Integer i1=(Integer)itr.next();
            //we can also use itr.previous() & itr.hasPrevious() as the ListIterator is bi-directional
            if(i1==10){
                itr.add(11);
            } if (i1==2){
                itr.set(200);
            }
        }
        System.out.println("Final List:"+list);
    }
}
