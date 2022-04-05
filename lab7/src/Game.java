import java.util.ArrayList;
import java.util.List;

public class Game {
    private final Bag bag = new Bag(new ArrayList<>());
    private final Board board = new Board(new ArrayList<>());
    private final Dictionary dictionary = new Dictionary();
    private final List<Player> players = new ArrayList<>();
    public void addPlayer(Player player) {
        players.add(player);
        player.setGame(this);
    }
    public void play() {

        for (Player player : players) {

        }
    }

    public Bag getBag() {
        return bag;
    }

    public Board getBoard() {
        return board;
    }

    public Dictionary getDictionary() {
        return dictionary;
    }

    public List<Player> getPlayers() {
        return players;
    }


}
