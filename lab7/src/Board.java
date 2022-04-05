import java.util.List;

public class Board {
    private final List<Dictionary> WordCollection;

    public Board(List<Dictionary> wordCollection) {
        WordCollection = wordCollection;
    }

    public void addWord(Player player, String word) {

        System.out.println(player.getName() + ": " + word);
    }
    @Override
    public String toString() {
        return WordCollection.toString();
    }
}