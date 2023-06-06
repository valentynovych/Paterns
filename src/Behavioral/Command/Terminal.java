package Behavioral.Command;

public class Terminal {
    Command pull;
    Command add;
    Command commit;
    Command push;

    public Terminal(Command pull, Command add, Command commit, Command push) {
        this.pull = pull;
        this.add = add;
        this.commit = commit;
        this.push = push;
    }
    public void gitPull(){
        pull.execute();
    }
    public void gitAdd(){
        add.execute();
    }
    public void gitCommit(){
        commit.execute();
    }
    public void gitPush(){
        push.execute();
    }
}
