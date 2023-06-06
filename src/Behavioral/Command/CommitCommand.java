package Behavioral.Command;

public class CommitCommand implements Command{
    GitRepository repository;

    public CommitCommand(GitRepository repository) {
        this.repository = repository;
    }

    @Override
    public void execute() {
        System.out.print("Execute command:");
        repository.gitCommit();
    }
}
