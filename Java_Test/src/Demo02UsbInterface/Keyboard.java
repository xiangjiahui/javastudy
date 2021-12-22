package Demo02UsbInterface;
//键盘就是一个USB设备
public class Keyboard implements USB{
    @Override
    public void open() {
        System.out.println("键盘打开");
    }

    @Override
    public void close() {
        System.out.println("键盘关闭");
    }

    public void type(){
        System.out.println("键盘输入");
    }
}
