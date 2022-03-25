import javax.xml.stream.Location;

public class Streets implements Comparable<Location> {

    private String name;
    private int length;

    public String getIntersectionOfThisStreet() {
        return IntersectionOfThisStreet;
    }

    public void setIntersectionOfThisStreet(String intersectionOfThisStreet) {
        IntersectionOfThisStreet = intersectionOfThisStreet;
    }

    private String IntersectionOfThisStreet;

    public Streets(String name, int length, String intersectionOfThisStreet) {
        this.name = name;
        this.length = length;
        IntersectionOfThisStreet = intersectionOfThisStreet;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Streets{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", IntersectionOfThisStreet='" + IntersectionOfThisStreet + '\'' +
                '}';
    }

    @Override
    public int compareTo(Location o) {
        return 0;
    }
}
