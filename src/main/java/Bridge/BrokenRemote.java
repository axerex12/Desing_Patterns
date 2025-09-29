package main.java.Bridge;

public class BrokenRemote extends BasicRemote {
    public BrokenRemote(Device device) {
        super.device = device;
    }

    public void breakDevice() {
        System.out.println("Remote: break device");
        device.breakDevice();
        device.video();
    }
    
}
