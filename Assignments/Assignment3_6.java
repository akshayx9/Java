package Assignments;

public class Assignment3_6 {
    public static void main(String[] args) {
        //Case 1 -swapping values using a 3rd variable
        int a=10;
        int b=20;
        int t=a;
        a=b;
        b=t;
        System.out.println("Value of a = "+a);
        System.out.println("Value of b = "+b);

        //Case 2 - swapping values without using a 3rd variable
        int i=30;
        int j=40;
        i=i+j;
        j=i-j;
        i=i-j;
        System.out.println("Value of i = "+i);
        System.out.println("Value of j = "+j);

        //Case 3 - swapping values in single line
        int x=50;
        int y=60;
        x=(x*y)/(y=x);
        System.out.println("Value of x = "+x);
        System.out.println("Value of y = "+y);
    }
}
