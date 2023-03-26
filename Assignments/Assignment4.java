package Assignments;

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x;
        do {
            System.out.println("Enter an option:"+"\n"+"1.ADD"+"\n"+"2.MUL"+"\n"+"3.DIV"+"\n"+"4.Exit"+"\n");
            x=s.nextInt();
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
        }
        }while (x!=4);
System.out.println("Exiting Program...");
 s.close();
 System.exit(0);
}
}
