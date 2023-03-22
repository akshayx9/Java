package Java_Basics;

public class BufferBuilder {
    //Program to show use of StringBuffer & StringBuilder classes
    public static void main(String[] args) {
        StringBuffer sbf=new StringBuffer();//creates a string buffer with capacity of 16
        System.out.println(sbf.capacity());
        StringBuffer sbf1=new StringBuffer(100);//creates a string buffer with capacity of 100
        System.out.println(sbf1.capacity());

        StringBuffer sbf2=new StringBuffer("java");//creates a string buffer with "java" inside it
        sbf2.append(" tech");//adds " tech" to string "java"
        System.out.println(sbf2);

        sbf2.insert(0,"hibernate");//inserting at index
        sbf2.insert(2, "JDBC");
        System.out.println(sbf2);

        sbf2.delete(0, 3);//deletes substring
        sbf2.deleteCharAt(6);//deletes char at index
        System.out.println(sbf2);

        sbf2.reverse();//prints string in reverse
        System.out.println(sbf2);

        /*all the methods used for String & StringBuffer class also apply for StringBuilder class
        the only difference is that StringBuilder class methods are nlt syncronized. That is also why we use it in realtime.*/
    }
    
}
