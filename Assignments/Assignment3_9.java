package Assignments;

public class Assignment3_9 {
    public static void main(String[] args) {
        int units=380;
        double bill;

        if(units<=100){
            bill=units*2.00;
        }else if(units<=300){
            bill=100*2.00+(units-100)*3.50;
        }else{
            bill=100*2.00+200*3.50+(units-300)*5;
        }
        System.out.println("The electricity bill for " +units+ " is : " + bill);
    }
}
