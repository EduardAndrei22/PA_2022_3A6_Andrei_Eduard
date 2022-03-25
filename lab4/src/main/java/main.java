import java.nio.charset.Charset;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class main {

    public static void main(String[] args) {


        String nameForIntersection1=nameForIntersections();
        String nameForIntersection2=nameForIntersections();
        String nameForIntersection3=nameForIntersections();
        String nameForIntersection4=nameForIntersections();
        String nameForIntersection5=nameForIntersections();
        String nameForIntersection6=nameForIntersections();
        String nameForIntersection7=nameForIntersections();
        String nameForIntersection8=nameForIntersections();
        String nameForIntersection9=nameForIntersections();

        List<Intersections> nodeListIntersections = new ArrayList<>() ;

        Intersections Intersection1= new Intersections(nameForIntersection1,4);
        nodeListIntersections.add(Intersection1);
        Intersections Intersection2= new Intersections(nameForIntersection2,3);
        nodeListIntersections.add(Intersection2);
        Intersections Intersection3= new Intersections(nameForIntersection3,4);
        nodeListIntersections.add(Intersection3);
        Intersections Intersection4= new Intersections(nameForIntersection4,3);
        nodeListIntersections.add(Intersection4);
        Intersections Intersection5= new Intersections(nameForIntersection5,4);
        nodeListIntersections.add(Intersection5);
        Intersections Intersection6= new Intersections(nameForIntersection6,5);
        nodeListIntersections.add(Intersection6);
        Intersections Intersection7= new Intersections(nameForIntersection7,3);
        nodeListIntersections.add(Intersection7);
        Intersections Intersection8= new Intersections(nameForIntersection8,3);
        nodeListIntersections.add(Intersection8);
        Intersections Intersection9= new Intersections(nameForIntersection9,3);
        nodeListIntersections.add(Intersection9);


        List<Streets> nodeListStreets = new ArrayList<>();

        String nameForStreet1=nameForStreets();
        String nameForStreet2=nameForStreets();
        String nameForStreet3=nameForStreets();
        String nameForStreet4=nameForStreets();
        String nameForStreet5=nameForStreets();
        String nameForStreet6=nameForStreets();
        String nameForStreet7=nameForStreets();
        String nameForStreet8=nameForStreets();
        String nameForStreet9=nameForStreets();
        String nameForStreet10=nameForStreets();
        String nameForStreet11=nameForStreets();
        String nameForStreet12=nameForStreets();
        String nameForStreet13=nameForStreets();
        String nameForStreet14=nameForStreets();
        String nameForStreet15=nameForStreets();
        String nameForStreet16=nameForStreets();

        String IntersectionsForStreet1 =toStringForIntersectionOfStreets(nameForStreet1,nameForIntersection1,nameForIntersection2);
        String IntersectionsForStreet2 =toStringForIntersectionOfStreets(nameForStreet2,nameForIntersection2,nameForIntersection3);
        String IntersectionsForStreet3 =toStringForIntersectionOfStreets(nameForStreet3,nameForIntersection1,nameForIntersection3);
        String IntersectionsForStreet4 =toStringForIntersectionOfStreets(nameForStreet4,nameForIntersection2,nameForIntersection4);
        String IntersectionsForStreet5 =toStringForIntersectionOfStreets(nameForStreet5,nameForIntersection3,nameForIntersection4);
        String IntersectionsForStreet6 =toStringForIntersectionOfStreets(nameForStreet6,nameForIntersection3,nameForIntersection5);
        String IntersectionsForStreet7 =toStringForIntersectionOfStreets(nameForStreet7,nameForIntersection1,nameForIntersection5);
        String IntersectionsForStreet8 =toStringForIntersectionOfStreets(nameForStreet8,nameForIntersection4,nameForIntersection6);
        String IntersectionsForStreet9 =toStringForIntersectionOfStreets(nameForStreet9,nameForIntersection6,nameForIntersection7);
        String IntersectionsForStreet10 =toStringForIntersectionOfStreets(nameForStreet10,nameForIntersection6,nameForIntersection8);
        String IntersectionsForStreet11 =toStringForIntersectionOfStreets(nameForStreet11,nameForIntersection6,nameForIntersection9);
        String IntersectionsForStreet12 =toStringForIntersectionOfStreets(nameForStreet12,nameForIntersection5,nameForIntersection7);
        String IntersectionsForStreet13 =toStringForIntersectionOfStreets(nameForStreet13,nameForIntersection7,nameForIntersection8);
        String IntersectionsForStreet14 =toStringForIntersectionOfStreets(nameForStreet14,nameForIntersection8,nameForIntersection9);
        String IntersectionsForStreet15 =toStringForIntersectionOfStreets(nameForStreet15,nameForIntersection1,nameForIntersection9);
        String IntersectionsForStreet16 =toStringForIntersectionOfStreets(nameForStreet16,nameForIntersection5,nameForIntersection7);

        Streets Street1 = new Streets(nameForStreet1,1,IntersectionsForStreet1);
        nodeListStreets.add(Street1);
        Streets Street2 = new Streets(nameForStreet2,1,IntersectionsForStreet2);
        nodeListStreets.add(Street2);
        Streets Street3 = new Streets(nameForStreet3,1,IntersectionsForStreet3);
        nodeListStreets.add(Street3);
        Streets Street4 = new Streets(nameForStreet4,3,IntersectionsForStreet4);
        nodeListStreets.add(Street4);
        Streets Street5 = new Streets(nameForStreet5,2,IntersectionsForStreet5);
        nodeListStreets.add(Street5);
        Streets Street6 = new Streets(nameForStreet6,1,IntersectionsForStreet6);
        nodeListStreets.add(Street6);
        Streets Street7 = new Streets(nameForStreet7,1,IntersectionsForStreet7);
        nodeListStreets.add(Street7);
        Streets Street8 = new Streets(nameForStreet8,2,IntersectionsForStreet8);
        nodeListStreets.add(Street8);
        Streets Street9 = new Streets(nameForStreet9,2,IntersectionsForStreet9);
        nodeListStreets.add(Street9);
        Streets Street10 = new Streets(nameForStreet10,3,IntersectionsForStreet10);
        nodeListStreets.add(Street10);
        Streets Street11 = new Streets(nameForStreet11,1,IntersectionsForStreet11);
        nodeListStreets.add(Street11);
        Streets Street12 = new Streets(nameForStreet12,2,IntersectionsForStreet12);
        nodeListStreets.add(Street12);
        Streets Street13 = new Streets(nameForStreet13,2,IntersectionsForStreet13);
        nodeListStreets.add(Street13);
        Streets Street14 = new Streets(nameForStreet14,1,IntersectionsForStreet14);
        nodeListStreets.add(Street14);
        Streets Street15 = new Streets(nameForStreet15,2,IntersectionsForStreet15);
        nodeListStreets.add(Street15);
        Streets Street16 = new Streets(nameForStreet16,2,IntersectionsForStreet16);
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



        Map<List<Intersections>, List<Streets>> cityMap = new HashMap<>();
        cityMap.put(nodeListIntersections,nodeListStreets);
        System.out.println(cityMap.toString());

        //afisarea strazilor cu o lungime mai mare decat o anumita valoare
        nodeListStreets.stream()
                .filter(Street -> Street.getLength() >= 2)
                .forEach(System.out::println);

        //afisarea intersectiilor cu un numar mai mare de 3 strazi
        nodeListIntersections.stream()
                .filter(Intersection -> Intersection.getNumberOfStreets() >= 3)
                .forEach(System.out::println);

    }


    //Iar pentru algoritm, m-am gandit ca vom putea alege intersectia cu cele mai multe strazi, ca intersectie de pornire si o vizam
    // dupa care vom merge pe costul minim catre urmatoarea intersectie, daca avem mai multe strazi cu acelasi cost
    //atunci vom alege intersectia cu cele mai multe strazi la capatul carora se afla o intersectie nevizata
    //si vom viza intersectia de pe care am plecat
    
    private static boolean checkDuplicates(List<Intersections> intersection) {
        for (int i = 0; i < intersection.size() - 1; i++)
            for (int j = i + 1; j < intersection.size() - 1; j++)
                if (intersection.get(i).equals(intersection.get(j)))
                    return true;
        return false;
    }
    public static String nameForStreets() {

        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();

        return generatedString;
    }
    public static String nameForIntersections() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();

        return generatedString;
    }
    public static String toStringForIntersectionOfStreets(String Street, String Intersection1, String Intersection2) {
        return "Street: " + Street +
                " is between " + "Intersection: " + Intersection1 +
                " and Interection: " + Intersection2 +
                '}';
    }
}
