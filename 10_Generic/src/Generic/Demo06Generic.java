package Generic;

import java.util.ArrayList;
import java.util.Collection;

/*
泛型的上限限定：? extends E     代表使用的泛型只能是E类型的子类/本身
泛型的下限限定：? super E       代表使用的泛型只能是E类型的父类/本身
 */
public class Demo06Generic {
    public static void main(String[] args) {
        Collection<Integer> list1 = new ArrayList<Integer>();
        Collection<String> list2 = new ArrayList<String>();
        Collection<Number> list3 = new ArrayList<Number>();
        Collection<Object> list4 = new ArrayList<Object>();

        getElemnt1(list1);
//        getElemnt1(list2);//不是Number的子类
        getElemnt1(list3);
//        getElemnt1(list4);//不是Number的子类

//        getElement2(list1);//不是Number的父类
//        getElement2(list2);//不是Number的父类
        getElement2(list3);
        getElement2(list4);
    }

    public static void getElemnt1(Collection<? extends Number> coll){}

    public static void getElement2(Collection<? super Number> coll){}
}
