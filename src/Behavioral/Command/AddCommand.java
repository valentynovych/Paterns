package Behavioral.Command;

public class AddCommand implements Command {
    GitRepository repository;

    public AddCommand(GitRepository repository) {
        this.repository = repository;
    }

    @Override
    public void execute() {
        System.out.print("Execute command:");
        repository.gitAdd();
    }
}
