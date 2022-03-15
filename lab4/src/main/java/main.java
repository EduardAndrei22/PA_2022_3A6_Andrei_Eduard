import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class main {

    public static void main(String[] args) {
        var nodes = IntStream.rangeClosed(1, 9)
                .mapToObj(i -> new Intersections("Intersection" + i) )
                .toArray(Intersections[]::new);
        List<Intersections> nodeListIntersections = new ArrayList<>();
        nodeListIntersections.addAll( Arrays.asList(nodes) );
        List<Streets> nodeListStreets = new ArrayList<>();
        Streets Street1 = new Streets("Street beetween Intersection 1 and 2",1);
        nodeListStreets.add(Street1);
        Streets Street2 = new Streets("Street beetween Intersection 2 and 3",1);
        nodeListStreets.add(Street2);
        Streets Street3 = new Streets("Street beetween Intersection 3 and 4",1);
        nodeListStreets.add(Street3);
        Streets Street4 = new Streets("Street beetween Intersection 3 and 5",3);
        nodeListStreets.add(Street4);
        Streets Street5 = new Streets("Street beetween Intersection 1 and 3",2);
        nodeListStreets.add(Street5);
        Streets Street6 = new Streets("Street beetween Intersection 2 and 4",1);
        nodeListStreets.add(Street6);
        Streets Street7 = new Streets("Street beetween Intersection 1 and 5",1);
        nodeListStreets.add(Street7);
        Streets Street8 = new Streets("Street beetween Intersection 4 and 6",2);
        nodeListStreets.add(Street8);
        Streets Street9 = new Streets("Street beetween Intersection 5 and 6",2);
        nodeListStreets.add(Street9);
        Streets Street10 = new Streets("Street beetween Intersection 5 and 7",3);
        nodeListStreets.add(Street10);
        Streets Street11 = new Streets("Street beetween Intersection 6 and 7",1);
        nodeListStreets.add(Street11);
        Streets Street12 = new Streets("Street beetween Intersection 7 and 8",2);
        nodeListStreets.add(Street12);
        Streets Street13 = new Streets("Street beetween Intersection 8 and 9",2);
        nodeListStreets.add(Street13);
        Streets Street14 = new Streets("Street beetween Intersection 6 and 7",1);
        nodeListStreets.add(Street14);
        Streets Street15 = new Streets("Street beetween Intersection 6 and 8",2);
        nodeListStreets.add(Street15);
        Streets Street16 = new Streets("Street beetween Intersection 6 and 9",2);
        nodeListStreets.add(Street16);
        System.out.println(nodeListIntersections.toString());
        System.out.println(nodeListStreets.toString());
        List<Streets> newSortedList = nodeListStreets.stream()
                .sorted(Comparator.comparing(Streets::getLength))
                .collect(Collectors.toList());
        System.out.println(newSortedList.toString());
        Set<Intersections> myIntersctions = new HashSet<>();
        if( checkDuplicates(nodeListIntersections))
            System.out.println("exista duplicate");
        else
            System.out.println("nu exista duplicate");
    }

    private static boolean checkDuplicates(List<Intersections> intersection) {
        for (int i = 0; i < intersection.size() - 1; i++)
            for (int j = i + 1; j < intersection.size() - 1; j++)
                if (intersection.get(i).equals(intersection.get(j)))
                    return true;
        return false;
    }
}
