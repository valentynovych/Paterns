package Behavioral.Mediator;

public class Player implements User {
    private String name;
    private ChessBoard chessBoard;

    public Player(String name, ChessBoard chessBoard) {
        this.name = name;
        this.chessBoard = chessBoard;
    }

    @Override
    public void makeMove(String move) {
        chessBoard.updateBoard(name + " make a move: " + move, this);
    }

    @Override
    public void viewBoard(String message) {
        System.out.println(name + " viewed update " + message);
    }
}
