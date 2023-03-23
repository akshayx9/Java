package oops.inheritance;

public class Overloading {
    public void m1(){
        System.out.println("m1() with no-args");
    }    
    public void m1(int x){
        System.out.println("m1() with int arg");
    }
    public void m1(float x){
        System.out.println("m1() with float arg");
    }
    public static void main(String[] args) {
        Overloading o=new Overloading();
        o.m1();
        o.m1(100);
        o.m1(34.5f);
    }
}
