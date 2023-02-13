package Test.JavaBasic.OOP;


public class InterfacePractice {

    public static void main(String[] args) {
        Computer c = new Computer();
        Light light1 = new Light();
        c.usb2 = light1;
        Light light2 = new Light();
        c.usb1 = light2;
        c.powerSupply();

    }

}

interface USBInterface {

}

interface USBSupply extends USBInterface {
    public void powerSupply();
}

interface USBReceive extends USBInterface {
    public void powerReceive();
}

class Computer implements USBSupply {

    public USBReceive usb1;
    public USBReceive usb2;


    public void powerSupply() {
        System.out.println("supply power");
        usb1.powerReceive();
        usb2.powerReceive();
    }
}

class Light implements USBReceive {
    public void powerReceive() {
        System.out.println("receive power");
    }
}