package Assignments;
public class Assignment3_3 {
    public static void main(String[] args) {
        //Program to find largest of 3 numbers using if-else ladder
        int x=10;
        int y=20;
        int z=30;
        if(x>y&&x>z){
            System.out.println("MAX:"+x);
        }else if(y>z){
        System.out.println("MAX:"+y);
        }else{
            System.out.println("MAX:"+z);
        }
    }
}
