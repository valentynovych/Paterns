package Behavioral.Command;

public class PushCommand implements Command {
    GitRepository repository;

    public PushCommand(GitRepository repository) {
        this.repository = repository;
    }

    @Override
    public void execute() {
        System.out.print("Execute command:");
        repository.gitPush();
    }
}
