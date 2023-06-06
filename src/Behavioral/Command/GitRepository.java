package Behavioral.Command;

public class GitRepository {
    public void gitPull(){
        System.out.println(" git pull...");
    }
    public void gitAdd(){
        System.out.println(" git add .");
    }
    public void gitCommit(){
        System.out.println(" git commit -m \"message\"");
    }
    public void gitPush(){
        System.out.println(" git push");
    }
}
