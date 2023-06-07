package Behavioral.Mediator;

import java.util.ArrayList;
import java.util.List;

public class ChessGame implements ChessBoard {
    User referee;
    List<User> players = new ArrayList<>();

    public void addPlayer(User player){
        players.add(player);
    }

    public void setReferee(User referee) {
        this.referee = referee;
    }

    @Override
    public void updateBoard(String message, User user) {
        for (User player : players){
            if (player != user ) {
                user.viewBoard(message);
            }
        }
        referee.viewBoard(message);
    }
}
