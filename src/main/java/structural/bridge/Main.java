package structural.bridge;

import structural.bridge.devices.Device;
import structural.bridge.devices.Radio;
import structural.bridge.devices.Television;
import structural.bridge.remotes.AdvancedRemote;
import structural.bridge.remotes.BasicRemote;

/**
 * Created by adementev on 13.02.2018.
 */
public class Main {
    public static void main(String[] args) {
        testDevice(new Television());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
