// Controller for a simple Brick Game backend logic
public class BrickGameController {

    private int score;

    public BrickGameController() {
        score = 0;
    }

    // Start the game
    public void startGame() {
        System.out.println("Game Started!");
        // Mock gameplay logic
        hitBrick();
        hitBrick();
        System.out.println("Game Over! Your score: " + score);
    }

    // Player hits a brick
    private void hitBrick() {
        score += 10;
        System.out.println("Brick hit! Current score: " + score);
    }
}
