import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Player implements Runnable {
    private String name;
    private Game game;
    private boolean running;

    public Player(String name) {
        this.name = name;
    }

    private boolean submitWord() throws InterruptedException, IOException {
        List<Tile> extracted = game.getBag().extractTiles(7);
        if (extracted.isEmpty()) {
            return false;
        }

        String word;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        word = String.valueOf(reader.readLine());
        game.getBoard().addWord(this, word);
        TimeUnit.MILLISECONDS.sleep(50);
        return true;
    }


    public String getName() {
        return name;
    }

    public Game getGame() {
        return game;
    }

    public boolean isRunning() {
        return running;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    @Override
    public void run() {

    }
}