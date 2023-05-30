package Structural.Adapter;

public class UseMemory {
    public static void main(String[] args) {

        UsbFlash usbFlash = new AdapterOtg();

        usbFlash.read();
        usbFlash.write();
    }
}
