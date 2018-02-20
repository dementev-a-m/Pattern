package structural.bridge.devices;

/**
 * Created by adementev on 13.02.2018.
 */
public class Television implements Device {

    private boolean on = false;
    private int volume = 30;
    private int channel = 1;


    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on = true;

    }

    @Override
    public void disable() {
        on = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        if (percent > 100)
            percent = 100;
        else if (percent < 0)
            percent = 0;
        volume = percent;
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        if (channel > 0)
            this.channel = channel;
    }


    @Override
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| I'm TV set.");
        System.out.println("| I'm " + (on ? "enabled" : "disabled"));
        System.out.println("| Current volume is " + volume + "%");
        System.out.println("| Current channel is " + channel);
        System.out.println("------------------------------------\n");
    }
}
