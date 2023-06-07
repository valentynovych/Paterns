package Behavioral.State;

public class ChessGame {
    public static void main(String[] args) {
        Activity activity = new Wait();
        Player player = new Player();
        player.setActivity(activity);

        for (int i = 0; i <= 40; i++){
            player.changeActivity(i);
            player.activity.execute();
        }
    }
}
