package Demo02UsbInterface;
//笔记本USB接口案例
public class DemoMain {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();

        //准备一个鼠标，供电脑使用
        //首先向上转型,多态写法
        USB usb = new Mouse();
        computer.useDevice(usb);

        //创建一个键盘，不使用多态写法
        Keyboard keyboard = new Keyboard();
        //方法参数是USB类型，传递进去的是实现类对象
        computer.useDevice(keyboard);//正确写法，发生了向上转型

        computer.powerOff();
    }
}
