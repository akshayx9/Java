package Exception_Handling;

//throw keyword is used to havdover user created exception object to JVM explicitly

public class Throw {
    public static void main(String[] args) {
        //1.Creating an Arithemetic Exception
        ArithmeticException ex=new ArithmeticException();
        //2.Handing over to JVM
        throw ex;
    }
}
