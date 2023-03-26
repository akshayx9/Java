package Assignments;

//Find largest,middle and smallest of 3 numbers

public class Assignment3_7 {
    public static void main(String[] args) {
        int x=10;
        int y=30;
        int z=20;
        if(x>y&&x>z){
            System.out.println("The largest number is "+x);
            if(y>z){
                System.out.println("The middle number is "+y);
                System.out.println("The smallest number is "+z);
            }else{
                System.out.println("The middle number is "+z);
                System.out.println("The smallest number is "+y);
            }
        }else if(y>z){
            System.out.println("The largest number is "+y);
            if(x>z){
                System.out.println("The middle number is "+x);
                System.out.println("The smallest number is "+z);
            }else{
                System.out.println("The middle number is "+z);
                System.out.println("The smallest number is "+x);
            }
        }else{
            System.out.println("The largest number is "+z);
            if(x>y){
                System.out.println("The middle number is "+x);
                System.out.println("The smallest number is "+y);
            }else{
                System.out.println("The middle number is "+y);
                System.out.println("The smallest number is "+x);
            }
        }
    }
}
