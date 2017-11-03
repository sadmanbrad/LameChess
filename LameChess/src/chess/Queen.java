package chess;

/**
 * Created by Bardia
 * on 10/14/2017.
 */
public class Queen extends ChessPiece {

    public Queen(Vector2 pos, Color col) {
        super(pos, col);
    }

    @Override
    public String toString() {
        return "Q";
    }

}
