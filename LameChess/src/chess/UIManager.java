package chess;

/**
 * Created by Bardia
 * on 10/10/2017.
 */
public class UIManager {

    public static void main(String[] args) {
        GameManager.getInstance().newGame();
        System.out.print(GameManager.getInstance().gameBoard().toString());
    }
}
