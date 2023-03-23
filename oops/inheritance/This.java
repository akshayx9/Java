package oops.inheritance;

public class This {
    int x;
    int y;
    public This(int px, int py) {
        this.x=px;//represents present class variables
        this.y=py;
    }    
    public static void main(String[] args) {
        This t=new This(10, 20);
        System.out.println(t.x);
        System.out.println(t.y);
    }
}
