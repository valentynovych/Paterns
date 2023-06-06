package Behavioral.Command;

public class User {
    public static void main(String[] args) {
        GitRepository repository = new GitRepository();
        Terminal terminal = new Terminal(new PullCommand(repository),
                new AddCommand(repository),
                new CommitCommand(repository),
                new PushCommand(repository));

        terminal.gitPull();
        terminal.gitAdd();
        terminal.gitCommit();
        terminal.gitPush();
    }
}
