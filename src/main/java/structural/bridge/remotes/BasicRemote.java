package structural.bridge.remotes;

import structural.bridge.devices.Device;

/**
 * Created by adementev on 13.02.2018.
 */
public class BasicRemote implements Remote {
    protected Device device;

    public BasicRemote() {
    }

    public BasicRemote(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
        System.out.println("Power");
        if (device.isEnabled())
            device.disable();
        else
            device.enable();

    }

    @Override
    public void volumeDown() {
        System.out.println("volumeDown");
        device.setVolume(device.getVolume()-10);
    }

    @Override
    public void volumeUp() {
        System.out.println("volumeUp");
        device.setVolume(device.getVolume()+10);
    }

    @Override
    public void channelDown() {
        System.out.println("channelDown");
        device.setChannel(device.getChannel()-1);
    }

    @Override
    public void channelUp() {
        System.out.println("channelUp");
        device.setChannel(device.getChannel()+1);
    }
}
