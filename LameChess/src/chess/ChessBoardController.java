package chess;

/**
 * Created by Bardia
 * on 10/10/2017.
 */

public class ChessBoardController {

    ChessBoard model;

    public void setAt(ChessPiece piece) {
        model.setAt(piece);
    }

    public void removeAt(Vector2 position) {
        board[position.x][position.y] = null;
    }

    public void removePiece(ChessPiece piece) {
        board[piece.getPosition().x][piece.getPosition().y] = null;
    }

    public void setup() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = null;
            }
        }
        board[0][0] = new Rook(new Vector2(0,0), Color.white);
        board[0][7] = new Rook(new Vector2(0,7), Color.black);
        board[7][0] = new Rook(new Vector2(7,0), Color.white);
        board[7][7] = new Rook(new Vector2(7,7), Color.black);
        board[1][0] = new Knight(new Vector2(1,0), Color.white);
        board[1][7] = new Knight(new Vector2(1,7), Color.black);
        board[6][0] = new Knight(new Vector2(6,0), Color.white);
        board[6][7] = new Knight(new Vector2(6,7), Color.black);
        board[2][0] = new Bishop(new Vector2(2,0), Color.white);
        board[2][7] = new Bishop(new Vector2(2,7), Color.black);
        board[5][0] = new Bishop(new Vector2(5,0), Color.white);
        board[5][7] = new Bishop(new Vector2(5,7), Color.black);
        board[3][0] = new Queen(new Vector2(3,0), Color.white);
        board[3][7] = new Queen(new Vector2(3,7), Color.black);
        board[4][0] = new King(new Vector2(4,0), Color.white);
        board[4][7] = new King(new Vector2(4,7), Color.black);

        for (int i = 0; i < 8; i++) {
            board[i][1] = new Pawn(new Vector2(i,1), Color.white);
            board[i][6] = new Pawn(new Vector2(i,6), Color.black);
        }
    }

    public ChessPiece getPieceAt(Vector2 position) {
        return board[position.x][position.y];
    }

    public void updateView() {

    }

}
