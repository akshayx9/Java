package MultiThreading;

public class ExtendingThread {
    public static void main(String[] args) {
        //Instantiating a Thread
        ChildThread ct=new ChildThread();
        //Starting a Thread
        ct.start();
        for(int i=1; i<=10; i++){
            System.out.println("Main Thread");
        }
        System.out.println(Thread.currentThread().getName());//method to get the name of the thread
        Thread.currentThread().setName("New name for main thread");//method to set the name of the thread
        System.out.println(Thread.currentThread().getName());
    }
}
