package oops.inheritance;

public class Child extends Parent {
        public void m2() {
            System.out.println("Inside child m2() method!!");
        }
        public static void main(String[] args) {
            //case 1 - using parent class obj to call parent class method
            Parent p1=new Parent();
            p1.m1();
            // p1.m2(); - This would give a CE

            // case 2 - using child class obj to call both the methods
            Child c=new Child();
            c.m1();
            c.m2();

            //case 3 - The parent class can hold child class reference

            Parent p2=new Child();
            p2.m1();
        }
}
