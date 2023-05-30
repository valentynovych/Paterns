package Structural.Adapter;

public class AdapterOtg extends PhoneMemory implements UsbFlash {
    @Override
    public void read() {
        System.out.println("converting USB Type-C to USB-A ....");
        super.read();
    }

    @Override
    public void write() {
        System.out.println("converting USB-A to USB Type-C ....");
        super.write();
    }
}
