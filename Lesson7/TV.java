//Class for Task4

package Lesson7;

public class TV extends TVDevice  {
    int volumeLevel;
    int channelNumber;

    TV(String modelName) {

        super(modelName);
    }

    @Override
    public void currentChannel() {

        System.out.println(channelNumber);
    }

    @Override
    public void powerOn() {
        System.out.println("TV is powered on");
        this.isOn = true;
    }

    @Override
    public void powerOff() {
        System.out.println("TV is powered off");
        this.isOn = false;
    }

    @Override
    public void setChannel(int newChannel) {
        this.channelNumber = newChannel;
        System.out.println("Changing channel to: " + newChannel);
    }

    @Override
    public void upVolume(){
        System.out.println("Leveling up the volume");
        this.volumeLevel += 1;
        System.out.println("Current level is: " + volumeLevel);
    }

    @Override
    public void downVolume() {
        System.out.println("Leveling down the volume");
        this.volumeLevel -= 1;
        System.out.println("Current level is: " + volumeLevel);
    }

    @Override
    public void mute() {

        this.volumeLevel = 0;
        System.out.println("Muted");
        System.out.println("Current level is: " + volumeLevel);
    }
}
