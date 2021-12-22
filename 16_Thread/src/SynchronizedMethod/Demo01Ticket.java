package SynchronizedMethod;

public class Demo01Ticket{
    public static void main(String[] args) {
        RunnableImpl impl = new RunnableImpl();
        Thread t1 = new Thread(impl);
        Thread t2 = new Thread(impl);
        Thread t3 = new Thread(impl);
        t1.start();
        t2.start();
        t3.start();
    }
}
