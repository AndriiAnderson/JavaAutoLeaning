//Class for Task1

package Lesson6;

public class Client {
    String name;
    Date birthday;
    Address address;
    public Client(String name, Date birthday, Address address) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
    }
    @Override
    public String toString() {
        return "Name : " + name +
                " Date : " + birthday +
                " Adress : " + address;
    }
}
