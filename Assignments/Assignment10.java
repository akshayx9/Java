package Assignments;

import java.util.ArrayList;
import java.util.Iterator;

public class Assignment10 {
    ArrayList<Integer> A1=new ArrayList<>();
    public ArrayList<Integer> storeEvenNumbers(int n) {
        for(int i=1; i<=n; i++){
            if(i%2==0){
                A1.add(i);
            }
        }
        return A1;
    }
    public ArrayList<Integer> printEvenNumbers(ArrayList<Integer> list) {
        ArrayList<Integer> A2=new ArrayList<>();
        Iterator<Integer> itr=list.iterator();
        while(itr.hasNext()){
            Integer i1=(Integer)itr.next()*2;
            A2.add(i1);
        }
        return A2;
    }
    public int retrieveEvenNumber(int N) {
        if(A1.contains(N)==true){
            return N;
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Assignment10 al=new Assignment10();
        ArrayList<Integer> list1=al.storeEvenNumbers(20);
        System.out.println(al.storeEvenNumbers(20));
        System.out.println(al.printEvenNumbers(list1));
        System.out.println(al.retrieveEvenNumber(8));
    }
}
