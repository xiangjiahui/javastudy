package Generic;

public class GenericInterfaceImpl2<E> implements GenericInterface<E>{
    @Override
    public void method(E e) {
        System.out.println(e);
    }
}
