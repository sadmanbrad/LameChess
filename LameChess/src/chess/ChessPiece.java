package chess;

import java.util.List;

/**
 * Created by Bardia
 * on 10/10/2017.
 */

public abstract class ChessPiece {

    protected static List<Vector2> validMoves;

    private Color color;

    public ChessPiece(Color col) {
        this.color = col;
    }

    public Vector2 getPosition() {
        return GameManager.getInstance().gameBoard().getPiecePosition(this);
    }

    public Color getColor() {
        return color;
    }

    public boolean isValidMove(Vector2 pos) {
        return validMoves.contains(pos.subtract(this.getPosition())) &&
                !GameManager.getInstance().gameBoard().getPieceAt(pos).getColor().equals(this.getColor());
    }

    public void die() {
        GameManager.getInstance().gameBoard().removePiece(this);
    }

}
