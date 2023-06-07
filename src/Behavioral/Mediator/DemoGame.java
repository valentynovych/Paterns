package Behavioral.Mediator;

public class DemoGame {
    public static void main(String[] args) {
        ChessGame chessGame = new ChessGame();

        User referee = new Referee("Shon", chessGame);
        User player1 = new Player("Misha", chessGame);
        User player2 = new Player("Roma", chessGame);

        chessGame.setReferee(referee);
        chessGame.addPlayer(player1);
        chessGame.addPlayer(player2);

        player1.makeMove("A:2");
        player2.makeMove("F:4");
        player1.makeMove("D:6");
        player2.makeMove("E:1");
        referee.makeMove("Player 1, you win !!!! Congratulation!!!");
    }
}
