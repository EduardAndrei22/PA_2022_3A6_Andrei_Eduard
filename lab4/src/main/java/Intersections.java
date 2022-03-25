import java.util.ArrayList;
import java.util.List;

public class Intersections {
    private String name;
    private int numberOfStreets;

    public Intersections(String name, int numberOfStreets) {
        this.name = name;
        this.numberOfStreets = numberOfStreets;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfStreets() {
        return numberOfStreets;
    }

    public void setNumberOfStreets(int numberOfStreets) {
        this.numberOfStreets = numberOfStreets;
    }

    @Override
    public String toString() {
        return "Intersections{" +
                "name='" + name + '\'' +
                ", numberOfStreets=" + numberOfStreets +
                '}';
    }
}


