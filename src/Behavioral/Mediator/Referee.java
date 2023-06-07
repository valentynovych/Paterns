package Behavioral.Mediator;

public class Referee implements User {
    String name;
    ChessBoard chessBoard;

    public Referee(String name, ChessBoard chessBoard) {
        this.name = name;
        this.chessBoard = chessBoard;
    }

    @Override
    public void makeMove(String move) {
        chessBoard.updateBoard("Referee " + name + " announce : " + move, this);
    }

    @Override
    public void viewBoard(String message) {
        System.out.println("Referee " + name + " viewed update " + message);
    }
}
