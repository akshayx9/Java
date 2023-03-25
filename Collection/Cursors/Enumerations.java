package Collection.Cursors;

import java.util.Vector;
import java.util.Enumeration;

public class Enumerations {
    public static void main(String[] args) {
        Vector<Integer> v=new Vector<>();
        for(int i=1; i<=10; i++){
            v.addElement(i);
        }
        System.out.println(v);

        Enumeration<Integer> e=v.elements();
        while(e.hasMoreElements()){
            Integer i1=(Integer)e.nextElement();
            if(i1%2==0){
                System.out.println(i1);
            }
        }
    }
}
