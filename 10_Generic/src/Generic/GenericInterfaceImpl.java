package Generic;
/*
含有泛型的接口第一种使用方式：定义接口的实现类，实现接口，指定接口的泛型
 */
public class GenericInterfaceImpl implements GenericInterface<String>{
    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
