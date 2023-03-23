package oops.inheritance;

public class SuperChild extends SuperParent {
    int x=1000;
    int y=2000;
    public void m1() {
        System.out.println(this.x);//1000
        System.out.println(super.x);//200
    }    
    public static void main(String[] args) {
        SuperChild c=new SuperChild();
        c.m1();
    }
}
