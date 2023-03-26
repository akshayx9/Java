package Assignments;
import java.util.Scanner;  
import java.lang.Math;  

//Find area and circumference of Circle

public class Assignment3_4 {
    public static void main(String[] args) {
        int option;
        double radius, circumference, diameter, area;    
        Scanner sc=new Scanner (System.in);
        //options
        System.out.println("1. If the radius is known");
        System.out.println("2. If the diameter is known");
        System.out.println("3. If the circumference is known");
        System.out.print("Enter your choice:");
        
        //taking an option as input from the user
        option=sc.nextInt();
        switch(option){
            case 1:   
                System.out.print("Enter the radius of the circle: ");   
                radius=sc.nextDouble();
                sc.close();  
                area=(Math.PI*(radius*radius));
                circumference=(Math.PI*radius*2);  
                System.out.print("The area of the circle is: "+area+"\n");
                System.out.println("The circumference of the circle is: "+circumference);   
                break;    
            case 2:  
                System.out.print("Enter the diameter of the circle: ");
                diameter=sc.nextDouble();
                sc.close();
                area=Math.PI*(diameter*diameter)/4;
                circumference=(Math.PI*diameter);
                System.out.print("The area of the circle is: "+area+"\n");
                System.out.println("The circumference of the circle is: "+circumference);
                break;
            case 3:
                System.out.print("Enter the circumference of the circle: ");
                circumference=sc.nextDouble();
                sc.close();
                area=(circumference*circumference)/(4*Math.PI);
                System.out.print("The area of the circle is: "+area+"\n");
                System.out.println("The circumference of the circle is: "+circumference);
                break;
            default:
                System.out.println("invalid choice!");
                sc.close();     
}    
}    
}
