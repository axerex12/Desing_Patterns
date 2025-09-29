package main.java.Bridge;

public interface Device {
    boolean isEnabled();

    void video();

    void enable();

    void disable();

    void breakDevice();

    int getVolume();

    void setVolume(int percent);

    int getChannel();

    void setChannel(int channel);

    void printStatus();
}
