// Main entry point for Hangman Game
public class Application {
    public static void main(String[] args) {
        HangmanController game = new HangmanController();

        // Start a new game with a sample word
        game.startGame("developer");
    }
}
