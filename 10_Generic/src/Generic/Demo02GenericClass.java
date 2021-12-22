package Generic;

public class Demo02GenericClass {
    public static void main(String[] args) {
        GenericClass gc = new GenericClass();
        gc.setName("张三");
        Object name = gc.getName();
        System.out.println(name);

        GenericClass<Integer> gc2 = new GenericClass<>();
        gc2.setName(1);
        Integer name1 = gc2.getName();
        System.out.println(name1);

        GenericClass<String> gc3 = new GenericClass<>();
        gc3.setName("小明");
        String name2 = gc3.getName();
        System.out.println(name2);
    }
}
