package oops.others.AbstractClass;

public class Bike  extends Vehicle{
    public void wheels() {
        System.out.println("2 Wheels");        
    }
    public static void main(String[] args) {
        Bike b=new Bike();
        b.wheels();//2
        b.speed();//60
    }
    
}
