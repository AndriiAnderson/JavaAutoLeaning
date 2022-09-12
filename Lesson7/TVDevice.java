//Class for Task4

package Lesson7;

abstract public class TVDevice implements Device, Volume {
    String modelName;
    boolean isOn;

    TVDevice(String modelName) {

        this.modelName = modelName;
    }
}
