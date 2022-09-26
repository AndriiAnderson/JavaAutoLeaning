//Class for Task1

package Lesson6;

public class Date {
    int year;
    String month;
    int day;

    public Date(int year, String month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return  "Year: " + year +
                " Month: " + month +
                " Day: " + day;
    }
}