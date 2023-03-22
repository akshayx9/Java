package Java_Basics;

public class Array {
    public static void main(String[] args) {
    int[] x=new int[3];
    x[0]=100;
    x[2]=300;
    System.out.println(x[0]);
    System.out.println(x[1]);
    System.out.println(x[2]);
    //System.out.println(x[3]); - AIOBE
    //Normal for loop
    for ( int i = 0; i < x.length; i++) {
        System.out.println(x[i]);
    }
    //for-each loop
    for (int y : x) {
        System.out.println(y);        
    }
}    
}
