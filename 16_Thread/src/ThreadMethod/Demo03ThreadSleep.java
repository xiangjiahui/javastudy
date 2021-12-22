package ThreadMethod;
/*
public static void sleep(long millis):使当前正在执行的线程以暂定的毫秒数暂停(暂时停止执行)
毫秒数结束后,程序继续执行
 */
public class Demo03ThreadSleep {
    public static void main(String[] args) {
        for (int i = 1; i <= 60; i++) {
            System.out.print(i+" ");

            try {
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }


    }
}
