import java.util.ArrayList;
import java.util.List;

public class Intersections {
    private String name;

    public Intersections(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Intersections{" +
                "name='" + name + '\'' +
                '}';
    }

}
