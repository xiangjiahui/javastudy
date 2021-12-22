package SynchronizedMethod;
/*
卖票案例出现了线程安全问题
卖出了不存在的和重复的票
解决线程安全问题的第二种方案：使用同步方法
使用步骤：
        1.把访问了共享数据的代码抽取出来,放到一个方法中
        2.在方法上添加SynchronizedSynchronized修饰符
定义方法的格式:
     修饰符 Synchronized 返回值类型 方法名(参数列表){
        可能会出现线程安全问题的代码(访问了共享数据的代码)
     }
 */
public class RunnableImpl implements Runnable{
    private int ticket = 100;

    @Override
    public void run() {
        while (true){
            payTicket();
        }
    }

    public synchronized void payTicket(){
        if(ticket>0){
            //提高出问题的概率，让程序睡眠
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"-->正在卖第"+ticket+"张票");
            ticket--;
        }
    }
}
