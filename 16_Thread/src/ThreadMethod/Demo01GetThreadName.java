package ThreadMethod;
/*
获取线程的名称：
        1.使用Thread类中的方法getName()返回该线程名称
        2.可以先获取到当前正在执行的线程,使用线程中的方法getName()获取线程的名称
                static Thread currentThread()返回对当前正在执行的线程对象的引用
 */
public class Demo01GetThreadName {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
    }
}
