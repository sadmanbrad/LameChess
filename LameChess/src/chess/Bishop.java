package chess;

/**
 * Created by Bardia
 * on 10/14/2017.
 */
public class Bishop extends ChessPiece {

    public Bishop(Vector2 pos, Color col) {
        super(pos, col);
    }

    @Override
    public String toString() {
        return "B";
    }
}
