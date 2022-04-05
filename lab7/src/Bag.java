import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.random;

public class Bag {
    private List<Tile> TileCollection = null;
    public Bag(List<Tile> tileCollection) {
        TileCollection = tileCollection;}
    public Bag() {
        for (char c = 'a'; c < 'z'; c++) {
            int k,j ;
            j=0;
            k= (int) random();
            Tile e= new Tile(c,k);
            TileCollection.add(j,e);
            j++;
        }
    }


    public synchronized List<Tile> extractTiles(int howMany) {
        List<Tile> extracted = new ArrayList<>();
        for (int i = 0; i < howMany; i++) {

            if (extracted.isEmpty()) {
                break;
            }
            int k ;
            k= (int) random();
            char c;
            c=(char) random();
            Tile e= new Tile(c,k);
            howMany++;
            extracted.add(howMany,e);
        }
        return extracted;
    }
}