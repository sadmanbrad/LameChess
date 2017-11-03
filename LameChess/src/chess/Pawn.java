package chess;

/**
 * Created by Bardia
 * on 10/13/2017.
 */
public class Pawn extends ChessPiece {

    public Pawn(Vector2 pos, Color col) {
        super(pos, col);
    }

    @Override
    public String toString() {
        return "p";
    }

}
