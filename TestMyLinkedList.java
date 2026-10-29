import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HighScoresGame {
    private List<Integer> scores = new ArrayList<>();

    public void addScore(int newScore) {
        scores.add(newScore);
        scores.sort(Collections.reverseOrder()); // Tri décroissant
        if (scores.size() > 10) {
            scores.remove(scores.size() - 1); // Garder uniquement le Top 10
        }
    }

    public void displayScores() {
        System.out.println("Le top 10 des scores est : ");
        for (int i = 0; i < scores.size(); i++) {
            System.out.println((i + 1) + ". " + scores.get(i));
        }
    }

    public static void main(String[] args) {
        HighScoresGame game = new HighScoresGame();
        int[] simulatedScores = {150, 3200, 450, 1200, 890, 50, 4000, 2300, 1100, 750, 9999, 300};
        
        for (int s : simulatedScores) {
            game.addScore(s);
        }
        game.displayScores();
    }
}
