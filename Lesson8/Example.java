//class for Task7

package Lesson8;

public class Example {
    String first;
    String last;

    public Example(String first, String last) {
        this.first = first;
        this.last = last;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(obj == this) return true;
        if(!(obj instanceof Example)) return false;
        Example exm = (Example) obj;
        return this.first == exm.first && this.last == exm.last;
    }
    @Override
    public int hashCode() {
        return 11 * this.first.hashCode() + 13 * this.last.hashCode();
    }
}
