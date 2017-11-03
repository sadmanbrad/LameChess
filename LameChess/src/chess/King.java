package chess;

/**
 * Created by Bardia
 * on 10/14/2017.
 */
public class King extends ChessPiece {

    public King(Vector2 pos, Color col) {
        super(pos, col);
    }

    @Override
    public String toString() {
        return "K";
    }

}
