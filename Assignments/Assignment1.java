package Assignments;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Select an option:"+"\n"+"1.ADD"+"\n"+"2.MUL"+"\n"+"3.DIV"+"\n"+"4.Exit"+"\n");
        int x=s.nextInt();
        switch(x){
           case 1:{
                System.out.println("Enter first number:");
                int no1=s.nextInt();
                System.out.println("Enter second number:");
                int no2=s.nextInt();
                System.out.println("Answer:"+(no1+no2));
                break;
            }
            case 2:{
                System.out.println("Enter first number:");
                int no1=s.nextInt();
                System.out.println("Enter second number:");
                int no2=s.nextInt();
                System.out.println("Answer:"+(no1*no2));
                break;
            }
            case 3:{
                System.out.println("Enter first number:");
                int no1=s.nextInt();
                System.out.println("Enter second number:");
                int no2=s.nextInt();
                System.out.println("Answer:"+(no1/no2));
                break;
            }
            case 4:{
                System.out.println("Menu Exited!!");
                break;
            }
            default:{
                System.out.println("Invalid input");
            }
        }

    }
}
