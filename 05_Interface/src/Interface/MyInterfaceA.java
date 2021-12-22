package Interface;

public interface MyInterfaceA {

    public abstract void methodAbs();

    public default void methodDefault(){
        System.out.println("默认方法A");
    }

    public default void method(){
        System.out.println("默认方法");
    }
}
