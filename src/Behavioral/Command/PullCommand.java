package Behavioral.Command;

public class PullCommand implements Command {
    GitRepository repository;
    public PullCommand(GitRepository repository) {
        this.repository = repository;
    }

    @Override
    public void execute() {
        System.out.print("Execute command:");
        repository.gitPull();
    }
}
