package Demo01;
/*
对象的向上转型其实就是多态写法。缺点；一旦用了多态，父类对象就不能使用子类特有的方法
对象的向下转型其实是一个【还原】的动作。格式：子类名称 对象名 =  (子类名称)父类对象
含义：将父类对象【还原】成为本来的子类对象
例：Animal animal = new Cat();本来是猫，向上转型成动物
    Cat cat = (Cat)animal;本来是猫，还原回来成为本来的猫
【注意】：1.必须保证对象本来创建的时候，就是猫，才能向下转型成为猫
         2.如果对象创建的时候不是猫，向下转型就会报错
 */
public class Demo01Main {

    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();

        Cat cat = (Cat)animal;
        cat.catchMouse();
    }
}
