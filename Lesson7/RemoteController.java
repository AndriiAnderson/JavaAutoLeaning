//Class for Task4

package Lesson7;

public class RemoteController implements Device, Volume{
    TVDevice tvDevice;
    boolean isConnected;

    RemoteController(TVDevice tvDevice) {

        this.tvDevice = tvDevice;
    }

    void connectDevice(TVDevice obj) {
        System.out.println("Remote controller " + this.tvDevice.modelName  + " is connecting to TVDevice " + obj.modelName);
    }

    void disconnectDevice() {
        System.out.println("Remote controller " + this.tvDevice.modelName + " is disconnecting" );
    }

    @Override
    public void upVolume() {
        System.out.println("Volume is upping");
    }

    @Override
    public void downVolume() {
        System.out.println("Volume is downing");
    }

    @Override
    public void mute() {

        System.out.println("Muted");
    }

    void switchTheChannel(int newChannel) {

        System.out.println("The channel is switching to: " + newChannel);
    }

    boolean checkIfDeviceConnected(TVDevice obj) {
        boolean isConnected;
        if(this.tvDevice.modelName == obj.modelName){
            isConnected = true;
            System.out.println("Device is connected");
        } else {
            isConnected = false;
            System.out.println("Device is disconnected");
        }
        return isConnected;
    }

    @Override
    public void powerOn() {
        System.out.println("Powered On");
    }

    @Override
    public void powerOff() {
        System.out.println("Powered Off");
    }

    @Override
    public void setChannel(int newChannel) {
        System.out.println("Setting new channel to: " + newChannel);
    }

    @Override
    public void currentChannel() {
        System.out.println("Current channel ***");
    }
}
