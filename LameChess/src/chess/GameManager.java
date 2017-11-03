package chess;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bardia
 * on 10/13/2017.
 */
public class GameManager {

    private static GameManager instance;

    public static GameManager getInstance() {
        if(instance == null) {
            instance = new GameManager();
        }
        return instance;
    }

    private ChessBoard board;

    public void newGame() {
        initialize();
    }

    public ChessBoard gameBoard() {
        return board;
    }

    private GameManager() {
        board = new ChessBoard();
    }

    private void initialize() {
        board.setup();
    }
}
