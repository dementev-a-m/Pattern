package structural.bridge.remotes;

import structural.bridge.devices.Device;

/**
 * Created by adementev on 13.02.2018.
 */
public class AdvancedRemote extends BasicRemote{
    public AdvancedRemote(Device device) {
        super(device);
    }
    public void mute(){
        System.out.println("mute");
        device.setVolume(0);

    }
}
