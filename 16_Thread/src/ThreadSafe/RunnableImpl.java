package ThreadSafe;
//卖票案例
public class RunnableImpl implements Runnable{
    private int ticket = 100;

    @Override
    public void run() {
        while (true){
            if(ticket>0){
                //提高出问题的概率，让程序睡眠
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //票存在,卖票
                System.out.println(Thread.currentThread().getName()+"-->正在卖第"+ticket+"张票");
                ticket--;
            }
        }
    }
}
