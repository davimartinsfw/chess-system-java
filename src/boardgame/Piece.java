package boardgame;

import chess.Color;

public class Piece{
    protected Position position;
    private Board board;

    public Piece(Board board, Color color) {
        this.board = board;
    }

    protected Board getBoard() {
        return board;
    }

}
