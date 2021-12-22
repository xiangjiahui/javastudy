package Interface;

public interface MyInterfaceB {

    public abstract void methodAbs();

    public default void methodDefault(){
        System.out.println("默认方法B");
    }
}
