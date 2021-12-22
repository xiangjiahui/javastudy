package Interface;

public interface MyInterface {

    public static final int NUM_MY_CLASS = 10;

    public abstract void eat();

    //默认方法，用于接口类升级
    public default void methodDefault1(){
        System.out.println("默认方法1");
        methodCommon();
        methodStatic();
    }

    public default void methodDefault2(){
        System.out.println("默认方法2");
        methodCommon();
    }
    //普通私有方法，用来解决多个默认方法之间代码重复问题
    private void methodCommon(){
        System.out.println("AAA");
    }
    //静态私有方法，解决多个静态方法之间代码问题
    private static void methodStatic(){
        System.out.println("BBB");
    }

    public static void methodAbs(){
        System.out.println("这是一个静态方法");
    }
}
