package Exception_Handling;

//throws is used to delegate the responsibility of exception handling to caller

public class Throws {
    public static void main(String[] args) throws InterruptedException {
        doStuff();//here we are delegating the exception to main() which delegates it to the JVM
    }
    public static void doStuff() throws InterruptedException {
        doMoreStuff();//here we are delegating the exception to doStuff()
    }
    public static void doMoreStuff() throws InterruptedException {
        Thread.sleep(6000);//here we are delegating the exception to doMoreStuff()
    }
}
