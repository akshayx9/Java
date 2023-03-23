package oops.inheritance;

public class OverridingChild extends OverridingParent {
    public void add(int x, int y){
        System.out.println("ADD="+(x+y+100));
    }
    public static void main(String[] args) {
        //case 1
        OverridingParent p1=new OverridingParent();
        p1.add(100,100);//200
        //case 2
        OverridingChild c=new OverridingChild();
        c.add(100, 100);//300
        //case 3
        OverridingParent p2=new OverridingChild();
        p2.add(100,100);//300
    }
}
