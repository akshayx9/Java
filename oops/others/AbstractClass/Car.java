package oops.others.AbstractClass;

public class Car extends Vehicle{
    public void wheels() {
        System.out.println("4 Wheels");        
    }    
    public void speed() {
        System.out.println("100 kmph");
    }
    public static void main(String[] args) {
        Car c=new Car();
        c.wheels();//4
        c.speed();//100
    }
}
