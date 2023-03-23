package oops.inheritance;

public class ThisMethod {
    public void m1(){
        System.out.println("Inside m1() method!!");
        this.m2();//to call m2() from m1()
    }    
    public void m2() {
        System.out.println("Inside m2() method!!");       
    }
    public static void main(String[] args) {
        ThisMethod tm=new ThisMethod();
        tm.m1();
    }
}
