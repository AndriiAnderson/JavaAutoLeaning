//Class for Task1

package Lesson6;

public class Address {
    String city;
    String street;
    int building;

    public Address(String city, String street, int building) {
        this.city = city;
        this.street = street;
        this.building = building;
    }

    @Override
    public String toString() {
        return "City: " + city +
                " Street: "+ street +
                " Building: " + building;
    }
}


