package Lesson7;

public class Task4 {
    public  static  void  main(String  args[]) {

        boolean isConnected;

        TV tv1 = new TV("Sony");
        TV tv2 = new TV("Samsung");
        RemoteController rc1 = new RemoteController(tv1);
        RemoteController rc2 = new RemoteController(tv2);

        tv1.currentChannel();
        tv1.powerOn();
        tv1.powerOff();
        tv1.setChannel(3);
        tv1.currentChannel();
        tv1.upVolume();
        tv1.upVolume();
        tv1.upVolume();
        tv1.downVolume();
        tv1.mute();
        rc1.disconnectDevice();
        rc1.upVolume();
        rc1.downVolume();
        rc1.mute();
        rc1.switchTheChannel(33);
        rc1.powerOn();
        rc1.powerOff();
        rc1.setChannel(5);
        rc1.currentChannel();
        rc1.checkIfDeviceConnected(tv1);
        rc1.checkIfDeviceConnected(tv2);
        rc2.checkIfDeviceConnected(tv1);
        rc2.checkIfDeviceConnected(tv2);
    }
}
