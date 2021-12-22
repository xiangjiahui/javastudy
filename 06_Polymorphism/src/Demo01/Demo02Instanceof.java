package Demo01;
/*
Instanceof用于知晓父类对象本来是什么子类
格式：父类 instanceof 子类对象
 */
public class Demo02Instanceof {

    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();
        if(animal instanceof Dog){
            Dog dog = (Dog)animal;
            dog.watchHouse();
        }
        if (animal instanceof Cat){
            Cat cat = (Cat)animal;
            cat.catchMouse();
        }
        giveMeAPet(animal);
    }

    public static void giveMeAPet(Animal animal){
        if(animal instanceof Dog){
            Dog dog = (Dog)animal;
            dog.watchHouse();
        }
        if (animal instanceof Cat){
            Cat cat = (Cat)animal;
            cat.catchMouse();
        }
    }
}
