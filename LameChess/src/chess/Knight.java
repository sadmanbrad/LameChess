package chess;

/**
 * Created by Bardia
 * on 10/13/2017.
 */
public class Knight extends ChessPiece {

    public Knight(Vector2 pos, Color col) {
        super(pos, col);
    }

    @Override
    public String toString() {
        return "k";
    }

}
