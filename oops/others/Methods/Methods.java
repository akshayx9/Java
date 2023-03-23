package oops.others.Methods;

public class Methods {
    public int add(int x, int y) {
        int sum=x+y;
        return sum;        
    }
    public static void mul(int x, int y) {
        System.out.println("MUL="+(x*y));                
    }
    public static void main(String[] args) {
        Methods m=new Methods();
        int total=m.add(100,100);//Instance Method call - requires creation of object
        System.out.println("ADD="+total);
        Methods.mul(10, 10);//Static Method call - can be called directly
    }
    
}
