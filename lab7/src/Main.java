public class Main {
    public static void main(String[] args) {

            Game game = new Game();
            game.addPlayer(new Player("John"));
            game.addPlayer(new Player("Bobby"));
            game.addPlayer(new Player("Cole"));
            game.play();
        }
    }

