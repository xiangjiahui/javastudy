package Lock;

import java.util.concurrent.locks.ReentrantLock;

/*
卖票案例出现了线程安全问题
卖出了不存在的和重复的票
解决线程安全问题的第三种方案：使用Lock锁
Lock实现提供了比使用Synchronized方法和语句可获得的更广泛的锁定操作
Lock接口中的方法：
            void lock()获取锁
            void unlock()释放锁
java.util.concurrent.locks.ReentrantLock implements Lock接口
使用步骤：
        1.在成员位置创建一个ReentrantLock对象
        2.在可能会出现安全问题代码前调用方法lock获取锁
        3.在可能会出现安全问题代码后调用方法unlock释放锁
 */
public class RunnableImpl implements Runnable{
    //定义一个多个线程共享的票源
    private int ticket = 100;

    //1.在成员位置创建一个ReentrantLock对象
    ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true){
            //2.在可能会出现安全问题代码前调用方法lock获取锁
            lock.lock();
            if(ticket>0){
                //提高出问题的概率，让程序睡眠
                try {
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName()+"-->正在卖第"+ticket+"张票");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    //3.在可能会出现安全问题代码后调用方法unlock释放锁
                    lock.unlock();
                }
            }
        }
    }

}
