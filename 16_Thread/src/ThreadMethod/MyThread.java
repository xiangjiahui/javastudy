package ThreadMethod;

public class MyThread extends Thread{

    public MyThread(){}

    public MyThread(String name){
        super(name);
    }

    @Override
    public void run() {
        String name = getName();
        System.out.println(name);

        Thread t = Thread.currentThread();
        String name1 = t.getName();
        System.out.println(name1);

        //链式编程
        System.out.println(Thread.currentThread().getName());
    }
}
