package ThreadSafe;
//模卖票案例,创建3个线程,同时开启,对共享的票进行出售
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
