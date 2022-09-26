package Lesson5;

public class Task7 {
    /*
    Package-private модифікатор доступу по дефолту.
    Члени классу позначенні як package-private доступні з одного пакету.

    Якщо в ClassTwo створити об'єкт objOne, то йому будуть доступні члени классу ClassOne
    які мають модифіктор доступу Package-private.
    ClassOne і ClassTwo знаходяться в package Lesson5.packA.

    Але якщо створити об'єкт objTwo в ClassThree,то йому вже не будуть доступні члену классу ClassOne.
    Це тому що ClassThree знохиться в package Lesson5.packB.
     */
}
