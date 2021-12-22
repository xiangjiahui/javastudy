package Interface.demo01;

public interface MyInterface extends MyInterfaceA, MyInterfaceB{

    public abstract void mthod();

    public abstract void methodCommon();

    @Override
    public default void methodDefault() {
        System.out.println("CCC");
    }

}
