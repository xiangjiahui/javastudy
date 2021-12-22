package Thread;
//匿名内部类实现多线程的创建
public class Demo03InnerClassThread {
    public static void main(String[] args) {
        //父类方式
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.print(i + " ");
                }
            }
        }.start();

        //接口方式
//        Runnable r = new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 20; i++) {
//                    System.out.print(i + " ");
//                }
//            }
//        };
//        new Thread(r).start();

        //简化接口方式
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.print(i + " ");
                }
            }
        }).start();
    }
}
