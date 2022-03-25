import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class City {
    Map<List<Intersections>, List<Streets>> cityMap = new HashMap<>();

    public City(Map<List<Intersections>, List<Streets>> cityMap) {
        this.cityMap = cityMap;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityMap=" + cityMap +
                '}';
    }

    public void setCityMap(Map<List<Intersections>, List<Streets>> cityMap) {
        this.cityMap = cityMap;
    }

    public Map<List<Intersections>, List<Streets>> getCityMap() {
        return cityMap;
    }
}
