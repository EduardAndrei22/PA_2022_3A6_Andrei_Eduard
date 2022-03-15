import javax.xml.stream.Location;

public class Streets implements Comparable<Location> {

    private String name;
    private int length;

    public Streets(String name, int length) {
        this.name = name;
        this.length = length;
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
                '}';
    }

    @Override
    public int compareTo(Location o) {
        return 0;
    }
}
