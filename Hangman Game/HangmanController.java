import java.util.HashSet;
import java.util.Set;

// Controller for Hangman Game backend logic
public class HangmanController {

    private int maxAttempts = 6;

    public void startGame(String word) {
        Set<Character> guessed = new HashSet<>();
        int attempts = 0;
        StringBuilder display = new StringBuilder("_".repeat(word.length()));

        System.out.println("Welcome to Hangman!");
        System.out.println(display);

        // Mock gameplay loop (replace with input logic in real scenario)
        char[] sampleGuesses = {'e', 'd', 'x', 'o', 'v', 'r'};
        for (char guess : sampleGuesses) {
            if (word.indexOf(guess) >= 0) {
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess) display.setCharAt(i, guess);
                }
                System.out.println("Correct guess: " + display);
            } else {
                attempts++;
                System.out.println("Wrong guess. Attempts left: " + (maxAttempts - attempts));
            }
            if (display.toString().equals(word)) {
                System.out.println("Congratulations! Word guessed: " + word);
                break;
            }
            if (attempts >= maxAttempts) {
                System.out.println("Game Over! The word was: " + word);
                break;
            }
        }
    }
}
