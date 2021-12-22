package Demo02UsbInterface;

public class Computer {

    public void powerOn(){
        System.out.println("电脑开机");
    }

    public void powerOff(){
        System.out.println("电脑关机");
    }

    //使用USB设备的方法，使用接口作为参数
    public void useDevice(USB usb){
        usb.open();

        if(usb instanceof Mouse){
            Mouse mouse = (Mouse)usb;//向下转型
            mouse.click();
        }else if(usb instanceof Keyboard){
            Keyboard keyboard = (Keyboard)usb;
            keyboard.type();
        }

        usb.close();
    }
}
