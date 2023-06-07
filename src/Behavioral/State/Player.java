package Behavioral.State;

public class Player {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
    public void changeActivity(int count){
        if (activity instanceof Wait){
            setActivity(new Think());
        } else if (activity instanceof Think) {
            setActivity(new Move());
        } else if (activity instanceof Move) {
            setActivity(new Wait());
        }
        if (count == 40){
            setActivity(new Win());
        }
    }
}
