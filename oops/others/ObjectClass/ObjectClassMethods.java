package oops.others.ObjectClass;

public class ObjectClassMethods implements Cloneable {
    String name;
    int rollNo;
    int i=10;
    int j=20;
    ObjectClassMethods(String name, int rollNo){
        this.name=name;
        this.rollNo=rollNo;
    }
    ObjectClassMethods(){
        System.out.println("*******");
    }
    public String toString(){
        return name+"-->"+rollNo;
    }
    public int hashCode(){
        return rollNo;
    }
    public static void main(String[] args) throws CloneNotSupportedException{
        //toString() method
        ObjectClassMethods s1=new ObjectClassMethods("Suresh",100);
        System.out.println(s1.toString());

        //hashCode() method - JVM generates a random number based on memory location for every object & we can override this method to give our own values.
        System.out.println(s1.hashCode());
        ObjectClassMethods s2=new ObjectClassMethods("Ramesh", 101);
        System.out.println(s2.hashCode());

        //equals() method - checks if the memory location is same or not.
        ObjectClassMethods s3=new ObjectClassMethods("Suresh", 100);
        System.out.println(s1.equals(s3));//false

        //clone() method - can be used to clone an object & it's properties.
        ObjectClassMethods d1=new ObjectClassMethods();
        ObjectClassMethods d2=(ObjectClassMethods)d1.clone();
        d1.i=100;
        d1.j=200;
        System.out.println(d2.i+"-->"+d2.j);
    }
}
