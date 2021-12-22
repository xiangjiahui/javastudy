package Synchronized;

public class DemoTicket {
    public static void main(String[] args) {
        RunnableImpl01 impl = new RunnableImpl01();
        Thread t1 = new Thread(impl);
        Thread t2 = new Thread(impl);
        Thread t3 = new Thread(impl);
        t1.start();
        t2.start();
        t3.start();
    }
}
