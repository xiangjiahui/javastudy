package Thread;
/*
创建多线程的第一种方式：创建Thread的子类
java.land.Thread类:是描述线程的类,我们想要实现多线程程序,就必须继承Thread类
实现步骤:
      1.创建一个Thread的子类
      2.在Thread类的子类中重写Thread类的run方法,设置线程任务(开启线程要做什么)
      3.创建Thread类的子类对象
      4.调用Thread类中的start方法,开启新的线程,执行run方法
              void start()使该线程开始执行;Java虚拟机调用该虚拟机的run方法
              多次启动一个线程是违法的。特别是当线程已经结束执行后,不能在重新启动。
      java程序属于抢占式调度,哪个线程的优先级高,哪个线程优先执行;同一个优先级,随机选择一个执行
 */
public class Demo01Thread {
    public static void main(String[] args) {
        //3.创建Thread类的子类对象
        MyThread01 mt = new MyThread01();
        mt.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("main:"+i);
        }
    }
}
